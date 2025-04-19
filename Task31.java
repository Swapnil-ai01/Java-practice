class Accounts{
    String cusName;
    int accountNo;
    double balance;
    Accounts(String name,int number){
        this.cusName = name;
        this.accountNo = number;
        this.balance = 0;
    }
    void deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.println("Deposited: "+amount+" . New balance: "+balance);
        }else{
            System.out.println("Deposit amount must be positive. ");
        }
    }
    void display(){
        System.out.println("Account Info");
        System.out.println("Name: "+cusName);
        System.out.println("Account number: "+accountNo);
        System.out.println("Balance: "+balance);
    }
    void withdraw(double amount){
        if (amount<=balance){
            balance-=amount;
            System.out.println("Withdrew : "+amount+". New balance: "+balance);
        }else{
            System.out.println("No balance!");
        }
    }
}
class SavingAccounts extends Accounts{
    SavingAccounts(String name, int accNumber){
        super(name,accNumber);
    }
    void Interest(double rate,int years){
        double interest = balance * Math.pow((1+rate/100),years)- balance;
        balance += interest;
        System.out.println("Interest : "+String.format("%.2f",interest)+" added");
    }
}
class CurrentAccounts extends Accounts{
    double minBalance = 1000;
    double penalty = 100;
    CurrentAccounts(String name,int accNumber){
        super(name,accNumber);
    }
    void ChequeBook(){
        System.out.println("Cheque Book issued.");
    }
    void MinBalance(){
        if(balance<minBalance){
          balance -= penalty;
          System.out.println("You have minimum balance! penality of "+penalty+" charge.");
        }else{
            System.out.println("Minimum balance maintained.");
        }
    }
}
class Task31{
    public static void main(String[] args){
        System.out.println("Saving Account-");
        SavingAccounts sav =new SavingAccounts("Jarry",123);
        sav.deposit(5000);
        sav.Interest(5,2);
        sav.withdraw(1200);
        sav.display();
        System.out.println("\nCurrent Account-");
        CurrentAccounts cur = new CurrentAccounts("Tom",124);
        cur.deposit(1500);
        cur.ChequeBook();
        cur.withdraw(600);
        cur.MinBalance();
        cur.display();
    }
}