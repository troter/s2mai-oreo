package jp.troter.seasar.mai;

import com.ozacc.mail.Mail;

public enum MailMessageType {

    TEXT,
    HTML {
        public void apply(Mail mail) {
            // HTML形式の場合HtmlTextに本文を設定
            mail.setHtmlText(mail.getText());
            // HTML形式の場合textをNullに設定
            mail.setText(null);
        }
    },
    ;

    public void apply(Mail mail) {}
}
