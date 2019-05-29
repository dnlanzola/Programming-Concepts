   /***********************\
   *      Assignment 6     *
   * Daniel Anzola Delgado *
   \***********************/

//****************************************************************\\
// File: DriverTest.java                                         \\
//                                                                \\
// Purpose:                                                       \\
//   1.        \\
//   2.                                          \\
//   3.        \\
//                           \\
//                                                                \\
//****************************************************************\\

import java.util.*;

public class DriverTest 
{
   public static void main(String[] args) 
   {
      Movie mov1 = new Movie();
      
      String name;
      String genre;
      String note;
      
      int year;
      
      double rate;
      
      
      Scanner scan = new Scanner(System.in);
      
      
      System.out.printf("Enter the name of the movie: ");
      name = scan.nextLine;
      
      System.out.printf("Enter the year of the movie: ");
      year = scan.nextInt;
            
      System.out.printf("Enter the genre of the movie: ");
      genre = scan.nextLine;

      System.out.printf("Enter the rate of the movie: ");
      rate = scan.nextFloat;
      
      System.out.printf("Enter the name of the movie: ");
      note = scan.nextLine;
      
      Movie mov1 = new Movie(name,year,genre,rate,note);
     
      System.out.println(mov1);
   
   
   }
    
}