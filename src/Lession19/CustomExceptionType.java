package Lession19;

public class CustomExceptionType extends Exception{
  private static String CustomErrMsg = "Have an error here!!!";

  public CustomExceptionType(String error){
    super(CustomErrMsg);
    //just an example for custom Exception
  }
}
