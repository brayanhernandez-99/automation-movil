package co.com.android.certification.app.exceptions;

public class MessageNotMatchException extends AssertionError {

    public MessageNotMatchException(String message, Throwable cause) {
        super(message, cause);
    }

}