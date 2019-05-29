   /***********************\
   *      Assignment 5     *
   * Daniel Anzola Delgado *
   \***********************/

//****************************************************************\\
// File: RandomArray.java                                         \\
//                                                                \\
// Purpose:                                                       \\
//   1. Fills an array with random numbers (range: 0 to 9).       \\
//   2. Prints the array.                                         \\
//   3. Asks user for an integer value. This value will be        \\
//      searched within the array. If the number is found it      \\
//      will print its location.                                  \\
//   4. The program will count and print how many times each      \\
//      value from 0 to 9 was ocurred.                            \\
//                                                                \\
//****************************************************************\\

import java.util.*;

public class RandomArray
{   
    public static void main(String[] args)
    { 
      /* ---VARIABLES--- */

      int[] count = new int[10];
      
      int[][] matrix = new int[5][5];
      
      int i = 0;
      int j = 0;
      int k = 0;
      int target = 0;
      
      /* ---INITIALIZATION OF OBJECTS--- */
      
      Random generator = new Random();
      
      Scanner scan = new Scanner(System.in);
      
      
      /* ---PROCEDURES & RESULTS--- */

      //FILL THE 1D ARRAY WITH ZEROS
      while (i != 10)
      {
         count[i] = 0;
         i++;
      } 

      
      //FILL THE 2D ARRAY WITH RANDOM NUMBERS
      i = 0;
      while (i != 5)
      {
         j = 0;
         while (j != 5)
         {
            matrix[i][j] = generator.nextInt(10);  
            j++;
         }
         i++;
      }      
      
      
      //PRINT ARRAY
      i = 0;
      System.out.println("This is a random 5x5 two-dimension array:");
      
      while (i != 5)
      {
         j = 0;
         while (j != 5)
         {
            System.out.printf(matrix[i][j]+"  ");  
            j++;        
         }
         System.out.printf("\n");
         i++;
      }         

      
      //READS INTEGER NUMBER FROM USER.
      System.out.printf("Please enter the target number: ");
      target = scan.nextInt();


      //FINDS THE NUMBER IN THE ARRAY AND PRINTS ITS LOCATION
      i = 0;
      while (i != 5)
      {
         j = 0;
         while (j != 5)
         {
            if (matrix[i][j] == target)
            {
               System.out.printf("Target found at [%d][%d]\n",i,j);  
               j++;
            }
            else
               j++;       
         }
         i++;
      } 
      

      //FINDS HOW MANY TIMES EACH NUMBER OCURRED AND SAVES IT IN
      //THE count ARRAY.
      while (k != 10)
      {
         i = 0;
         while (i != 5)
         {
            j = 0;
            while (j != 5)
            {
               if (matrix[i][j] == k)
               {
                  count[k] = count[k] + 1;
                  j++;
               }
               else
                  j++;       
            }
            i++;
         }
         k++;
       }         
      
      
      //PRINTS THE COUNT OF HOW MANY TIMES EACH NUMBER OCURRED
      System.out.println("\nThe counting of numbers in the array:");
      System.out.println("Value  -  Counts");
      
      i = 0;
      while (i != 10)
      {
         System.out.printf("  %d ------- %d\n",i,count[i]);
         i++;
      } 
    
    }
}