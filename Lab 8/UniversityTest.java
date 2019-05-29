   /***********************\
   *      Assignment 8     *
   * Daniel Anzola Delgado *
   \***********************/

//****************************************************************\\
// File: UniversityTest.java                                      \\
//                                                                \\
// Purpose:                                                       \\
//   1. Creates a set number of objects type Person.              \\        
//   2. Constant MAXIMUM_PEOPLE gives the ability for setting     \\
//      the number of people that are going to be entered         \\
//      in the system.                                            \\
//   3. The system is able to recognize the following categories: \\
//      Student, Graduate Student and Faculty. In case that other \\
//      category is input by user it will also be recognized.     \\
//   4. The system is able to request different inputs depending  \\
//      on the category.                                          \\
//   5. The system will print a list of all the people enrolled   \\
//      in the university.                                        \\
//                                                                \\
//****************************************************************\\

import java.util.*;

public class UniversityTest
{
   public static void main(String[] args) 
   {
      /*--- VARIABLES ---*/
      
      //MAXIMUM_PEOPLE CONSTANT IS USED TO SET HOW MANY PEOPLE
      //CAN BE ENTERED IN THE SYSTEM. NOW IT IS SET TO 10 PEOPLE.
      final int MAXIMUM_PEOPLE = 10;
      
      int i = 0;
      int j = 0;
      int k = 0;
      
      int tempYearAdm = 0;
      int tempCurYear = 0;
      int tempExpYear = 0;
      int tempWorking = 0;
      int tempPayRate = 0;
      
      float tempAnnualSalary = 0;
      float tempGPA = 0;
      
      String category = "";
      
      String tempName = "";
      String tempID = "";
      String tempPosition = "";
      String tempAdvName = "";
      String tempResearch = "";
      
      Person[] university = new Person[MAXIMUM_PEOPLE];
      
      Scanner scan = new Scanner(System.in);
      
      /*--- PROCEDURES ---*/
      
      //WHILE LOOP FOR CREATION OF OBJECTS TYPE PERSON
      while (i < MAXIMUM_PEOPLE)
      {
         //FIX LINE
         if (i != 0)
            scan.nextLine();
         
         //INPUT: PERSON'S CATEGORY   
         System.out.println("Enter the person category: ");
         category = scan.nextLine();
         
         //MAKES THE INPUT ALL LOWER CASE TO AVOID ERRORS FOR THE SWITCH STATEMENT
         category = category.toLowerCase();
         
         //SWITCH STATEMENT HOLDS STUDENT, GRADUATE STUDENT AND FACULTY CATEGORIES
         //IF OTHER CATEGORY IT WILL FALL UNDER "DEFAULT" OPTION
         switch(category)
         {
            //CASE STUDENT - RECEIVES THE FOLLOWING PARAMETERS:
            //NAME, ID NUMBER, GPA, YEAR OF ADMISSION, EXPECTED YEAR OF GRADUATION
            //AND CURRENT YEAR
            case "student" :  
               
               System.out.println("Enter Student's name: ");
               tempName = scan.nextLine();
               
               System.out.println("Enter Student's ID number: ");
               tempID = scan.nextLine();
               
               System.out.println("Enter Student's GPA: ");
               tempGPA = scan.nextFloat();
               
               System.out.println("Enter Year of Admission: ");
               tempYearAdm = scan.nextInt();
               
               System.out.println("Enter Expected Year of Graduation: ");
               tempExpYear = scan.nextInt();
               
               System.out.println("Enter Current Year: ");
               tempCurYear = scan.nextInt();
               
               //CREATION OF OBJECT TYPE STUDENT
               university[i] = new Student("Student",tempName,tempID,tempGPA,tempYearAdm,tempCurYear,tempExpYear);
               
               //PRINTS CONFIRMATION OF ENROLLMENT
               System.out.println("\n" + tempName + " is now enrolled in the system.");
               
               break;
               
            //CASE GRADUATE STUDENT - RECEIVES THE FOLLOWING PARAMETERS:
            //NAME, ID NUMBER, GPA, YEAR OF ADMISSION, EXPECTED YEAR OF GRADUATION,
            //CURRENT YEAR, POSITION, ADVISOR NAME, RESEARCH AREA, WORKING HOURS,
            //AND PAY RATE
            case "graduate student" :
            
               System.out.println("Enter Student's name: ");
               tempName = scan.nextLine();
               
               System.out.println("Enter Student's ID number: ");
               tempID = scan.nextLine();
               
               System.out.println("Enter Student's GPA: ");
               tempGPA = scan.nextFloat();
                           
               System.out.println("Enter Year of Admission: ");
               tempYearAdm = scan.nextInt();
               
               System.out.println("Enter Expected Year of Graduation: ");
               tempExpYear = scan.nextInt();
               
               System.out.println("Enter Current Year: ");
               tempCurYear = scan.nextInt();
               
               scan.nextLine();
               System.out.println("Enter Student's Position: ");
               tempPosition = scan.nextLine();
               
               System.out.println("Enter Student's Advisor Name: ");
               tempAdvName = scan.nextLine();
               
               System.out.println("Enter Student's Research Area: ");
               tempResearch = scan.nextLine();
               
               System.out.println("Enter Working Hours per Week: ");
               tempWorking = scan.nextInt();
               
               System.out.println("Enter Pay Rate: ");
               tempPayRate = scan.nextInt();

               //CREATION OF OBJECT TYPE GRADUATE STUDENT
               university[i] = new GradStudent("Graduate Student",tempName,tempID,tempGPA,tempYearAdm,tempCurYear,tempExpYear,tempPosition,tempAdvName,tempResearch,tempWorking,tempPayRate);

               //PRINTS CONFIRMATION OF ENROLLMENT
               System.out.println("\n" + tempName + " is now enrolled in the system.");
                           
               break;
            
            //CASE FACULTY - RECEIVES THE FOLLOWING PARAMETERS:
            //NAME, ID NUMBER, POSITION, YEAR OF HIRING AND ANNUAL SALARY   
            case "faculty" :
            
               System.out.println("Enter Faculty's name: ");
               tempName = scan.nextLine();
               
               System.out.println("Enter Faculty's ID number: ");
               tempID = scan.nextLine();
               
               System.out.println("Enter Faculty's Position: ");
               tempPosition = scan.nextLine();
               
               System.out.println("Enter Year of Hiring: ");
               tempYearAdm = scan.nextInt();
               
               System.out.println("Enter Annual Salary: ");
               tempAnnualSalary = scan.nextFloat();

               //CREATION OF OBJECT TYPE FACULTY
               university[i] = new Faculty("Faculty",tempName,tempID,tempPosition,tempYearAdm,tempAnnualSalary);

               //PRINTS CONFIRMATION OF ENROLLMENT
               System.out.println("\n" + tempName + " is now enrolled in the system.");
                              
               break;
               
            //CASE DEFAULT - RECEIVES THE FOLLOWING PARAMETERS:
            //NAME AND ID NUMBER   
            default :
               System.out.println("Enter Name: ");
               tempName = scan.nextLine();
               
               System.out.println("Enter ID number: ");
               tempID = scan.nextLine();
    
               //CREATION OF OBJECT TYPE PERSON
               university[i] = new Person(category,tempName,tempID);

               //PRINTS CONFIRMATION OF ENROLLMENT
               System.out.println("\n" + tempName + " is now enrolled in the system.");
               
         }//END OF SWITCH STATEMENT      
      
         //PRINTS IF USER WANTS TO CONTINUE ENROLLING PEOPLE IN THE SYSTEM
         System.out.println("\nDo you wish to continue using the system? (1 / 0)");
         j = scan.nextInt();
         
         //IF THE USER INPUTS 0 THE WHILE LOOP WILL END
         if (j == 0)
            break;
      
         i++;
         
      }//END OF WHILE LOOP
      
      
      /*--- RESULTS ---*/
   
      //PRINTS NUMBER OF PEOPLE ENROLLED IN THE UNIVERSITY
      System.out.println("The university has " + Person.EnrolledPeople() + " people enrolled.\n");
   
      System.out.println("--- List of people enrolled in the university ---\n");
   
      //PRINTS INFORMATION FOR ALL OBJECTS
      while (k <= i)
      {
         System.out.println(university[k]+"\n");
         k++;
      }   
   
   }
}      