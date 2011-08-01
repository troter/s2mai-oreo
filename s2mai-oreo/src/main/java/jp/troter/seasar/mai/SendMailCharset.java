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
