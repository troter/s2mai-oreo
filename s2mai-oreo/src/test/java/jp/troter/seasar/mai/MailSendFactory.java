package jp.troter.seasar.mai;

public class MailSendFactory extends GenericSendMailFactory<MailSend>{
    
    public MailSend getMailSender() {
        return getMailSender(MailCharset.ISO_2022_JP);
    }

    public MailSend getMailSender(MailCharset charset) {
        return create(MailSend.class, charset);
    }
}
