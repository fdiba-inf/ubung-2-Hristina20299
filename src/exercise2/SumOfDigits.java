package exercise2;

import java.util.Scanner;

public class SumOfDigits {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Values: ");
    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt();
    double sum = (a + b + c);
    System.out.println("Sum of digits: " + sum);
  }
}