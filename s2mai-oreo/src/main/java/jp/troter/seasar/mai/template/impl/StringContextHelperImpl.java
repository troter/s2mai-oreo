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
