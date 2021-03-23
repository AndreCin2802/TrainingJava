package model.exceptions;

public class DomainException extends Exception {

    public int code;
    public DomainException(String msg, int code) {
        super(msg);
        this.code = code;

    }


}
