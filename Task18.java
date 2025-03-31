import java.util.Scanner;
class Accounts{
    String accountHolder;
    double balance;
    public Accounts(String accountHolder, double balance){
        this.accountHolder= accountHolder;
        this.balance= balance;
    }
    void deposit(double amount){
        if (amount>0){
            balance += amount;
            System.out.println("Amount deposited: "+amount+"rs");
        }else{
            System.out.println("Wrong input!");
        }
    }
    void display(){
        System.out.println("Curret Blance : "+balance+"rs");
    }
}

class SavingAccount extends Accounts{
    final double interestRate = 0.04;
    public SavingAccount(String accountHolder, double blance) {
        super(accountHolder, blance);
    }
    public void compteInterest(){
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest of "+interest+"rs added to  your account.");
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance) {
            balance -= amount;
            System.out.println("Withdrawa successful! Amount withdrawn:" + amount + "rs");
        }else {
            System.out.println("Insufficient balance");
        }
    }
}
class CurrentAccount extends Accounts{
    private final double minBalance = 500;
    private final double penalty = 50;
    public CurrentAccount(String accountHolder, double balance){
        super(accountHolder,balance);
    }
    public void wihdraw(double amount){
        if(amount>0 && amount<=balance){
            balance -= amount;
            System.out.println("Withdrawal successful! Amount withdrawn: "+amount+"rs");
        }else{
            System.out.println("Wrong input");
        }
    }
    public void checkMinimumBalance() {
        if (balance < minBalance) {
            System.out.println("Balance below minimum! Penalty of $" + penalty + " imposed.");
            balance -= penalty;
        }
    }
}
public class Task18 {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter account holder name: ");
     String name = sc.nextLine();
     System.out.println("Enter initial deposit amount: ");
     double initialDeposit = sc.nextDouble();
     System.out.println("Select Account Type:\n 1. Saving Account\n 2. Current Account");
     int choice = sc.nextInt();
     Accounts accounts;
     if (choice == 1){
         accounts = new SavingAccount(name,initialDeposit);
     }else if(choice == 2){
         accounts = new CurrentAccount(name,initialDeposit);
     }
     else{
         System.out.println("Wrong input");
         sc.close();
         return;
        }
     while(true){
         System.out.println("\n Banking Menu ");
         System.out.println("1. Deposit Money");
         System.out.println("2. Display Balance");
         System.out.println("3. Compute Interest (Only for saving account)");
         System.out.println("4. Withdraw Monney");
         System.out.println("5. Exit");
         System.out.println("Enter your choice: ");
         int option = sc.nextInt();
         switch (option){
             case 1:
                 System.out.print("Enter deposit amount: ");
                 double depositAmount = sc.nextDouble();
                 accounts.deposit(depositAmount);
                 break;
             case 2:
                 accounts.display();
                 break;
             case 3:
                 if (accounts instanceof SavingAccount) {
                     ((SavingAccount) accounts).compteInterest();
                 } else {
                     System.out.println("Interest calculation is not available for Current Accounts.");
                 }
                 break;
             case 4:
                 System.out.print("Enter withdrawal amount: ");
                 double withdrawAmount = sc.nextDouble();
                 if (accounts instanceof SavingAccount) {
                     ((SavingAccount) accounts).withdraw(withdrawAmount);
                 } else if (accounts instanceof CurrentAccount) {
                     ((CurrentAccount) accounts).wihdraw(withdrawAmount);
                 }
                 break;
             case 5:
                 System.out.println("Thank you for banking with us!");
                 sc.close();
                 return;
             default:
                 System.out.println("Invalid choice! Please try again.");
         }
     }
    }
}
