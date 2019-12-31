package exceptions;

public class IncorrectGuestIdException extends RuntimeException {

    public IncorrectGuestIdException(String msg)
    {
        super(msg);
    }
}
