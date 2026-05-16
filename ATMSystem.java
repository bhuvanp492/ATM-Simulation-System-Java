import java.util.Scanner;

class ATMSystem
{
    double balance = 1000;

    void checkBalance()
    {
        System.out.println("Current Balance: Rs." + balance);
    }

    void deposit(double amount)
    {
        balance = balance + amount;
        System.out.println("Amount Deposited Successfully");
    }

    void withdraw(double amount)
    {
        if(amount > balance)
        {
            System.out.println("Insufficient Balance");
        }
        else
        {
            balance = balance - amount;
            System.out.println("Please Collect Your Cash");
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        ATMSystem obj = new ATMSystem();

        int choice;

        do
        {
            System.out.println("\n===== ATM SYSTEM =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    obj.checkBalance();
                    break;

                case 2:
                    System.out.print("Enter Amount to Deposit: ");
                    double deposit = sc.nextDouble();
                    obj.deposit(deposit);
                    break;

                case 3:
                    System.out.print("Enter Amount to Withdraw: ");
                    double withdraw = sc.nextDouble();
                    obj.withdraw(withdraw);
                    break;

                case 4:
                    System.out.println("Thank You");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while(choice != 4);
    }
}