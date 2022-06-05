package test;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Source {

 int marks;
  char gradingScheme;
  public char getGrades(int marks){
  char i;
        if(marks == 101)
        {
            i = 'X';
        }
        else if(marks >= 80 && marks <= 100)
        {
            i = 'A';
        }
        else if(marks >= 60 && marks < 80)
        {
            i = 'B';
        }
        else if(marks >= 40 && marks < 60)
        {
            i = 'C';
        }
        else if (marks > 0 && marks <= 39)
        {
            i = 'F';
        }
        else{

            i = 'X';
        }

        return i;
      
  }
  public static void main (String[] args) {
     
  }
}