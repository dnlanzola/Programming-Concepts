   /***********************\
   *      Assignment 9     *
   * Daniel Anzola Delgado *
   \***********************/

//****************************************************************\\
// File: StreamTest.java                                          \\
//                                                                \\
// Purpose:                                                       \\
//   1. Read a comma-separated file with numbers in each line.    \\        
//   2. Read name of file from user.                              \\
//   3. Print each line of file and print number of even digits   \\
//      and odd digits.                                           \\
//   4. If file is not found the program will print an error      \\
//      and end the program.                                      \\
//   5. If line has missing elements the program will print an    \\
//      error message for thar line.                              \\
//                                                                \\
//****************************************************************\\

import java.util.*; 
import java.io.*; 

public class StreamTest
{
   public static void main(String[] args) 
   {
      /*--- VARIABLES ---*/
      
      int i = 1;
      
      String directory = "";
      
      Scanner scan = new Scanner(System.in);
   
      /*--- INPUT FROM USER ---*/
      
      //READ NAME OF FILE FROM USER
      System.out.print("Please enter file name: ");
      directory = scan.nextLine();
      
      /*--- PROCEDURES & RESULTS ---*/
      try         
      {             
         File file = new File(directory);     
         Scanner fileScanner = new Scanner(file);
         System.out.print("\n"); 
                                    
         //READS UNTIL END OF FILE
         while (fileScanner.hasNext())  
         {                 
            String lineFile = fileScanner.nextLine();                 
            Stream lineClass = new Stream(lineFile);
               
            //PRINTS INFORMATION OF LINE
            System.out.println("Line "+ i +":");                 
            System.out.println(lineClass); 
            i++;            
         }         
      }
      catch (FileNotFoundException ex)         
      {   
         //PRINTS ERROR MESSAGE IF FILE IS NOT FOUND          
         System.out.println("\nFile " + directory + " was not found.");
      }  
   
      //PRINTS END OF THE PROGRAM MESSAGE
      System.out.println("\nProgram Complete.");
   
   }
}   