   /***********************\
   *      Assignment 2     *
   * Daniel Anzola Delgado *
   \***********************/

//***************************************************************\\
//File: Ideal_Weight.java                                        \\
//                                                               \\
//Purpose: Determine the ideal weight for both males and females \\
//who are over 5 feet tall.                                      \\
//***************************************************************\\


import java.util.Scanner;

public class Ideal_Weight 
{
   public static void main(String[] args) 
   {
      /* ---VARIABLES & CONSTANTS--- */

      final int IDEAL_FEMALE = 100;
      final int IDEAL_MALE = 106;
      final int EXTRA_INCH_FEMALE = 5;
      final int EXTRA_INCH_MALE = 6;
      
      int feet = 0;
      int inches = 0;
      int totalInches = 0;
      int weightFemale = 0;
      int weightMale = 0;
      
      /* ---INPUT FROM USER--- */

      Scanner scan = new Scanner(System.in); 
      
      //SCANS FEET
      System.out.println("Enter weight");
      System.out.println("Feet:");
      feet = scan.nextInt();
      
      //SCANS INCHES
      System.out.println("Inches:");
      inches = scan.nextInt(); 
      
      /* ---CALCULATIONS--- */
      
      //CONVERSION FROM FT INCH TO INCH (1 FOOT = 12 INCHES)
      totalInches =  feet * 12;
      totalInches = totalInches - 60;
      totalInches = totalInches + inches;

      //IDEAL WEIGHT FEMALE
      weightFemale = (totalInches * EXTRA_INCH_FEMALE) + IDEAL_FEMALE;
      
      //IDEAL WEIGHT MALE
      weightMale = (totalInches * EXTRA_INCH_MALE) + IDEAL_MALE;
      
      /* ---RESULTS--- */
      
      //PRINTS IDEAL WEIGHT FOR FEMALE & MALE
      System.out.println("Ideal weight for a female: " + weightFemale + " pounds.");
      System.out.println("Ideal weight for a male: " + weightMale + " pounds.");
   
   
   }   
}   