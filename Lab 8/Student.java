   /***********************\
   *      Assignment 8     *
   * Daniel Anzola Delgado *
   \***********************/

//*******************************************************************\\
// File: Student.java Subclass of Person                             \\
//                                                                   \\
// Information:                                                      \\
//   1. Constructor - sets information for objects type              \\
//      Student with inputs from user.                               \\
//   2. YearsToGraduate Method - returns the number of years left    \\
//      for the student to graduate.                                 \\
//   3. YearsSinceAdmitted Method - return the number of years       \\
//      since the student was admitted.                              \\
//                                                                   \\
//*******************************************************************\\


public class Student extends Person
{
   /*--- VARIABLES ---*/
   private float GPA;
   private int admYear;
   private int currentYear;
   private int expGraduation;
   
   /* ---CONSTRUCTOR METHOD--- */
   public Student(String newCategory, String newName, String newId, float newGPA, int newAdmYear, int newCurrentYear, int newExpGraduation)
   {
      super(newCategory,newName,newId);
      
      GPA = newGPA;
      admYear = newAdmYear;
      currentYear = newCurrentYear;
      expGraduation = newExpGraduation;
   }
   
   /* ---YearsToGraduate METHOD--- */
   private int YearsToGraduate()
   {
      //RETURNS NUMBER OF YEARS LEFT TO GRADUATE
      return (expGraduation - currentYear);
   }
   
   /* ---YearsSinceAdmitted METHOD--- */   
   private int YearsSinceAdmitted()
   {
      //RETURNS NUMBER OF YEARS SINCE ADMITTED
      return (currentYear - admYear);
   }

   /* ---toString METHOD--- */
   public String toString()
   {
      //RETURNS DESCRIPTION OF THE STUDENT (NAME, CATEGORY, ID NUMBER, GPA, ADMISSION YEAR, CURRENT YEAR, EXPECTED GRADUATION, YEARS SINCE ADMITTED, YEARS LEFT TO GRADUATE)
      return super.toString() + "GPA: " + GPA + "\n" + "Admission Year: " + admYear + "\n" + "Current Year: " + currentYear + "\n" + "Expected Graduation: " + expGraduation + "\nYears since admitted: " + YearsSinceAdmitted() + " year(s)" + "\nYears left to graduate: " + YearsToGraduate() + " year(s)";
   }

}