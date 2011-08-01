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
package jp.troter.seasar.mai;

import java.io.Serializable;

import jp.troter.seasar.mai.template.StringTemplate;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.seasar.mai.mail.AttachedFile;
import org.seasar.mai.mail.MailAddress;

public interface MailSend {

    void sendMail(Mail mail);

    /**
     * メール
     */
    public static class Mail implements Serializable, MessageTypeSwichable, StringTemplate {
        private static final long serialVersionUID = 1L;

        @Override
        public String toString(){
            return ReflectionToStringBuilder.toString(this);
        }

        /** 送信者 */
        private MailAddress from;

        /** 名前 */
        private String name;

        /** 宛先用 */
        private String to;

        /** CC用配列 */
        private String[] cc;

        /** BCC用配列 */
        private String[] bcc;

        /** reply to */
        private String replyTo;

        /** サブジェクト */
        private String subject;

        /** 本文用 */
        private String text;

        /** メール本文形式（true:html形式、false:テキスト形式) */
        private boolean html = false;

        /** 添付ファイル */
        private AttachedFile file;

        public MailMessageType getMailMessageType() {
            return html ? MailMessageType.HTML : MailMessageType.TEXT;
        }

        // 以下自動生成 --------------------------------------------------

        public MailAddress getFrom() {
            return from;
        }

        public void setFrom(MailAddress from) {
            this.from = from;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTo() {
            return to;
        }

        public void setTo(String to) {
            this.to = to;
        }

        public String[] getCc() {
            return cc;
        }

        public void setCc(String[] cc) {
            this.cc = cc;
        }

        public String[] getBcc() {
            return bcc;
        }

        public void setBcc(String[] bcc) {
            this.bcc = bcc;
        }

        public String getReplyTo() {
            return replyTo;
        }

        public void setReplyTo(String replyTo) {
            this.replyTo = replyTo;
        }

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public boolean isHtml() {
            return html;
        }

        public void setHtml(boolean html) {
            this.html = html;
        }

        public AttachedFile getFile() {
            return file;
        }

        public void setFile(AttachedFile file) {
            this.file = file;
        }
   }
}