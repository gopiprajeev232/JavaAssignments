package Assignment8;

class UnderageException extends Exception {
    public UnderageException(String msg) {
        super(msg);
    }
}

class OverageException extends Exception {
    public OverageException(String msg) {
        super(msg);
    }
}

class IneligibleException extends Exception {
    public IneligibleException(String msg) {
        super(msg);
    }
}

class ExceptionHandler {
    void throwExceptions(int age) throws Exception {
        if(age > 0 && age<18)
            throw new UnderageException("You are underage!");

        else if(age>60)
            throw new OverageException("You are overage!");

        else if(age == -1)
            throw new Exception("You are ineligible.");

        else if(age == -2)
            throw new NullPointerException();
    }
}

public class CustomExceptions {
    public static void main(String[] args) {
        ExceptionHandler exceptionHandler = new ExceptionHandler();

        try {
            exceptionHandler.throwExceptions(-2);
        }

        catch(Exception e) {
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("Finally executing.");
        }
    }
}
