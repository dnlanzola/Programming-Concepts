   /***********************\
   *      Assignment 3     *
   * Daniel Anzola Delgado *
   \***********************/

//***************************************************************\\
// File: MathMethods.java                                        \\
//                                                               \\
// Purpose:                                                      \\
//   1. Reads a float number from keyboard.                      \\
//   2. Prints the closest whole numbers (less and greater than).\\
//   3. Outputs both numbers as percentages.                     \\
//                                                               \\
//***************************************************************\\

import java.util.*;
import java.text.*;
import java.lang.Math;

public class MathMethods
{   
    public static void main(String[] args)
    { 
      /* ---VARIABLES--- */
      
      double number = 0;
      double rounded = 0;
      double greater = 0;
      double less = 0;

   
      Scanner scan = new Scanner(System.in);
      NumberFormat perFormat = NumberFormat.getPercentInstance();
      
      
      /* ---INPUT FROM USER--- */
      
      //SCANS THE FLOAT NUMBER FROM USER
      System.out.printf("Enter a float number: ");
      number = scan.nextDouble();


      /* ---PROCEDURES--- */

      //ROUNDS THE FLOAT NUMBER
      rounded = Math.round(number);
      
      //DETERMINATION OF 'GREATER' AND 'LESS' VARIABLES
      //    After rounding the number it will become whole.
      //    This sentence will determine if the whole number
      //    is greater or less than the float scanned from user.
      if (rounded > number)
      {
         greater = rounded;
         less = rounded - 1;
      }
      else
      {
         less = rounded;
         greater = rounded + 1;
      }
      
      
      /* ---RESULTS--- */
      
      //PRINTS THE CLOSEST WHOLE NUMBERS
      System.out.println("Closest whole numbers:");
      System.out.printf("- Greater than the input: %.2f",greater);
      System.out.printf("\n- Less than the input: %.2f",less);

      //PRINTS NUMBERS IN PERCENTAGE FORMAT
      System.out.printf("\n\nNumbers in percentage format:\n");
      System.out.println("- Greater than the input: " + perFormat.format(greater));
      System.out.println("- Less than the input: " + perFormat.format(less));
    }
}