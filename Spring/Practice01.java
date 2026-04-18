public class Practice01 {
//     You are building a backend service for a bank. You need to store the following data. Your goal is to choose the correct data type for each and initialize them correctly in a single class.

// The Requirements:

// Account Balance: A precise decimal value of 1500.75.

// User ID: A very large number: 9876543210123.

// Account Level: A single letter 'S' (for Silver).

// Transaction Count: A whole number of 5000.

// Is Account Active: A simple true/false flag.

// The Task: Create a class named BankAudit. Declare these as Local Variables inside the main method. Make sure you use the correct suffixes (like L or f) where required, or the code won't compile!

public float accountBalance = 1500.75f;
public long userId =  9876543210123L;
public char accountLevel = 'S';
public int tractionCount = 5000;
public boolean isAccountActive = false;
}

// public class LogicCheck {
//     static int globalCount;

//     public static void main(String[] args) {
//         int localTotal;  ==> should have value
//         final double PI = 3.14;   ===> float needed

//         System.out.println(globalCount); 
//         System.out.println(localTotal); 
        
//         if (globalCount == 0) {
//             public int bonus = 100;  ===> public only used in class scopes
//             PI = 3.14159;
//         }
//     }
// }