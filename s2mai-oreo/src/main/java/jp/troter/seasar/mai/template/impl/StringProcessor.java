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

import org.seasar.mai.template.TemplateProcessor;

/**
 * S2Mai側ではテンプレートを利用しない場合のTemplateProcessor
 */
public class StringProcessor implements TemplateProcessor {

    @Override
    public void init() { }

    @Override
    public String processResource(String path, Object context) {
        return context.toString();
    }

    @Override
    public String process(String templateText, Object context) {
        return context.toString();
    }

    @Override
    public String getExt() { return null; }

}
