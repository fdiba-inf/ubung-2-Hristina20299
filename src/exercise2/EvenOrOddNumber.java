package exercise2;

public class EvenOrOddNumber {
  public static void main(String[] args) {
    int a = 5;
    boolean number = a % 2 == 0;
    if (number) {
      System.out.println("Number is even");
    } else {
      System.out.println("Number is odd");
    }
  }
}