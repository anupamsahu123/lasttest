package test;

import java.util.Scanner;

public class Calculator{
	   public static double sqrRoot(int num){
	       return Math.sqrt(num);
	   }

	   public static void main(String[] args) {
	       Scanner scan = new Scanner(System.in);
	       System.out.println("Enter the number:");
	       int num = scan.nextInt();
	       if(num<0){
	           System.out.println("Invalid input");
	       }
	       else{
	           System.out.println(sqrRoot(num));
	       }
	   }
	}