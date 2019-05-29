/*************************\
*      Final Project      *
*  Daniel Anzola Delgado  *
*   Christopher Keller    *  
\*************************/

//****************************************************************\\
// File: Bank.java                                                \\
//                                                                \\
// Purpose:                                                       \\
//   1. Create accounts for clients and storing their personal    \\  
//      information.                                              \\
//   2. The user will be able to choose an account after he/she   \\
//      creates them.                                             \\
//   3. The program prints a list of transactions, including:     \\
//      modify phone number, last name and ssn, print account     \\
//      opening date, client's information, account's information \\
//      balance enquiry, deposit, withdrawal and consolidation    \\
//      of accounts.                                              \\
//   4. After selecting a transaction and execute it, the user    \\
//      will be ask if he/she wants to continue using the system. \\        
//                                                                \\
//****************************************************************\\


import java.util.*;

public class Bank
{
    public String BankName;
    
    /*--- CONSTRUCTOR METHOD ---*/  
    public Bank(String BankName)
    {
       this.BankName = BankName;
    }
    
    public String toString()
    {
      return BankName;
    }  
      

   public static void main(String[] args) 
   {
      /*--- CONSTANTS ---*/
      //MAXIMUM_ACCOUNTS CONSTANT IS USED TO SET HOW MANY ACCOUNTS
      //CAN BE ENTERED IN THE SYSTEM. NOW IT IS SET TO 10 ACCOUNTS.
      final int MAXIMUM_ACCOUNTS = 10;
      
      /*--- VARIABLES ---*/
      boolean ContinueBanking = true;
      boolean check = false;
      
      char opt;

      double openBalance = 0;
      double amount = 0;  

      int i = 0;
      int j = 0;
      int p1 = 0;
      int p2 = 0;
      int option;
      int numberClients = 0;
      int clientChoosen = 0;
      int wSuccess = 0;

      long tempPhone = 0;
      long tempSSN = 0;
      long tempAcctNumber = 0;
      long oldAccNum = 0;
            
      String tempFirstName = "";
      String tempLastName = "";
      
      /*--- OBJECTS ---*/  
      Account[] bankAccounts = new Account[MAXIMUM_ACCOUNTS];

      Bank NewBank = new Bank("Chase");
      
      Scanner scan = new Scanner(System.in);
      
   
      /*--- PROCEDURES ---*/
      
      // INITIALIZATION OF ELEMENTS TO NULL
      while (i != MAXIMUM_ACCOUNTS)
      {
         bankAccounts[i] = null;
         i++;
      } 
      
      //PRINTS WELCOME MESSAGE
      System.out.println("Welcome to " + NewBank + " Bank!\n");

      //FILLS ARRAY WITH ACCOUNTS
      for(i = 0; i < MAXIMUM_ACCOUNTS; i++)
      {
         //FIX LINE
         if (i >= 1)
            scan.nextLine();
         
         System.out.println("--- Add Account ---");
         //SCANS FIRST NAME   
         System.out.println("Client's First name: ");
         tempFirstName = scan.nextLine();
         
         //SCANS LAST NAME
         System.out.println("Client's Last name: ");
         tempLastName = scan.nextLine();
         
         //SCANS PHONE NUMBER
         System.out.println("Client's Phone number: ");
         tempPhone = scan.nextLong();
         
         //SCANS SOCIAL SECURITY NUMBER
         System.out.println("Client's Social Security Number: ");
         tempSSN = scan.nextLong();
         
         //SCANS ACCOUNT NUMBER
         System.out.println("Account number: ");
         tempAcctNumber = scan.nextLong();
         
         //SCANS OPENING BALANCE
         System.out.println("Account's Opening Balance: ");
         openBalance = scan.nextDouble();
         
         //CREATES NEW OBJECT TYPE ACCOUNT
         bankAccounts[i] = new Account(new Client(tempFirstName,tempLastName,tempPhone,tempSSN),tempAcctNumber,openBalance);      

         //ASKS USER IF WANTS TO ADD ANOTHER ACCOUNT             
         System.out.println("Add Another Account? (Y / N)");
         opt = scan.next().charAt(0);
         
         if (opt == 'n')
            break;
      }
      
      //ASSIGNS NUMBER OF ACCOUNTS IN THE ARRAY
      numberClients = i;   
      
      //ASKS USER TO SELECT AN ACCOUNT
      System.out.println("Select an Account: \n");
      
      //PRINTS LIST OF ACCOUNTS CREATED
      i=0;
      while (i < (numberClients+1))
      {
         System.out.println("["+(i+1)+"]  Account Number: " + bankAccounts[i].getAccNum());
         System.out.println("      Owner: " + bankAccounts[i].getOwner().getFName() + " " + bankAccounts[i].getOwner().getLName() + "\n");
         i++;
      } 
         
      //SCANS AND VERIFIES ACCOUNT SELECTED BY USER
      while (check == false)
      {
         System.out.printf("Option: ");
         clientChoosen = scan.nextInt();
         clientChoosen = clientChoosen - 1;
         
         if (clientChoosen >= 0 && clientChoosen <= (MAXIMUM_ACCOUNTS - 1))
            break;
         else
            System.out.println("Invalid Option\n");
      }
      
      //PRINTS CONFIRMATION OF SELECTED ACCOUNT
      System.out.println("\n[*] Selected Account: #" + bankAccounts[clientChoosen].getAccNum());   
         
      while (ContinueBanking)
      {
         //PRINTS MENU
         System.out.println("\n----------- Select a Transaction ------------");
         System.out.println("---------------------------------------------\n");
         System.out.println("[1] Modify Client's Phone number");
         System.out.println("[2] Modify Client's Last Name");
         System.out.println("[3] Modify Client's Social Security Number (SSN)");
         System.out.println("[4] Show Client's Bank Account Opening Date");
         System.out.println("[5] Show Client's Information");
         System.out.println("[6] Balance Enquiry");
         System.out.println("[7] Show Account's Information");
         System.out.println("[8] Deposit");
         System.out.println("[9] Cash Withdrawal");
         System.out.println("[10] Consolidate Account");

         //SCANS OPTION SELECTION BY USER
         System.out.printf("\nOption: ");
         option = scan.nextInt();
         
         switch (option)
         {
            //MODIFY PHONE NUMBER
            case 1: 
                     System.out.println("\n--- Modify Phone Number ---");
                     //PRINTS CURRENT PHONE NUMBER
                     System.out.println("Current Phone number: " + bankAccounts[clientChoosen].getOwner().getPhoneN() );
                     
                     //SCANS NEW PHONE NUMBER
                     System.out.printf("Enter new Phone number: ");
                     tempPhone = scan.nextLong();
                     
                     //SETS NEW PHONE NUMBER
                     bankAccounts[clientChoosen].getOwner().setPhoneN(tempPhone);
                     
                     //PRINTS CONFIRMATION
                     System.out.println("\n[*] The phone number was sucessfully changed to: " + bankAccounts[clientChoosen].getOwner().getPhoneN() + "\n");

                     break;
                       
            //MODIFY LAST NAME         
            case 2:
                     System.out.println("\n--- Modify Last Name ---");
                     //PRINTS CURRENT LAST NAME
                     System.out.println("Current Last Name: " + bankAccounts[clientChoosen].getOwner().getLName() );
                     
                     //SCANS NEW LAST NAME
                     scan.nextLine();                    
                     System.out.printf("Enter new Last Name: ");
                     tempLastName = scan.nextLine();
                     
                     //SETS NEW LAST NAME                    
                     bankAccounts[clientChoosen].getOwner().setLName(tempLastName);
                     
                     //PRINTS CONFIRMATION
                     System.out.println("\n[*] The last name was sucessfully changed to: " + bankAccounts[clientChoosen].getOwner().getLName() + "\n");
            
                     break;       
   
            //MODIFY SSN
            case 3: 
                     System.out.println("\n--- Modify Social Security Number (SSN) ---");
                     //PRINTS CURRENT SSN
                     System.out.println("Current Social Security Number (SSN): " + bankAccounts[clientChoosen].getOwner().getSSNN() );
                     
                     //SCANS NEW SSN
                     System.out.printf("Enter new Social Security Number (SSN): ");
                     tempSSN = scan.nextLong();
                     
                     //SETS NEW SSN                    
                     bankAccounts[clientChoosen].getOwner().setSSNN(tempSSN);
                     
                     //PRINTS CONFIRMATION
                     System.out.println("\n[*] The Social Security Number (SSN) was sucessfully changed to: " + bankAccounts[clientChoosen].getOwner().getSSNN() + "\n");
            
                     break; 
                      
            //PRINT OPENING DATE         
            case 4:
                     System.out.println("\n--- Account Opening Date ---");
                     //PRINTS ACCOUNT OPENING DATE
                     System.out.println(bankAccounts[clientChoosen].getOwner().getFName() + " " + bankAccounts[clientChoosen].getOwner().getLName() + " is a member since: " + bankAccounts[clientChoosen].getOwner().getSDate() + "\n");
          
                     break;
                            
            //PRINT CLIENT INFORMATION
            case 5: 
                     //PRINTS CLIENT INFORMATION
                     System.out.println(bankAccounts[clientChoosen].getOwner());
            
                     break;  
                     
            //BALANCE ENQUIRY         
            case 6:
                     System.out.println("\n--- Balance Enquiry ---");
                     //PRINTS CURRENT BALANCE
                     System.out.println("[*] Current Balance: $" + bankAccounts[clientChoosen].getBalance() + "\n");
            
                     break; 
                           
            //PRINT ACCOUNT INFORMATION
            case 7: 
                     //PRINTS ACCOUNT INFORMATION
                     System.out.println(bankAccounts[clientChoosen] + "\n");
            
                     break;  
            
            //DEPOSIT         
            case 8:
                     amount = 0;
                     
                     System.out.println("\n--- Deposit ---");
                     //SCANS DEPOSIT AMOUNT
                     System.out.printf("Enter amount: $");
                     amount = scan.nextDouble();
                     
                     //SETS DEPOSIT
                     bankAccounts[clientChoosen].deposit(amount);
                     
                     //PRINTS CONFIRMATION
                     System.out.println("\nYour deposit is complete. \n[*]New Balance: $" + bankAccounts[clientChoosen].getBalance() + "\n");
            
                     break;       
   
            //WHITDRAWAL
            case 9: 
                     amount = 0;
                     
                     wSuccess = 0;
                     System.out.println("\n--- Withdrawal ---");
                     //SCANS WITHDRAWAL AMOUNT
                     System.out.printf("Enter amount: $");
                     amount = scan.nextDouble();
                     
                     //PRINTS FEE WARNING
                     System.out.println("\n[WARNING] " + NewBank + " Bank will charge a $2 fee for this withdrawal transaction.");
                     System.out.println("Do you want to continue? (Y / N)");
                     opt = scan.next().charAt(0);
         
                     if (opt == 'n')
                        break;
                     
                     //SETS WITHDRAWAL AND RETURNS CONFIRMATION   
                     wSuccess = bankAccounts[clientChoosen].withdraw(amount);
                     
                     //WITHDRAWAL SUCCESFUL
                     if (wSuccess == 0)
                        System.out.println("\nYour withdrawal is complete. \n[*]New Balance: $" + bankAccounts[clientChoosen].getBalance() + "\n");
                     //WITHDRAWAL UNSUCCESFUL   
                     else
                        System.out.println("\n[ERROR] Insuficient funds in account." + "\n");
            
                     break;  
            
            //ACCOUNT CONSOLIDATION         
            case 10:
                     j = 0;
                     check = false;
                     
                     System.out.println("\n--- Account Consolidation ---");
                     
                     //CHECK: IF THERE IS MORE THAN ONE ACCOUNT STORED IN THE ARRAY
                     if ((numberClients+1) != 1)
                     {
                        //LOOP: WILL SCAN ALL THE ACCOUNTS
                        while (j <= numberClients)
                        {
                           //CHECK: IF BOTH FULL NAMES ARE EQUAL AND THEY ARE NOT IN THE SAME POSITION IN THE ARRAY
                           if ((bankAccounts[clientChoosen].getOwner().getFName().equals(bankAccounts[j].getOwner().getFName())) && (bankAccounts[clientChoosen].getOwner().getLName().equals(bankAccounts[j].getOwner().getLName())) && (clientChoosen != j))
                           {
                              //CHECK: IF BOTH ACCOUNTS HAVE THE SAME ACCOUNT NUMBER
                              if (bankAccounts[clientChoosen].getAccNum() != bankAccounts[j].getAccNum() && (clientChoosen != j))
                              { 
                                 //CHECK: IF THE ACCOUNT IS CLOSED
                                 if ((bankAccounts[j].getOwner().getFName().equals("Closed") == false))
                                 {
                                    //RECORDS POSITIONS FOR CONSOLIDATION 
                                    p1 = clientChoosen;
                                    p2 = j;
                                    
                                    //STORES OLD ACCOUNT NUMBER
                                    oldAccNum = bankAccounts[p1].getAccNum();
                                    
                                    //CALLS THE CONSOLIDATE METHOD
                                    Account.consolidate(bankAccounts[p1],bankAccounts[p2]);
                                    
                                    //PRINTS CONFIRMATION
                                    System.out.println("\nThe accounts #" + oldAccNum + " and #" +  bankAccounts[p2].getAccNum() + " for " + bankAccounts[p1].getOwner().getFName() + " " + bankAccounts[p1].getOwner().getLName() + " were consolidated.");
                                    
                                    System.out.println("\n[*] New account number: " + bankAccounts[p1].getAccNum());
                                    System.out.println("[*] New balance for account #" + bankAccounts[p1].getAccNum() + ": $" + bankAccounts[p1].getBalance());
                                    System.out.println("[*] Account #" + bankAccounts[p2].getAccNum() + " is now closed.\n");
                                    

                                    check = true;
                                    break;
                                 }
                                 else
                                 {
                                    System.out.println("\n[ERROR] Accounts  cannot be consolidated.\n");
                                    check = true;
                                    break;
                                 }                              
                              }
                              else
                              {
                                 System.out.println("\n[ERROR] Accounts #" +  bankAccounts[p1].getAccNum() + " and #" +  bankAccounts[p2].getAccNum() + " cannot be consolidated.\n");
                                 check = true;
                              }
                           }
                           j++;
                           check = false;
                        }
                     }
                     //PRINTS ERROR WHEN THERE IS JUST ONE ACCOUNT IN THE ARRAY        
                     else
                        System.out.println("\n[ERROR] There are not enough accounts in the system.\n");
                     
                     //PRINTS ERROR IN CASE NO ACCOUNTS ARE FOUND
                     if (check == false)
                        System.out.println("\n[NOTICE] No other accounts were found for " + bankAccounts[clientChoosen].getOwner().getFName() + " " + bankAccounts[clientChoosen].getOwner().getLName() + "\n");

                    break; 
                          
            //DEFAULT - PRINTS ERROR
            default: System.out.println("Invalid Option");
            
         } //END OF SWITCH
         
         //ASKS USER IF WANTS TO PERFORM ANOTHER TRANSACTION
         System.out.println("Would you like to perform another transaction? (Y / N)");
          opt = scan.next().charAt(0);
         
         if (opt == 'n')
            ContinueBanking = false;        
         
      } //END WHILE CONTINUE BANKING
   
      //PRINTS GOODBYE MESSAGE.
      System.out.println("\nThank you for banking with " + NewBank + ", goodbye!");
  
   } //END MAIN

} //END BANK







