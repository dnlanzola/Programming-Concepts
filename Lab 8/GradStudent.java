   /***********************\
   *      Assignment 8     *
   * Daniel Anzola Delgado *
   \***********************/

//*******************************************************************\\
// File: GradStudent.java Subclass of Student                        \\
//                                                                   \\
// Information:                                                      \\
//   1. Constructor - sets information for objects type              \\
//      GradStudent with inputs from user.                           \\
//   2. MontlySalary Method - returns the monthly salary of the      \\
//      student based on the pay rate and working hours.             \\
//                                                                   \\
//*******************************************************************\\


public class GradStudent extends Student
{
   /*--- VARIABLES ---*/
   private String position;
   private String advName;
   private String research;
   private int working;
   private int payRate;
   
   
   /* ---CONSTRUCTOR METHOD--- */
   public GradStudent(String newCategory, String newName, String newId, float newGPA, int newAdmYear, int newCurrentYear, int newExpGraduation, String newPosition, String newAdvName, String newResearch, int newWorking, int newPayRate)
   {
      super(newCategory,newName,newId,newGPA,newAdmYear,newCurrentYear,newExpGraduation);
      
      position = newPosition;
      advName = newAdvName;
      research = newResearch;
      working = newWorking;
      payRate = newPayRate;
   }
   
   /* ---MonthlySalary METHOD--- */
   private float MonthlySalary()
   {
      //RETURNS MONTHLY SALARY
      return ((payRate * working)*4);
   }

   /* ---toString METHOD--- */
   public String toString()
   {
      //RETURNS DESCRIPTION OF THE PERSON (NAME, CATEGORY, ID NUMBER, GPA, ADMISSION YEAR, CURRENT YEAR, EXPECTED GRADUATION, YEARS SINCE ADMITTED, YEARS LEFT TO GRADUATE, POSITION, ADVISOR NAME, RESEARCH AREA, WORKING HOURS, PAY RATE, MONTHLY SALARY)
      return super.toString() + "\nPosition: " + position + "\n" + "Advisor Name: " + advName + "\n" + "Research Area: " + research + "\n" + "Working Hours: " + working + " hours per week\n" + "Pay Rate : $" + payRate + " per hour" + "\nMonthly Salary: $" + MonthlySalary();
   }

}