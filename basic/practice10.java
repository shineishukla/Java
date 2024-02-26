package basic;

//bitwise operators
class Main {
    public static void main(String[] args) {
  
      int number1 = 12, number2 = 25, number3=-6, result, result1, result2, result3, result4, result5, result6;
      result = number1 | number2;
      System.out.println(result);    // prints 29
      result1 = number1 & number2;
      System.out.println(result1);    // prints 8
      result2= number1 ^ number2;
      System.out.println(result2);    // prints 21
      result3= ~number1;
      System.out.println(result3);
      result4=number2<<2;
      System.out.println(result4);
      result5= number1 >>3;
      System.out.println(result5);
      result6= number3>>>3;
      System.out.println(result6);
    }
  }