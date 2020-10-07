package exercise2;

import java.util.Scanner;

public class SumOfDigits {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a = 325;
    int b = 913;
    int c = 231;
    double d = 12.3913;
    double sum = (a + b + c + d);
    System.out.println("Sum of digits: " + sum);
  }
}