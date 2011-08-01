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

public enum MailCharset implements SendMailCharset {

    ISO_2022_JP("ISO-2022-JP"),
    UTF_8("UTF-8"),
    ;

    private String charset;
    MailCharset(String charset) {
        this.charset = charset;
    }

    @Override public String getCharset() { return charset; }
    @Override public <T> String getDiconPath(Class<T> clazz) {
        return Helper.getDiconPath(this, clazz);
    }
}
