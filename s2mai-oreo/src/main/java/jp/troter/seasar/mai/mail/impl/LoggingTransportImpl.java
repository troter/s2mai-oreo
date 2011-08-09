package jp.troter.seasar.mai.mail.impl;

import org.seasar.framework.log.Logger;
import org.seasar.mai.mail.MailExceptionHandler;
import org.seasar.mai.mail.SendMail;
import org.seasar.mai.mail.Transport;

import com.ozacc.mail.Mail;
import com.ozacc.mail.MailException;

public class LoggingTransportImpl implements Transport {

    private Logger logger = Logger.getLogger(LoggingTransportImpl.class);

    private MailExceptionHandler mailExceptionHandler;

    public void send(Mail mail, SendMail sendMail) {

        logger.debug("send mail...");
        logger.debug(mail);
        try {
            sendMail.send(mail);
        } catch (MailException e) {
            logger.error("failure send mail!");
            logger.error(mail);
            mailExceptionHandler.handle(e);
        }
        logger.debug("success send mail.");
    }

    public void setMailExceptionHandler(MailExceptionHandler mailExceptionHandler) {
        this.mailExceptionHandler = mailExceptionHandler;
    }
}
