/*
 * Copyright 2011 Takumi IINO
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
