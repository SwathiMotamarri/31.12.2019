package exceptions;

public class IncorrectAccountException extends RuntimeException {

    public IncorrectAccountException(String msg) {
        super(msg);
    }
}
