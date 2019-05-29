   /***********************\
   *      Assignment 4     *
   * Daniel Anzola Delgado *
   \***********************/

//****************************************************************\\
// File: Extremes.java                                            \\
//                                                                \\
// Purpose:                                                       \\
//   1. Reads integer numbers from keyboard (up to 10).           \\
//   2. Calculates minimum, maximum and average values.           \\
//   3. The program is able to make the following validations:    \\
//      3.1 - Output an error when the first number is zero.      \\
//      3.2 - If there is at least one valid input and user       \\
//            inputs zero, the program stops asking for numbers.  \\
//   4. The output for the average value is formatted to show     \\
//      with four decimal places.                                 \\
//                                                                \\
//****************************************************************\\

import java.util.*;
import java.text.*;

public class Extremes
{   
    public static void main(String[] args)
    { 
      /* ---VARIABLES--- */
      
      boolean error = false;
      boolean first = true;
      boolean stop = false;

      double avg = 0;

      int i = 0;
      int max = 0;
      int min = 1;
      int totalNum = 0;
      int value = 0;
              
      
      /* ---INITIALIZATION OF OBJECTS--- */
    
      Scanner scan = new Scanner(System.in);
      
      // DECIMAL FORMAT SET TO FOUR DECIMALS
      DecimalFormat fmt = new DecimalFormat("0.####");
      
      
      /* ---PROCEDURES--- */
      
      while (stop == false)
      {
         if (i != 10)
         {
            // USER INPUTS THE NUMBER
            System.out.printf("Enter number: ");
            value = scan.nextInt();
            
            // VALIDATION: IF THE INPUT IS ZERO
            if (value == 0)
            {
               //// VALIDATION: IF IT IS THE FIRST INPUT
               if (first == true)
               {
                  System.out.println("ERROR: maximum, minimum and average values can't be computed because there is no input.");
                  error = true;
                  stop = true;
                  i = 10;
               }
               //// VALIDATION: IF IT IS NOT THE FIRST INPUT THE 
               ////             PROGRAM WILL STOP ASKING NUMBERS
               else
               {    
                  stop = true;
                  totalNum = i;
                  i = 10;
               }
            }
            // VALIDATION: IF THE INPUT IS NOT ZERO   
            else
            {
               //// IF IT IS THE FIRST NUMBER IT WILL SET THE NUMBER AS
               //// THE MINIMUM
               if (first == true)
               {
                  min = value;
                  first = false;
               }
               
               //// CALCULATING THE MAX VALUE
               if (value > max)
                  max = value;
               
               //// CALCULATING THE MIN VALUE
               if (value < min)
                  min = value;
               
               //// CALCULATING THE AVERAGE VALUE
               avg = avg + value;
               
               //// VARIABLE FOR THE TOTAL OF NUMBERS INSERTED
               //// BY USER.
               totalNum = i;
               
               i++;
            }
            
            // AFTER INSERTING THE FIRST NUMBER THIS VARIABLE WILL
            // SPECIFY THAT THERE IS AT LEAST ONE VALID INPUT
            first = false;
            
         }
         else
         {
            totalNum = 10;
            stop = true;
         }   
         
      }     

      
      /* ---RESULTS--- */
     
      // IF THE FIRST INPUT WAS NOT ZERO IT WILL PRINT RESULTS
      if (error == false)
      {  
         //// PRINTS MAX VALUE
         System.out.println("MAX value: "+max);
         
         //// PRINTS MIN VALUE
         System.out.println("MIN value: "+min);
         
         //// PRINTS THE AVERAGE VALUE
         System.out.println("AVERAGE value: "+fmt.format((avg/totalNum)));
      }
    }
}