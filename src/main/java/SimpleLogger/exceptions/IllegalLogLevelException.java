package SimpleLogger.exceptions;

public class IllegalLogLevelException extends Exception{
    public IllegalLogLevelException(){
        super("Unsupported Log Level");
    }
}
