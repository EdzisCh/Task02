package by.chebotar.Exceptions;

public class InvalidPathException extends Exception {

  public InvalidPathException(){
    super("Invalid path");

  }

  public InvalidPathException(String massage, Throwable throwable){
    super(massage, throwable);
  }
}
