/*
 * Copyright 2011 Takumi IINO
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jp.troter.seasar.mai;

import org.seasar.framework.container.S2Container;
import org.seasar.framework.container.factory.S2ContainerFactory;
import org.seasar.framework.container.factory.SingletonS2ContainerFactory;

public abstract class GenericSendMailFactory<T> {

    /**
     * インターフェースとCharsetから適切なdiconを読み込んでメール送信オブジェクトを返す。
     * @param clazz
     * @param charset
     * @return
     */
    public T create(Class<T> clazz, SendMailCharset charset) {
        return create(SingletonS2ContainerFactory.getContainer(), clazz, charset);
    }

    /**
     * インターフェースとCharsetから適切なdiconを読み込んでメール送信オブジェクトを返す。
     * @param parent
     * @param clazz
     * @param charset
     * @return
     */
    @SuppressWarnings("unchecked")
    public T create(S2Container parent, Class<T> clazz, SendMailCharset charset) {
        S2Container container = null;
        if (parent == null) {
            container = S2ContainerFactory.create(charset.getDiconPath(clazz));
        } else {
            container = S2ContainerFactory.include(parent, charset.getDiconPath(clazz));
        }
        T mailSender = (T) container.getComponent(clazz);
        return mailSender;
    }
}
