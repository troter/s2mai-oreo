package jp.troter.seasar.mai;

/**
 * メールオブジェクトの状態に応じてメールメッセージの種類を切り替えられる
 */
public interface MessageTypeSwichable {

    MailMessageType getMailMessageType();
}
