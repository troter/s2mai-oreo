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
