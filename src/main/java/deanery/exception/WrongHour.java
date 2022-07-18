package deanery.exception;

public class WrongHour extends Exception{
    public WrongHour(String errorMessage){
        super(errorMessage);
    }
}
