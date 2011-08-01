package jp.troter.seasar.mai;

import jp.troter.seasar.mai.MailSend.Mail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seasar.framework.unit.Seasar2;
import org.seasar.framework.util.TextUtil;
import org.seasar.mai.mail.MailAddress;

@RunWith(Seasar2.class)
public class SendMailTest {

    private String mailAddress;

    @Test
    public void smoke() {
        test(new MailSendFactory(), MailCharset.UTF_8);
        test(new MailSendFactory(), MailCharset.ISO_2022_JP);
    }

    public void test(MailSendFactory factory, MailCharset charset) {
        MailSend sender = factory.getMailSender(charset);
        sender.sendMail(createMailText(mailAddress, mailAddress, "テキストメールサンプル(" + charset.getCharset() + ")", TextUtil.readUTF8("sample.txt")));
        sender.sendMail(createMailHtml(mailAddress, mailAddress, "HTMLメールサンプル(" + charset.getCharset() + ")", TextUtil.readUTF8("sample.html")));
    }

    public Mail createMailText(String from, String to, String subject, String text) {
        return createMail(from, to, subject, text, false);
    }
    public Mail createMailHtml(String from, String to, String subject, String text) {
        return createMail(from, to, subject, text, true);
    }

    public Mail createMail(String from, String to, String subject, String text, boolean html) {
        Mail m = new Mail();
        m.setFrom(new MailAddress(from));
        m.setTo(to);
        m.setSubject(subject);
        m.setText(text);
        m.setHtml(html);
        return m;
    }

}
