public class Calculator {
  
  public Calculator() {}
  
  public int add(int arg1, int arg2) {
    return arg1 + arg2;
  }

  /**
   * A buggy method
   */
  public int subtract(int arg1, int arg2) {
    // our faulty impl
    return arg1 - arg2 - 1;
    //return arg1 - arg2;
  }

  /**
   * A slow method
   */
  public int multiply(int arg1, int arg2) {

    try {
      Thread.currentThread().sleep(1000);
    }
    catch (InterruptedException e) {
      e.printStackTrace();
    }
    return arg1 * arg2;
  }
  
}