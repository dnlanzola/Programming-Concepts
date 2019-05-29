   /***********************\
   *      Assignment 4     *
   * Daniel Anzola Delgado *
   \***********************/

//****************************************************************\\
// File: Extremes.java                                           \\
//                                                                \\
// Purpose:                                                       \\
//   1. Reads a integer number from keyboard representing a year. \\
//   2. Verifies if the entered year is a leap year.              \\
//   3. The program is able to make the following validations:    \\
//      3.1 - Validate year is greater or greater than 1582.      \\
//      3.2 - Year is divisible by 400 OR divisible by 4 AND NOT  \\
//            by 100.                                             \\
//                                                                \\
//****************************************************************\\

import java.util.*;

public class Extremes
{   
    public static void main(String[] args)
    { 
      /* ---VARIABLES--- */
      
      boolean first = false;
      
      int[] values = new int[10];
      
      int i = 0;
      
      int max = 0;
      int min = 0;
      
      int stopped = 0;
      
      double average = 0;
      
      
      
      
      Scanner scan = new Scanner(System.in);      
      
      
      while (i != 10)
      {
         System.out.printf("Enter number: ");
         values[i] = scan.nextInt();
         
         //////TEST
         //System.out.println("This is i: "+i);
         //System.out.println("This is the element: "+values[i]);
         //////////

         // VALIDATION: IF USER WANTS TO STOP THE INPUT OF NUMBERS
         if (values[i] == 0)
         {
            stopped = i;
            i = 10;
         }
         else
            i++;
         
         // VALIDATION: FIRST INPUT IS ZERO
         if (values[0] == 0)
            {
               i = 10;
               first = true;
            }   
            
      }

      if (first == true)
         System.out.println("ERROR: maximum, minimum and average values can't be computed because there is no input.");
      else
      {
      /////////////TEST VECTOR      
      i=0;
      System.out.println("This is the vector: ");
      while (i != stopped)
      {
         System.out.printf(values[i]+" ");
         i++;
      }      
      ////////////////////////
      
      i=0;
      System.out.println("Finding the max value: ");
      while (i != stopped)
      {
         if (values[i] > max)
         {
            max = values[i];
            i++;
         }
         else
            i++;
      }        
           
      System.out.println("\nThis is the max value: "+max);

      i=0;
      min = values[0];
      System.out.println("Finding the min value: ");
      while (i != stopped)
      {
         if (values[i] < min)
         {
            min = values[i];
            i++;
         }
         else
            i++;
      }        
           
      System.out.println("This is the min value: "+min);
      
      
      
      
      
     
     
      i=0;
   
      System.out.println("Finding the average: ");
      while (i != stopped)
      {
            average = average + values[i];
            i++;
      }   
      //System.out.println("average value: "+average); 
      //System.out.println("stopped value: "+stopped); 



      average = average / stopped;     
           
      System.out.println("This is the average value: "+average); 
      
      
      
      
      }
      
    }
}