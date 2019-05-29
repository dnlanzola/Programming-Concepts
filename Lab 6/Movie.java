   /***********************\
   *      Assignment 6     *
   * Daniel Anzola Delgado *
   \***********************/

//*****************************************************************\\
// File: Movie.java                                                \\
//                                                                 \\
// Information:                                                    \\
//   1. Class Movie contains Name, Year, Genre, Rate and Comments. \\
//   2. Constructor Method: initializes variables.                 \\
//   3. toString Method: returns a description of the movie.       \\
//   4. Recommendation Method: returns a recommendation of the     \\
//      movie based on the rate.                                   \\
//                                                                 \\
//*****************************************************************\\

import java.text.*;

public class Movie
{  
   /* ---VARIABLES--- */

   private double rate;

   private int year;
 
   private String name;
   private String genre;
   private String note; 

   
   /* ---CONSTRUCTOR METHOD--- */
   public Movie(String newName, int newYear, String newGenre, double newRate, String newNote)
   {
      name = newName;
      year = newYear;
      genre = newGenre;
      rate = newRate;
      note = newNote;    
   }
   
   /* ---toString METHOD--- */
   public String toString()
   {
      //INITIALIZATION OF FORMAT OBJECT. "rate" VARIABLE IS FORMATTED TO HAVE ONE DECIMAL PLACE.
      DecimalFormat fmt = new DecimalFormat("0.#");
      
      //RETURNS DESCRIPTION OF THE MOVIE (NAME, YEAR, GENRE, RATE, COMMENTS)
      return "\n--- Movie Information ---\nName: " + name + "\n" + "Year: " + year + "\n" + "Genre: " + genre + "\n" + "Rate: " + fmt.format(rate) + "\n" + "Comments: " + note + "\n";
   }
   
   /* ---Recommendation METHOD--- */
   public String Recommendation()
   {  
      System.out.printf("--- Movie Recommendation ---\n");
      
      //RATE OF MOVIE - RANGE: 8.0 - 10.0
      if (rate >= 8.0 && rate <= 10.0)
         return "Awesome Movie";
      
      //RATE OF MOVIE - RANGE: 5.0 - 7.9   
      if (rate >= 5.0 && rate < 8.0)
         return "The movie was good";
         
      //RATE OF MOVIE - RANGE: 0.0 - 4.9
      return "Bad Movie";   
   }
      
}
   
   
   
