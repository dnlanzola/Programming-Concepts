   /***********************\
   *      Assignment 2     *
   * Daniel Anzola Delgado *
   \***********************/

//***************************************************************\\
//File: Circle.java                                              \\
//                                                               \\
//Purpose: Calculate the area and circumference of two circles.  \\
//Also, calculate the change between these two circles.          \\
//                                                               \\
//NOTE: 'C1' and 'C2' are abbreviations of Circle 1 and Circle 2 \\
//respectively.                                                  \\
//***************************************************************\\

public class Circle 
{
   public static void main(String[] args) 
   {
     /* ---VARIABLES & CONSTANTS--- */

     final double PI = 3.14;

     int radiusC1;
     int radiusC2;
  
     double areaC1 = 0;
     double areaC2 = 0;
     double circunferenceC1 = 0;
     double circunferenceC2 = 0;
     double areaChange = 0;
     double circunferenceChange = 0;
     
     /* ---RADIUS VALUES--- */
         
     radiusC1 = 3;
     radiusC2 = 4;
     
     /* ---CALCULATIONS--- */

     //CIRCLE 1 - AREA & CIRCUNFERENCE
     areaC1 = PI * (double)radiusC1 * (double)radiusC1;    
     circunferenceC1 = 2 * PI * (double)radiusC1;

     //CIRCLE 2 - AREA & CIRCUNFERENCE
     areaC2 = PI * (double)radiusC2 * (double)radiusC2;
     circunferenceC2 = 2 * PI * (double)radiusC2;

     //CHANGES IN AREA & CIRCUNFERENCE
     areaChange = areaC1 / areaC2;
     circunferenceChange = circunferenceC1 / circunferenceC2;
     
     /* ---RESULTS--- */

     //NOTE: I used printf to display the results because it allows me to choose
     //      how many decimals I want to display without modifying the variables.

     //PRINTS CIRCLE 1 AREA & CIRCUNFERENCE
     System.out.println("Circle 1");
     System.out.printf("- Area: %.2f", areaC1);
     System.out.printf("\n- Circunference: %.2f", circunferenceC1);

     //PRINTS CIRCLE 2 AREA & CIRCUNFERENCE     
     System.out.println("\n\nCircle 2");
     System.out.printf("- Area: %.2f", areaC2);
     System.out.printf("\n- Circunference: %.2f", circunferenceC2);

     //PRINTS THE CHANGE IN AREA & CIRCUNFERENCE     
     System.out.printf("\n\nThe change in area is: %.2f", areaChange);
     System.out.printf("\nThe change in circunference is: %.2f", circunferenceChange);
   }
    
}