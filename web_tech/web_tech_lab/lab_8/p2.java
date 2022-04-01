/* 1. Define an interface Motor with a data member – capacity and two methods run() and consume(). 
Define a Java class “Washing machine‟ that implements the Motor interface and write the demo 
code to check the value of the interface data member through an object of the class. */

import java.util.Scanner;
interface motor {
 void run();
 int max_capacity = 10;
 void consume();
}
class washing_machine implements motor {
 Scanner input = new Scanner(System.in);
 int lt;
 public void consume() {
  System.out.println("litres of water available:");
  lt = input.nextInt();
 }
 public void run() {
  if (lt > max_capacity) {
      System.out.println("Litres not sufficient;can't run");
  } else {
   System.out.println("Litres sufficient,");
  }
 }
}
class p2{
 public static void main(String[] args) {
        motor a = new washing_machine();
  a.consume();
  a.run();
 }
}
