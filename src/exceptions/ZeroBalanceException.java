package exceptions;

public class ZeroBalanceException extends RuntimeException 
{
	public ZeroBalanceException(String msg) {
        super(msg);
}
}
