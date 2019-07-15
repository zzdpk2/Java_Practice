package exception.myexception;


// Self-defined exception
public class RegisterException extends Exception{

    public RegisterException() {
    }

    public RegisterException(String message){
        super(message);
    }

}
