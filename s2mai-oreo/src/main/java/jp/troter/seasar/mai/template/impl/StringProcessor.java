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
