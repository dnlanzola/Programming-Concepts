/***********************\
*      Assignment 1     *
* Daniel Anzola Delgado *
\***********************/

/* 
   INSTRUCTIONS:
   Compile the following code and report the number and types of error.
   If the code doesn’t compile due to error, submit the correct version of the code.



public class SimpleClass
{
   public static void main (String[] args)
   { 
      int x;
      x=0;
      system.out.println(5/x);      //  "system" first letter must be capitalized.
                                    //  "5/x" division by zero is not permitted.
   } 
}


------------------------------------------------------------
//  Summary of errors:                                    \\
//  1. "system" first letter must be capitalized.         \\
//  2. "5/x" division by zero is not permitted. Fixed by  \\
//  changing the assigned value of the variable "x" to 1. \\
------------------------------------------------------------

*/



//CODE FIXED
public class SimpleClass
{
   public static void main (String[] args)
   { 
      int x;                         //  Integer variable "x".
      x=1;                           //  Variable "x" gets the number 1 assigned.
      System.out.println(5/x);       //  Prints "5" since the value of x was changed to 1.    
   }
}   


