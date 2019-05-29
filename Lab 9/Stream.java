   /***********************\
   *      Assignment 9     *
   * Daniel Anzola Delgado *
   \***********************/

//*******************************************************************\\
// File: Stream.java                                                 \\
//                                                                   \\
// Information:                                                      \\
//   1. Constructor - sets information for objects type              \\
//      Stream from a String. The constructor will separate the      \\
//      numbers in the String, check if the line is valid, count     \\
//      even numbers and odd numbers. Also, it will initialize       \\
//      variables a, b, c, d and e from the separated numbers in     \\
//      the String line.                                             \\
//   2. Method IsEven - will receive a number and check if it is     \\
//      even.                                                        \\
//   3. Method IsOdd - will receive a number anc check if it is      \\
//      odd.                                                         \\
//                                                                   \\
//*******************************************************************\\

public class Stream
{
   /*--- VARIABLES ---*/
   private int a,b,c,d,e;
   private boolean validLine;
   private int countEven;
   private int countOdd;


   /* ---CONSTRUCTOR METHOD--- */
   public Stream(String cvs_str)
   {
      int i = 0;
      
      //ARRAY WITH NUMBERS FROM LINE
      String[] numbers = cvs_str.split(",");
         
         if (numbers.length == 5)
         {
            validLine = true;
            countEven = IsEven(numbers);
            countOdd = IsOdd(numbers);
            
            while (i < 5)
            {
               switch (i)
               {
                  case 0: a = Integer.parseInt(numbers[i]);
                          break;
                          
                  case 1: b = Integer.parseInt(numbers[i]);
                          break;
                          
                  case 2: c = Integer.parseInt(numbers[i]);
                          break;
                          
                  case 3: d = Integer.parseInt(numbers[i]);
                          break;
                          
                  case 4: e = Integer.parseInt(numbers[i]);
                          break;
               }
              
              i++;
            }              
         }
         else
            validLine = false;
   }
   
   
   /* ---IsEven METHOD--- */
   public int IsEven(String[] numbers)
   {
      int even = 0;
      int i = 0;
      int digit = 0;
   
      while (i < 5)
      {
         digit = Integer.parseInt(numbers[i]);
                 
         if (digit % 2 == 0)
            even++;
                  
         i++;
      }
   
      //RETURNS NUMBER OF EVEN NUMBERS IN LINE
      return even;
   }
   
   
   /* ---IsOdd METHOD--- */
   public int IsOdd(String[] numbers)
   {
      int odd = 0;
      int i = 0;
      int digit = 0;
   
   
      while (i < 5)
      {
         digit = Integer.parseInt(numbers[i]);
                 
         if (digit % 2 != 0)
            odd++;
                  
         i++;
      }
   
      //RETURNS NUMBER OF ODD NUMBERS IN LINE      
      return odd;   
   }
   
   
   public String toString()
   {
      //IF LINE IS VALID - RETURNS INFORMATION
      if (validLine == true)
         return a + "," + b + "," + c + "," + d + "," + e + "\n" + countEven + " even numbers were found in this line.\n" + countOdd + " odd numbers were found in this line.\n";
   
      //IF LINE IS INVALID - RETURNS ERROR MESSAGE
      return "Invalid Digit Stream.\n";
   }
   
}