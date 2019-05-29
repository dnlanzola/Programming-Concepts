   /***********************\
   *      Assignment 8     *
   * Daniel Anzola Delgado *
   \***********************/

//*******************************************************************\\
// File: Faculty.java Subclass of Person                             \\
//                                                                   \\
// Information:                                                      \\
//   1. Constructor - sets information for objects type              \\
//      Faculty with inputs from user.                               \\
//                                                                   \\
//*******************************************************************\\


public class Faculty extends Person
{
   /*--- VARIABLES ---*/
   private String position;
   private int hiringYear;
   private float annualSalary;
   
   
   /* ---CONSTRUCTOR METHOD--- */
   public Faculty(String newCategory, String newName, String newId, String newPosition, int newHireYear, float newAnnualSalary)
   {
      super(newCategory,newName,newId);
      
      position = newPosition;
      hiringYear = newHireYear;
      annualSalary = newAnnualSalary;
   }
   
   /* ---toString METHOD--- */
   public String toString()
   {
      //RETURNS DESCRIPTION OF THE PERSON (NAME, CATEGORY, ID NUMBER, POSITION, HIRING YEAR, ANNUAL SALARY)
      return super.toString() + "Position: " + position + "\n" + "Hiring Year: " + hiringYear + "\n" + "Annual Salary: $" + annualSalary;
   }

}