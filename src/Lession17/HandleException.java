package Lession17;

public class HandleException {

  private int num1;
  private int num2;

//  public HandleException(int num1, int num2) {
//    this.num1 = num1;
//    this.num2 = num2;
//  }

  public void setNum1(int num1) {
    this.num1 = num1;
  }

  public void setNum2(int num2) {
    this.num2 = num2;
  }

  public float divide2Num(){
    float divideResult = 1;

    try{
      divideResult = this.num1/this.num2;
      System.out.println("Result is: " + divideResult);
    }catch (Exception e){
      System.out.println("There is an error!");
      throw new ArithmeticException(e.toString()); // throw ArithmeticException when divide any number with 0
    }

    return divideResult;
  }

  public static void main(String[] args) {
    int num1 = 1;
    int num2 = 0;

    HandleException handleException = new HandleException();
    handleException.setNum1(num1);
    handleException.setNum2(num2);

    //in main method we still have call try catch to catch exception again
    try {
      handleException.divide2Num();
      System.out.println("It run OK");
    }catch (Exception e){
      System.out.println("Error in this: " + e);
    }
  }
}
