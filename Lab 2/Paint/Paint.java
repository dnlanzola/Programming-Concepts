   /***********************\
   *      Assignment 2     *
   * Daniel Anzola Delgado *
   \***********************/

//***************************************************************\\
//File: Paint.java                                               \\
//                                                               \\
//Purpose: Determine how much paint is needed to paint the walls \\
//of a room given its length, width, and height                  \\
//***************************************************************\\
import java.util.Scanner;


public class Paint
{

    public static void main(String[] args)
    {
        /* ---VARIABLES & CONSTANTS--- */
    
        final int COVERAGE = 350;                              
        final int WINDOWS_COVERAGE = 15;
        final int DOORS_COVERAGE = 20;

        int length = 0;                                        
        int width = 0;
        int height = 0;
        int windows = 0;
        int doors = 0;                 

        double totalSqFt = 0;                                  
        double paintNeeded = 0;                                
        
        
        /* ---INPUTS FROM USER--- */
        
	     Scanner scan = new Scanner(System.in);                 

        //SCANS LENGTH OF THE ROOM
        System.out.println("Enter dimensions of the room");
        System.out.println("Length: ");                        
        length = scan.nextInt();

        //SCANS WIDTH OF THE ROOM
        System.out.println("Width: ");                         
        width = scan.nextInt();

        //SCANS HEIGHT OF THE ROOM
        System.out.println("Height: ");                        
        height = scan.nextInt();

        //SCANS NUMBER OF WINDOWS        
        System.out.println("Enter number of windows: ");       
        windows = scan.nextInt();

        //SCANS NUMBER OF DOORS        
        System.out.println("Enter number of doors: ");         
        doors = scan.nextInt();

        /* ---CALCULATIONS--- */

        //WINDOWS & DOORS SQFT CALCULATION
        windows = windows * WINDOWS_COVERAGE;
        doors = doors * DOORS_COVERAGE;
        
        //TOTAL OF SQFT CONSIDERING THE NUMBER OF WINDOWS & DOORS
        totalSqFt = (length*height) + (length*height) + (width*height) + (width*height) - windows - doors;
   
        //TOTAL OF GALLONS OF PAINT NEEDED
        paintNeeded = totalSqFt / COVERAGE;
        
        /* ---RESULTS--- */

        //PRINTS DIMMENSIONS     
        System.out.println("\nDimmensions of the room:");
        System.out.println("- Lenght: " + length + " SqFt.");
        System.out.println("- Width: " + width + " SqFt.");
        System.out.println("- Height: " + height + " SqFt.");
        
        //PRINTS NUMBER OF WINDOWS & DOORS
        System.out.println("- Number of Windows: " + (windows/WINDOWS_COVERAGE));
        System.out.println("- Number of Doors: " + (doors/DOORS_COVERAGE));
        
        //PRINTS NUMBER OF GALLONS OF PAINT NEEDED
        // *NOTE: I used 'printf' for the last result because it allows me to choose
        //        how many decimals I want to display without modifying the variable.
        System.out.printf("\nGallons of paint needed:  %.2f gallons.", paintNeeded);     

    }
}