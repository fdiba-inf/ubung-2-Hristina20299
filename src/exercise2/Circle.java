package exercise2;

import java.util.Scanner;

public class Circle {
  public static void main(String[] args) {
    int r = 420;
    Scanner input = new Scanner(System.in);
    double a = (2.0 * Math.PI * r);
    double b = (Math.PI * r * r);
    System.out.println("Circumference: " + a);
    System.out.println("Area: " + b);
  }
}
