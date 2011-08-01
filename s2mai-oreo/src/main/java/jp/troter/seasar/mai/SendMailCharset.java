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

import org.seasar.framework.util.StringUtil;

public interface SendMailCharset {
    /** メール送信用の文字コード */
    String getCharset();

    /** Charset別diconのパスを取得 */
    <T> String getDiconPath(Class<T> clazz);

    static public class Helper {
        public static <T> String getDiconPath(SendMailCharset charset, Class<T> clazz) {
            return String.format("%s_%s.dicon", StringUtil.decapitalize(clazz.getSimpleName()), charset.getCharset());
        }
    }
}
