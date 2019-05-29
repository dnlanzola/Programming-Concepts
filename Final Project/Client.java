/*************************\
*      Final Project      *
*  Daniel Anzola Delgado  *
*   Christopher Keller    *  
\*************************/

//*******************************************************************\\
// File: Client.java                                                 \\
//                                                                   \\
// Information:                                                      \\
//   1. Constructor Method - sets information for objects type       \\
//      Client. Receives name, last name, phone number and ssn.      \\
//      Also, it initializes the date of account opening by getting  \\
//      the current date from the computer.                          \\
//   2. Getter and Setters for all variables in the class.           \\
//   3. toString Method - returns account information.               \\
//                                                                   \\
//*******************************************************************\\

import java.util.*;
import java.text.*;

public class Client
{
   /* ---VARIABLES ---*/
   private String FName;
   private String LName;
   
   private long PhoneN;
   private long SSNN;
   
   private Date SDate;
   
   
   /* ---CONSTRUCTOR METHOD--- */
   public Client(String name, String lastName, long phone, long SSN)
   {
      FName = name;
      LName = lastName;
      PhoneN = phone;
      SSNN = SSN;      
      SDate = new Date();
   }
   

   /*--- setFName METHOD ---*/
   public void setFName (String newFName)
   {
      FName = newFName;
   }
   
   /*--- getFName METHOD ---*/
   public String getFName()
   {
      return FName;
   }
 
   /*--- setLName METHOD ---*/
   public void setLName (String newLName)
   {
      LName = newLName;
   }
   
   /*--- getLName METHOD ---*/
   public String getLName()
   {
      return LName;
   }   
   
   /*--- setPhoneN METHOD ---*/
   public void setPhoneN (long newPhoneN)
   {
      PhoneN = newPhoneN;
   }
   
   /*--- getPhoneN METHOD ---*/
   public long getPhoneN()
   {
      return PhoneN;
   }
   
   /*--- setSSNN METHOD ---*/
   public void setSSNN (long newSSNN)
   {
      SSNN = newSSNN;
   }
   
   /*--- getSSNN METHOD ---*/
   public long getSSNN()
   {
      return SSNN;
   }

   /*--- getSDate METHOD ---*/
   //Returns date formated in Month Day, Year
   public String getSDate()
   {
      //DATE FORMATTING (EXAMPLE: Oct 15, 2019)
      SimpleDateFormat ft2 = new SimpleDateFormat ("MMMMMMMMM dd, yyyy");
          
      return ft2.format(SDate);
   }

   /* ---toString METHOD--- */
   //Returns client information
   public String toString()
   {
      //DATE FORMATTING (EXAMPLE: Oct 15, 2019)
      SimpleDateFormat ft2 = new SimpleDateFormat ("MMMMMMMMM dd, yyyy");

      return "\n--- Client Information ---\nFirst Name: " + FName + "\nLast Name: " + LName + "\nPhone Number: " + PhoneN + "\nSocial Security Number (SSN): " + SSNN + "\nMember Since: " + ft2.format(SDate) + "\n";
   }

}