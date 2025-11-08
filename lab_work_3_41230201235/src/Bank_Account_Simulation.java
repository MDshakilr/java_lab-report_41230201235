
class BankAccount {
    int account_Number;
    String holder_Name;
    double balance;

    BankAccount() {
        account_Number = 0;
        holder_Name = "Unknown";
        balance = 0.0;
    }

    BankAccount(int x, String y, double z) {
        account_Number = x;
        holder_Name = y;
        balance = z;
    }

    void deposit(double amount) {
        if (amount > 0)
        {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
        else
        {
            System.out.println("Invalid deposit amount!");
        }
    }

    void withdraw(double amount) {
        if (amount <= balance && amount > 0)
        {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
        else if (amount <= 0)
        {
            System.out.println("Invalid withdrawal amount!");
        } else
            System.out.println("Insufficient balance!");
    }

    void display() {
        System.out.println("Account Number : " + account_Number);
        System.out.println("Holder Name    : " + holder_Name);
        System.out.println("Current Balance: " + balance);
    }
}

public class Bank_Account_Simulation {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount(1001, "Shakil Rana", 5000.0);

        acc1.display();
        acc1.deposit(2000);
        acc1.withdraw(500);
        acc1.display();
        acc2.display();
        acc2.deposit(1500);
        acc2.withdraw(3000);
        acc2.display();
    }
}


