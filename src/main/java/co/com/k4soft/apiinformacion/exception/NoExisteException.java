package co.com.k4soft.apiinformacion.exception;

public class NoExisteException extends RuntimeException{

    public NoExisteException(String mensaje){
        super(mensaje);
    }
}
