package activities;

public class CustomException extends Exception{
    private String message;

    public CustomException(String m){
        this.message = m;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
