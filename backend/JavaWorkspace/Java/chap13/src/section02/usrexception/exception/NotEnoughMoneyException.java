package section02.usrexception.exception;

public class NotEnoughMoneyException extends Exception{
    public NotEnoughMoneyException() {}

    public NotEnoughMoneyException(String message) {
        super(message);
    }
}
