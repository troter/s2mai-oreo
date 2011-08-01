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
