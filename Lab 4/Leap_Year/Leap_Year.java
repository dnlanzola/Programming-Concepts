   /***********************\
   *      Assignment 4     *
   * Daniel Anzola Delgado *
   \***********************/

//****************************************************************\\
// File: Leap_Year.java                                           \\
//                                                                \\
// Purpose:                                                       \\
//   1. Reads a integer number from keyboard representing a year. \\
//   2. Verifies if the entered year is a leap year.              \\
//   3. The program is able to make the following validations:    \\
//      3.1 - Validate year is greater or greater than 1582.      \\
//      3.2 - Year is divisible by 4 AND NOT BY 100 OR divisible  \\
//            by 400.                                             \\
//                                                                \\
//****************************************************************\\

import java.util.Scanner;

public class Leap_Year
{   
    public static void main(String[] args)
    { 
      /* ---VARIABLE--- */
         
      int userYear = 0;
      
      /* ---INPUT FROM USER--- */
   
      Scanner scan = new Scanner(System.in);
      
      System.out.printf("Enter a year: ");
      userYear = scan.nextInt();
      
      
      /* ---PROCEDURES & RESULT--- */
      
      // (3.1) VALIDATION: INPUT FROM USER IS VERIFIED TO BE GREATER OR EQUAL TO 1582
      if (userYear >= 1582)
      {
         // (3.2) VALIDATION: (YEAR IS DIVISIBLE BY 4 AND NOT BY 100) OR (YEAR IS DIVISIBLE BY 400)               
         if(((userYear % 4 == 0) && (userYear % 100 != 0)) || (userYear % 400 == 0))
            //// PRINTS RESULT: IS A LEAP YEAR
            System.out.println(userYear + " is a leap year.");
         else
            //// PRINTS RESULT: IS NOT A LEAP YEAR
            System.out.println(userYear + " is not a leap year.");
      }
      else
         //// PRINTS ERROR IF YEAR IS LESS THAN 1582
         System.out.println("Error: Gregorian calendar was not adopted until 1582.");
    }
}    
    
      