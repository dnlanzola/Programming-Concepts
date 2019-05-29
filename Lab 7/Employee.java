   /***********************\
   *      Assignment 7     *
   * Daniel Anzola Delgado *
   \***********************/

//*******************************************************************\\
// File: Employee.java                                               \\
//                                                                   \\
// Information:                                                      \\
//   1. SET & GET methods for each private variable.                 \\
//   2. Constructor #1 - sets default information for objects        \\
//      type Employee.                                               \\
//   3. Constructor #2 - sets information for objects type           \\
//      Employee with inputs from user.                              \\
//   4. NumberOfEmployees Method - returns the number of employees.  \\
//   5. Salary Method - computes the monthly salary of an            \\
//      employee based on his pay rate and working hours.            \\
//                                                                   \\
//*******************************************************************\\

public class Employee
{
   /* ---VARIABLES--- */
   
   public static String companyName = "Apple";
   static int numberEmployees = 0;
   
   private String nameEmployee;
   private String position;
   
   private int workingHours;
   private int payRate;
   
   
   //(1.1) SET - [STRING] nameEmployee 
   public void setnameEmployee (String newName)
   {
      nameEmployee = newName;
   }

   //(1.2) GET - [STRING] nameEmployee
   public String getnameEmployee()
   {
      return nameEmployee;
   }

   //(2.1) SET - [STRING] position
   public void setposition (String newPosition)
   {
      position = newPosition;
   }

   //(2.2) GET - [STRING] position
   public String getposition()
   {
      return position;
   }

   //(3.1) SET - [INT] workingHours
   public void setworkingHours (int newHours)
   {
      workingHours = newHours;
   }

   //(3.2) GET - [INT] workingHours
   public int getworkingHours()
   {
      return workingHours;
   }

   //(4.1) SET - [INT] payRate
   public void setpayRate (int newRate)
   {
      payRate = newRate;
   }

   //(4.2) GET - [INT] payRate
   public int getpayRate()
   {
      return payRate;
   }

   /* ---NUMBEROFEMPLOYEES METHOD--- */
   // RETURNS NUMBER OF EMPLOYEES
   public static int numberOfEmployees()
   {
      return numberEmployees;
   }


   /* ---CONSTRUCTOR METHOD 1--- */
   // SETS DEFAULT INFORMATION OF EMPLOYEE
   public Employee()
   {
      this.nameEmployee = "Daniel";
      this.position = "Developer";
      this.workingHours = 40;
      this.payRate = 18;
      numberEmployees++;      
   }

   
   /* ---CONSTRUCTOR METHOD 2--- */
   // SETS INFORMATION OF EMPLOYEE. THE VALUES ARE GIVEN BY THE USER
   public Employee(String nameEmployee, String position, int workingHours, int payRate)
   {
      this.nameEmployee = nameEmployee;
      this.position = position;
      this.workingHours = workingHours;
      this.payRate = payRate;
      numberEmployees++;
   }
   
   
   /* ---SALARY METHOD--- */
   // COMPUTES MONTHLY SALARY   
   public float Salary()
   {
      float monthSalary = 0;
      
      monthSalary = this.payRate * this.workingHours;
      monthSalary = monthSalary * 4;
      
      return monthSalary;
   }   

}