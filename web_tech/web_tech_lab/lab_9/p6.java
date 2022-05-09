/*Write a program in Java to reverse the order of words in a string without using the reverse() method. */

import java.util.regex.Pattern;
public class p6 {
   public static void main(String[] args) {
      String str = "I live in BHUBENESHWAR";
      Pattern p = Pattern.compile("\\s");
      System.out.println("The original string is: " + str);
      String[] temp = p.split(str);
      String rev = "";
      for (int i = 0; i < temp.length; i++) {
         if (i == temp.length - 1)
         rev = temp[i] + rev;
         else
         rev = " " + temp[i] + rev;
      }
      System.out.println("The reversed string is: " + rev);
   }
}