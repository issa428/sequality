/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

public class App {
  public String getGreeting() {
    return "Hello World!";
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());

    int x = 2;
    int y = 3;
    System.out.println("Sum of " + x + " and " + y + " is " + new Calculate().sum(x, y, 0) + "." + "Average is "
        + new Calculate().average(new Calculate().sum(x, y, 0), 2) + ".");

    x = 1;
    y = 10;
    System.out.println("Sum of " + x + " to " + y + " is " + new Calculate().sum(x, y, 1) + "." + "Average is "
        + new Calculate().average(new Calculate().sum(x, y, 1), 10) + ".");

    System.out.println("Sum of odd " + x + " to " + y + " is " + new Calculate().sum(x, y, 2) + "." + "Sum of even is "
        + new Calculate().sum(x, y, 3) + ".");
  }
}
