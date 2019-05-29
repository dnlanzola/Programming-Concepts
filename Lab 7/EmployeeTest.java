   /***********************\
   *      Assignment 7     *
   * Daniel Anzola Delgado *
   \***********************/

//****************************************************************\\
// File: EmployeeTest.java                                        \\
//                                                                \\
// Purpose:                                                       \\
//   1. Creates a set number of objects type Employee.            \\
//   2. First employee is created with default values. Remaining  \\
//      employees' information are defined by the user.           \\
//   3. Constant TOTAL_EMPLOYEES gives the ability for setting    \\
//      the number of employees that are going to be entered      \\
//      in the system.                                            \\
//   4. Compute and print Monthly Salary for each employee.       \\
//                                                                \\
//****************************************************************\\

import java.util.*;

public class EmployeeTest 
{
   public static void main(String[] args) 
   {
      /*--- VARIABLES ---*/
      
      //TOTAL_EMPLOYEES CONSTANT IS USED TO SET HOW MANY EMPLOYEES
      //CAN BE ENTERED IN THE SYSTEM. NOW IT IS SET TO 3 EMPLOYEES.
      //SO THE USER WILL BE ABLE TO INPUT INFORMATION FOR 2 EMPLOYEES
      final int TOTAL_EMPLOYEES = 3;
   
      String name = "";
      String position = "";
      
      int workingHours = 0;
      int payRate = 0; 
      int i = 0;
      
      Employee[] employees = new Employee[TOTAL_EMPLOYEES];
 
      Scanner scan = new Scanner(System.in);
     
     
      /*--- PROCEDURES ---*/
      
      //FIRST EMPLOYEE IS CREATED USING DEFAULT INFORMATION SET BY
      //THE FIRST CONSTRUCTOR
      employees[0] = new Employee();
     
      
      //INPUT FROM USER FOR REMAINING EMPLOYEES
      i = 1;
      while (i != TOTAL_EMPLOYEES) 
      {
         ////FIX READ LINE AFTER FIRST INPUT
         if (i > 1)
           scan.nextLine();
         
         System.out.println("--- Information Employee #" + (i+1) + " ---");  
         
         ////INPUT NAME OF EMPLOYEE
         System.out.printf("Enter employee's name: ");
         name = scan.nextLine();
         
         ////INPUT EMPLOYEE'S POSITION
         System.out.printf("Enter employee's position: " );
         position = scan.nextLine();
     
         ////INPUT EMPLOYEE'S WORKING HOURS
         System.out.printf("Enter employee's working hours (per week): ");
         workingHours = scan.nextInt();
 
         ////INPUT EMPLOYEE'S PAY RATE
         System.out.printf("Enter employee's pay rate (per hour): ");
         payRate = scan.nextInt();
         
         System.out.printf("\n");
         
         ////CREATION OF OBJECT TYPE EMPLOYEE. INFORMATION IS SET USING
         ////THE SECOND CONSTRUCTOR.
         employees[i] = new Employee(name,position,workingHours,payRate);
   
         i++;
      }
   
      //PRINTS TOTAL OF EMPLOYEES IN THE COMPANY
      System.out.println("\nA total of " + Employee.numberOfEmployees() + " employees were entered in the " + Employee.companyName + "'s employee system.");
   
      //PRINTS THE NAME OF THE COMPANY
      System.out.println("\nList of Employees in " + Employee.companyName + ": ");
   
   
      i = 0;
      while (i != TOTAL_EMPLOYEES)
      {
         ////PRINTS LIST OF EMPLOYEES IN THE COMPANY
         System.out.printf((i+1)+". ");
         
         ////PRINTS NAME OF EMPLOYEE
         System.out.println("Employee's name: " + employees[i].getnameEmployee());
         
         ////PRINTS EMPLOYEE'S POSITION
         System.out.println("   Employee's position: " + employees[i].getposition());
         
         ////PRINTS EMPLOYEE'S WORKING HOURS
         System.out.println("   Working hours per week: " + employees[i].getworkingHours());
         
         ////PRINTS PAY RATE
         System.out.println("   Pay rate: $" + employees[i].getpayRate() + " per hour");
         
         ////PRINTS MONTHLY SALARY
         System.out.println("   Monthly salary: $" + employees[i].Salary());
         System.out.printf("\n");
         i++;
      }
   }
}