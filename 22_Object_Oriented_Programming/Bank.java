// You are tasked with creating a simple banking system using Object-Oriented Programming (OOP) principles. Implement the following classes and their relationships:

// BankAccount (Superclass)

// Attributes:
// accountNumber (String)
// accountHolderName (String)
// balance (double)
// Methods:
// deposit(double amount): Adds the specified amount to the account balance.
// withdraw(double amount): Subtracts the specified amount from the account balance, but only if there are sufficient funds.
// getBalance(): Returns the current account balance.
// SavingsAccount (Subclass of BankAccount)

// Additional attribute:
// interestRate (double)
// Methods:
// applyInterest(): Adds interest to the balance based on the interest rate.
// CheckingAccount (Subclass of BankAccount)

// Additional attribute:
// overdraftLimit (double)
// Methods:
// Override withdraw(double amount) to allow withdrawals that exceed the balance but not the overdraft limit.
// Bonus Task:

// Create a Bank class that contains a list of BankAccounts. Add methods to create new accounts, perform deposits and withdrawals, and display account details.
// Implement the relationships between the classes, use encapsulation, and test your system by creating instances of SavingsAccount and CheckingAccount.

public class Bank {
    public static void main(String[] args)  {

    }
}

class BankAccount{
    String accountNumber,accounHolderName,accounName;
    double balance;
    double deposit(double amount){
        return balance +=amount;
    }
    double withdraw(double amount){
       return balance -=amount;
    }
    public double getBalance() {
        return balance;
    }
    class savingAccount extends BankAccount{
        double interestRate;
        double applyInterest(){
           return balance+=(balance*interestRate);
        }
    }
    class checkingAccount extends BankAccount{
        double overdraftLimit;
        double withdraw(double amount){
            if(amount<=overdraftLimit){
                balance-=amount;
            }
            return amount;
        
        }
    }
}
