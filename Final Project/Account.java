/*************************\
*      Final Project      *
*  Daniel Anzola Delgado  *
*   Christopher Keller    *  
\*************************/

//*******************************************************************\\
// File: Account.java                                                \\
//                                                                   \\
// Information:                                                      \\
//   1. Constructor Method - sets information for objects type       \\
//      Account. Receives an object type Client, account number and  \\
//      account balance.                                             \\
//   2. Getter and Setters for all variables in the class.           \\
//   3. toString Method - returns account information.               \\
//   4. Deposit Method - will receive an amount and add it to the    \\
//      current balance of the account.                              \\
//   5. Withdrawal Method - will receive an amount to deduct from    \\
//      the current balance of the account. Also, it will deduct     \\
//      a 2 dollar fee.                                              \\
//   6. Close Method - in order to close an account, it will append  \\
//      "Closed" to the owner of the account and set the balance     \\
//      to zero.                                                     \\
//   7. Consolidate Method - it will merge two accounts, add their   \\
//      balances, and close one of the accounts.                     \\
//                                                                   \\
//*******************************************************************\\

import java.util.*;
import java.math.*;
public class Account
{
   /*--- VARIABLES ---*/  
   private Client owner;
   private double balance;
   private long accNum;
   

   /*--- CONSTRUCTOR METHOD ---*/
   public Account(Client newOwner,long newAccNum,double newBalance)
   {
      owner = newOwner;
      balance = newBalance;
      accNum = newAccNum;
   }
   
   /*--- getOwner METHOD ---*/
   //Returns object type Client
   public Client getOwner()
   {
      return owner;
   }
   
   /*--- setBalance METHOD ---*/
   public void setBalance (double newBalance)
   {
      balance = newBalance;
   }
      
   /*--- getBalance METHOD ---*/
   public double getBalance()
   {      
      return balance;
   }
   
   /*--- setAccNum METHOD ---*/   
   public void setAccNum (long newAccNum)
   {
      accNum = newAccNum;
   }
   
   /*--- getAccNum METHOD ---*/
   public long getAccNum()
   {   
      return accNum;
   }
   
   /*--- toString METHOD ---*/
   //Returns account information   
   public String toString()
   {      
      return ("\n--- Account Information ---\nFull Name: " + this.owner.getFName() + " " + this.owner.getLName() + "\nAccount Balance: $" + balance + "\nAccount Number: " + accNum);
   }  
   
   /*--- DEPOSIT METHOD ---*/
   //Adds an amount to the balance   
   public void deposit(double deposit)
   {   
      this.balance += deposit;
   }
   
   /*--- WITHDRAW METHOD ---*/
   //Deducts an amount to the balance. Also, checks if the amount is less than the
   //current balance.   
   public int withdraw(double withdraw)
   {   
      if (this.balance >= (withdraw+2))
      {
         this.balance = this.balance - withdraw - 2;
         return 0;
      }   

      return -1;
   }
   
   /*--- CLOSE METHOD ---*/
   //Closes an account. Appends "closed" to the first name and sets the balance
   //to zero.   
   public static void close(Account CL1)
   {   
      CL1.getOwner().setFName("Closed");
      CL1.getOwner().setLName("");
      CL1.setBalance(0);
   }

   /*--- CONSOLIDATE METHOD ---*/
   //Merges two accounts into one and closes one of them.
   public static void consolidate(Account CL1, Account CL2)
   {
      double totalBalance;
      int newAccNum;
      Random rand = new Random();
         
      totalBalance = CL1.getBalance() + CL2.getBalance();
      CL1.setBalance(totalBalance);
      Account.close(CL2);

      newAccNum = rand.nextInt(1000) + 101;
      CL1.setAccNum(newAccNum);
   }
          
}