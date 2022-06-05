package test;

import java.util.Scanner;
import java.util.Vector;

public class partitionNegPosTest {
	
	static boolean oppositeSigns(int x, int y)
	{
	    return ((x ^ y) < 0);
	}
	
	   public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       int n = sc.nextInt();
	       int arr[] = new int[n];
	       for (int i = 0; i < n; i++) {
	           arr[i] = sc.nextInt();
	       }
	       partitionNegativeAndPositive(n, arr);
	   }

	   // Method to partition negative and positive numbers without comparing with 0
	   static void partitionNegativeAndPositive(int n, int arr[]) {
		    Vector<Integer> a = new Vector<Integer>();
		    Vector<Integer> b = new Vector<Integer>();
		 
		    // Push first element to a.
		    a.add(arr[0]);
		 
		    // Now put all elements of same sign
		    // in a[] and opposite sign in b[]
		    for (int i = 1; i < n; i++)
		    {
		        if (oppositeSigns(a.get(0), arr[i]))
		            b.add(arr[i]);
		        else
		            a.add(arr[i]);
		    }
		 
		    // Print a[] and b[]
		    for (int i = 0; i < a.size(); i++)
		        System.out.print(a.get(i) + " ");
		    System.out.println("");
		    
		    if (b.size() > 0) {
	            for (int i = 0; i < b.size(); i++) {
	                System.out.print(b.get(i) + " ");
	            }
	        } else {
	           if (arr[0] > -1) {
	               System.out.println("Array doesn't have negative numbers");
	           } else
	               System.out.println("Array doesn't have positive numbers");
	       }
		}
	}
