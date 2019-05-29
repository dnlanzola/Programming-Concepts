   /***********************\
   *      Assignment 6     *
   * Daniel Anzola Delgado *
   \***********************/

//*****************************************************************\\
// File: DriverTest.java                                           \\
//                                                                 \\
// Purpose:                                                        \\
//   1. Create an object of the Movie class.                       \\
//   2. Print the movie information.                               \\
//   3. Print if the movie is recommended based on the rate given  \\
//      by the user.                                               \\
//                                                                 \\
//*****************************************************************\\

import java.util.*;

public class DriverTest 
{
   public static void main(String[] args) 
   {  
      /* ---VARIABLES--- */
          
      double rate;
      
      int year;

      String name;
      String genre;
      String note;
      
      Scanner scan = new Scanner(System.in);
      
      
      /* ---INPUTS FROM USER--- */
      
      //SCANS NAME OF MOVIE
      System.out.printf("Enter the name of the movie: ");
      name = scan.nextLine();
      
      //SCANS YEAR OF MOVIE
      System.out.printf("Enter the year of the movie: ");
      year = scan.nextInt();
      
      //SCANS GENRE OF MOVIE
      scan.nextLine();      
      System.out.printf("Enter the genre of the movie: ");
      genre = scan.nextLine();
      
      //SCANS RATE OF MOVIE
      System.out.printf("Enter the rate of the movie: ");
      rate = scan.nextFloat();
      
      //SCANS COMMENTS ABOUT MOVIE
      scan.nextLine();
      System.out.printf("Enter the comments about the movie: ");
      note = scan.nextLine();
      
      
      /* ---PROCEDURES & RESULTS ---*/
      
      //CREATION OF OBJECT TYPE MOVIE
      Movie mov1 = new Movie(name,year,genre,rate,note);
       
      //PRINTS DESCRIPTION OF MOVIE USING toString() METHOD IN Movie.java
      System.out.println(mov1);
           
      //PRINTS RECOMMENDATION OF MOVIE USING Recommendation() METHOD IN Movie.java
      System.out.println(mov1.Recommendation());

   }
    
}