package jp.troter.seasar.mai;

import org.seasar.framework.container.S2Container;
import org.seasar.framework.container.factory.S2ContainerFactory;

public abstract class GenericSendMailFactory<T> {

    /**
     * インターフェースとCharsetから適切なdiconを読み込んでメール送信オブジェクトを返す。
     * @param clazz
     * @param charset
     * @return
     */
    @SuppressWarnings("unchecked")
    public T create(Class<T> clazz, SendMailCharset charset) {
        S2Container container = S2ContainerFactory.create(charset.getDiconPath(clazz));
        T mailSender = (T) container.getComponent(clazz);
        return mailSender;
    }
}
