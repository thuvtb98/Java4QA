package Lession19;


public class UseCustomException {
  private int num1;
  private int num2;

  public void setNum1(int num1) {
    this.num1 = num1;
  }

  public void setNum2(int num2) {
    this.num2 = num2;
  }

  public int divide2Num() throws CustomExceptionType { // must add throws custom exception here to use custom exception
    int divideResult = 1;

    try{
      divideResult = this.num1/this.num2;
      System.out.println("Result is: " + divideResult);
    }catch (Exception e){
      throw new CustomExceptionType(e.toString()); // use custom exception
    }

    return divideResult;
  }

  public static void main(String[] args) {
    int num1 = 1;
    int num2 = 0;

    UseCustomException useCustomException = new UseCustomException();
    useCustomException.setNum1(num1);
    useCustomException.setNum2(num2);

    //in main method we still have call try catch to catch exception again
    try {
      useCustomException.divide2Num();
      System.out.println("It run OK");
    }catch (Exception e){
      System.out.println("Error in this: " + e);
    }
  }
}
