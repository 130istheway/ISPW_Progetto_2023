package singleton;

import java.util.Scanner;

public class MyScanner{
   private static Scanner scanner = new Scanner(System.in);

   //Get the only object available
   public static Scanner getInstance(){
      return scanner;
   }
}