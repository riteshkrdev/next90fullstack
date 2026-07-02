public class Jully01P {
    public static void main(String arr[]){
        // Calculator calc = new Calculator();

        // int addTwoNum = calc.add(3,6);
        // System.out.println(addTwoNum);

        // calc.num1 = 10;
        // calc.num2 = 15;
        // System.out.println(calc.add(1.0,2));

        BankAccount myAccount = new BankAccount();

        myAccount.accountHolder = "Ritesh Kumar";
        myAccount.balance = 30_000;

        myAccount.deposit(3500);

        myAccount.checkbalance();

        myAccount.withdraw(25_000);

        myAccount.withdraw(-25_000);

        BankAccount friendAccount = new BankAccount();

        friendAccount.accountHolder = "Rahul";
        friendAccount.balance = 50_000;

        friendAccount.deposit(8500);

        friendAccount.checkbalance();

        friendAccount.withdraw(35_000);

        friendAccount.transfer(myAccount, 20000);
        myAccount.checkbalance();
        friendAccount.deposit(-3800);

    }
}

class BankAccount{
    String accountHolder = "";
    double balance = 0;

    void deposit(double amount){
        if(amount < 0){
            System.out.println("You can not deposit negative amount.Current Balance" + " " + balance);
            return;
        }
        balance += amount;
        System.out.println("Deposit Successfull.Current Balance" + " " + balance);
    }

    void withdraw(int amount){
        if(amount > balance || amount < 0){
            System.out.println("You can not withdraw amount.Current Balance" + " " + balance);
            return;
        }
        balance = balance - amount;
        System.out.println("Withdraw Successfull.Current Balance" + " " + balance);
    }
    void checkbalance(){
        System.out.println("Current Balance" + " " + balance);
    }

    void transfer(BankAccount reciever, int amount){
        if(amount > balance){
            balance -= 500;
            System.out.println("You can not tranfer amount.Current Balance after exceed deductions" + " " + balance);
            return;
        }
        balance = balance - amount;
        reciever.balance += amount; 
        System.out.println("Successfully tranfer amount.Current Balance after deductions" + " " + balance);

    }
}

class Calculator{
    int num1 = 0;
    int num2 = 0;
    // int add(){
    //     return num1 + num2;
    // }

    int add(int n1,int n2, int n3){
        return n1 + n2 + n3;
    }

    int add(int n1,int n2){
        return n1 + n2 ;
    }

    double add(double n1,int n2){
        return n1 + n2 ;
    }

    int subtract(){
        return num1 - num2;
    }

    int multiply(){
        return num1 * num2;
    }

    double divide(){
        return num1 * num2;
    }
}
