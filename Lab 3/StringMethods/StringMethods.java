   /***********************\
   *      Assignment 3     *
   * Daniel Anzola Delgado *
   \***********************/

//***************************************************************\\
// File: StringMethods.java                                      \\
//                                                               \\
// Purpose: Manipulate two strings.                              \\
//   1. User will enter two phrases.                             \\
//   2. Program will show number of characters for each phrase.  \\
//   3. Program will concatenate the two phrases.                \\
//   4. Program will show the number of characters of the two    \\
//      phrases combined.                                        \\
//   5. Program will generate two substrings.                    \\
//   6. Program will replace all vowels with a space.            \\
//   7. Program will determine the position of the first vowel.  \\
//                                                               \\
//***************************************************************\\

import java.util.Scanner;

public class StringMethods
{   
    public static void main(String[] args)
    { 
      /* ---VARIABLES--- */
           
      String phraseA;
      String phraseB;
      String compPhrase;
      String subA;
      String subB;
      String modifiedPhrase;
      
      int counterA = 0;
      int counterB = 0;
      int counterC = 0;
      
      
      /* ---INPUTS FROM USER--- */
   
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Enter first phrase: ");
      phraseA = scan.nextLine();
      
      System.out.println("Enter second phrase: ");
      phraseB = scan.nextLine();
      
      
      /* ---PROCEDURES & RESULTS--- */
      
      //LENGTH OF STRING A & B
      counterA = phraseA.length();
      counterB = phraseB.length();
      
      ////PRINTS LENGTH OF STRING A & B
      System.out.println("Number of Characters:");
      System.out.println("- PhraseA: " + counterA + " characters");
      System.out.println("- PhraseB: " + counterB + " characters");
      
      
      
      //CONCATENATION OF STRING A & B
      compPhrase = phraseA + ";" + phraseB;
      
      ////PRINTS STRING A & B CONCATENATED
      System.out.println("\nPhrases Concatenated:");
      System.out.println(compPhrase);
      
      
      
      //LENGTH OF COMPPHRASE
      counterC = counterA + counterB + 1;
      
      ////PRINTS LENGTH OF COMPPHRASE
      System.out.println("\nNumber of characters after concatenation:");
      System.out.println(counterC + " characters");
      
      
      
      //GENERATION OF TWO SUBSTRINGS: SUBA & SUBB
      subA = phraseA.substring(1,3);
      subB = phraseB.substring(2,5);
      
      ////PRINTS THE TWO SUBSTRINGS
      System.out.println("\nSubstrings:");
      System.out.println("- SubA: " + subA);
      System.out.println("- SubB: " + subB);

      
      //REPLACEMENT OF VOWELS WITH A SPACE.
      modifiedPhrase = compPhrase;
      
      modifiedPhrase = modifiedPhrase.replace('a',' ');
      modifiedPhrase = modifiedPhrase.replace('A',' ');
      
      modifiedPhrase = modifiedPhrase.replace('e',' ');
      modifiedPhrase = modifiedPhrase.replace('E',' ');

      modifiedPhrase = modifiedPhrase.replace('i',' ');
      modifiedPhrase = modifiedPhrase.replace('I',' ');

      modifiedPhrase = modifiedPhrase.replace('o',' ');
      modifiedPhrase = modifiedPhrase.replace('O',' ');

      modifiedPhrase = modifiedPhrase.replace('u',' ');
      modifiedPhrase = modifiedPhrase.replace('U',' ');

      ////PRINTS PHRASE WITH VOWELS REPLACED WITH A SPACE
      System.out.println("\nPhrase with vowels replaced with a space:");
      System.out.println(modifiedPhrase);
      
      
      
      //PRINTS NUMBER OF CHARACTERS PRIOR THE FIRST VOWEL
      System.out.println("\nNumber of characters prior the first vowel: " + (modifiedPhrase.indexOf(' ')));
    }      
}   