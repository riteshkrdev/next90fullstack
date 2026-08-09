public class Practice1307 {

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        acc1.accountNumber = 3890856932L;
        acc1.accountHolder = "Ritesh Kumar";
        acc1.balance = 35_000;

        BankAccount acc2 = new BankAccount();
        acc2.accountNumber = 3890856933L;
        acc2.accountHolder = "Roshan Kumar";
        acc2.balance = 1_35_000;

        acc1.deposit(35000);
        
        acc2.deposit(-48_000);
        acc2.deposit(48_000);

        acc2.withdraw(2_00_000);
        acc2.withdraw(20_000);

        acc2.tranfer(50_000, acc1);

    }
    
}

class BankAccount{
    long accountNumber;
    String accountHolder;
    double balance;

    void deposit(double amount){
        if(amount < 0){
        System.out.println("Can not deposit amount" +" "+amount + " " + "Available Balance " + balance);
        return;
        }
        balance += amount;
        System.out.println("Deposit Successfully." + " " + "Available Balance " + balance);
    }

    void withdraw(double amount){
        if(amount < 0){
        System.out.println("Can not withdraw amount" +" "+amount + " " + "Available Balance " + balance);
        return;
        }else if(amount > balance){
            System.out.println("Can not withdraw amount greater than balance" +" "+amount + " " + "Available Balance " + balance);
        return;
        }
        balance -= amount;
        System.out.println("Withdraw Successfully." + " " + "Available Balance " + balance);
    }

    void checkBalance(){
        System.out.println("Available Balance " + balance);
    }

    void tranfer(double amount, BankAccount account){
        if(balance < amount || amount < 0){
            System.out.println("Can not transfer amount" +" "+ amount + " " + "Available Balance for tranfer" + balance);
        return;
        }
        balance -= amount;
        account.deposit(amount);
        System.out.println("Tranfer Successfully." + " " + "Available Balance " + balance);
    }
}
