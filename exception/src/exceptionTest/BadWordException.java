package exceptionTest;

// RuntimeException은 컴파일러가 검사하지 않음.
public class BadWordException extends RuntimeException{
	public BadWordException() {;}
	public BadWordException(String message) {
		super(message);
	}
	
}
