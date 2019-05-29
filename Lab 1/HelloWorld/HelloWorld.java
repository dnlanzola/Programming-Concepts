/***********************\
*      Assignment 1     *
* Daniel Anzola Delgado *
\***********************/

/* 
   INSTRUCTIONS:
   Compile the following code and report the number and type of errors 
   Note: Class name was changed from "SimpleClass" to "HelloWorld"



public class HelloWorld 
{
   public static viod main (string[] args)//  "void" misspelled. 
                                           //  "string" first letter must be capitalized.
   { 
      system.out.println(“Hello World”):   //  " “ " illegal character.
                                           //  "system" first letter must be capitalized.
                                           //  " ; " expected at the end instead of " : ".
   } 
}

------------------------------------------------------
//  Summary of errors:                              \\
//  1. "void" misspelled                            \\
//  2. "string" first letter must be capitalized.   \\
//  3. "system" first letter must be capitalized.   \\
//  4. " “ " illegal character. Replaced with ' " ' \\                  
//  5. " ; " expected instead of " : "              \\
------------------------------------------------------
*/




//CODE FIXED
public class HelloWorld 
{
   public static void main(String[] args)
   { 
      System.out.println("Hello World");  
   } 
}