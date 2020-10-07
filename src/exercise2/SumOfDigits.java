package exercise2;

import java.util.Scanner;

public class SumOfDigits {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Values: ");
    int a = input.nextInt();
    int b = a % 10;
    int c = (a / 10) % 10;
    int d = (a / 100) % 10;
    int sum = b + c + d;
    System.out.println("Sum of digits: " + sum);
  }
}