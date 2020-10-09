package exercise2;

import java.util.Scanner;

public class QuadraticEquation {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("a, b, c: ");
    double a = input.nextInt();
    double b = input.nextInt();
    double c = input.nextInt();
    if (a != 0) {
      double d = ((b * b) - (4 * a * c));
      if (d >= 0) {
        double xeins = ((-b - Math.sqrt(d)) / (2 * a));
        double xzwei = ((-b + Math.sqrt(d)) / (2 * a));
        System.out.println(xeins + ", " + xzwei);
      } else {
        System.out.println("Imaginary values");
      }
    } else {
      if (b != 0) {
        double x = -(c/b);
        System.out.println("x = " + x);
      } else {
        if (c != 0) {
          System.out.println("No values");
        } else {
          System.out.println("Many values");
        }
      }
    }
  }
}