package exercise2;

import java.util.Scanner;

public class QuadraticEquation {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a = 2;
    int b = 7;
    int c = 2;
    if (a != 0) {
      double d = ((b * b) - (4 * a * c));
      if (d >= 0) {
        double xeins = (-b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
        double xzwei = (-b + Math.sqrt((b * b) + (4 * a * c))) / (2 * a);
        System.out.println("x1 = " + xeins);
        System.out.println("x2 = " + xzwei);
      } else {
        System.out.println("Imaginary values");
      }
    } else {
      if (b != 0) {
        double x = (-c / b);
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