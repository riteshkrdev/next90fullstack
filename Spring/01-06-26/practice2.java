public class practice2 {
//     Question 1 (Math Operators, Casting & If-Else): Temperature Checker Write a Java program that declares a double 
// variable for celsius and assigns it 40.5.
// Convert it to Fahrenheit using the formula (celsius * 9/5) + 32 and store it in a new double variable named fahrenheit.
// Cast fahrenheit to an int variable named approxTemp.
// Use an if-else statement to check approxTemp. If it is greater than or equal to 100, print "Very Hot". Otherwise, print "Normal".
// Hint: Remember that explicit casting looks like (int) variableName.
public static void main(String[] args){
    double celsiusTemp = 40.5;
    double fahrenheitTemp = (celsiusTemp * 9/5) + 32;
    int approxTemp = (int) fahrenheitTemp;

    if(approxTemp >= 100){
        System.out.println("Very hot");
    }else
        System.out.println("Normal");


        // Question 2 (Modulus & Switch): Even/Odd Finder Write a Java program that declares an integer number = 27.
// Find the remainder when number is divided by 2 using the modulus operator (%)
//  and store it in an int variable named remainder.
// Use a switch statement on the remainder variable.
// If case 0:, print "Even number". If case 1:, print "Odd number".
// Hint: Any number modulo 2 will only ever result in 0 or 1, making it perfect for a switch statement. Don't forget your break; statements!

int number = 27;
int remainder = number % 2;

switch(remainder){
    case 0:
        System.out.println("Even" + remainder);
        break;
    case 1:
        System.out.println("Odd"+ remainder);
        break;
    default:
        System.out.println("Invalid Output"+ remainder);
}
        
// Question 3 (Booleans, Short-Circuit & Compound Operators): Safe Bank Withdrawal Write a Java program 
// that declares two double variables: accountBalance = 500.0 and withdrawAmount = 600.0. Also, declare a boolean variable isAccountActive = true.
// Write an if-else statement using the short-circuit AND (&&) to check two things: if the account is active AND if the withdrawAmount is less 
// than or equal to (<=) the accountBalance
// .
// If true, use the compound subtraction assignment operator (-=) to deduct the withdrawal from the balance
// , and print "Transaction Successful. New Balance: " + balance.
// If false, print "Transaction Failed".
// Hint: For the if condition, you can just write if(isAccountActive && ...) since isAccountActive is already a boolean.

double accountBalance = 500.39;
double withdrawAmount = 400.0;

boolean isAccountActive = true;
if(isAccountActive && withdrawAmount <= accountBalance){
    accountBalance -= withdrawAmount;
    System.out.println("Tranction Successful. New Balance: " + accountBalance);
}else{
    System.out.println("Tranction Failed");
}

}





}
