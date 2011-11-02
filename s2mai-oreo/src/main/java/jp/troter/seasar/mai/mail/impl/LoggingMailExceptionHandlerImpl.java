package jp.troter.seasar.mai.mail.impl;

import org.seasar.framework.log.Logger;
import org.seasar.mai.mail.MailExceptionHandler;

import com.ozacc.mail.MailException;

public class LoggingMailExceptionHandlerImpl implements MailExceptionHandler {

    private Logger logger = Logger.getLogger(LoggingMailExceptionHandlerImpl.class);

    private boolean ignoreException = false;

    @Override
    public void handle(MailException e) {
        logger.log(e);
        if (! ignoreException) {
            throw e;
        }
    }

    public void setIgnoreException(boolean ignoreException) {
        this.ignoreException = ignoreException;
    }
}
