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
package jp.troter.seasar.mai.template.impl;

import jp.troter.seasar.mai.template.StringTemplate;

import org.seasar.mai.template.ContextHelper;

public class StringContextHelperImpl implements ContextHelper {

    @Override
    public Object createContext(Object data) {
        if (data instanceof StringTemplate) {
            return ((StringTemplate)data).getText();
        }
        throw new RuntimeException("このテンプレートを利用する場合、メールオブジェクトは[" + StringTemplate.class.getName() + "]を継承する必要があります。");
    }

}
