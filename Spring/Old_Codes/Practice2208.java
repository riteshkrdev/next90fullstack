public class Practice2208 {
    public static void main(String[] args) {
        
       { int x =5;

        int a = x++;

        int b = ++x;

        int c = x++;

        System.out.println(x);  //5  ===> how 8?
        System.out.println(a);  //5
        System.out.println(b);  //7
        System.out.println(c);  //7

        // Track each step and what result to be clear.
}

        {int itemPrice = 1200;
        int quantity = 3;
        double discount = 10;

        // double finalBill = (itemPrice * quantity) - (itemPrice * quantity) * (discount/100.0);

        // (itemPrice * quantity)  same twices

        double totalPrice = itemPrice * quantity;
double finalBill = totalPrice - totalPrice * discount / 100;


        System.out.println(finalBill);

        boolean isExpensive = finalBill > 3000 || false;

        // finalBill > 3000  // already give boolean value

        System.out.printf("Bill %.2f and is expensive %b",finalBill,isExpensive);
    }

    final int MAX_SCORE = 100;

    int currentScore = 189;

    // boolean isCurrentScoreValid = currentScore < MAX_SCORE ? true : false;

    boolean isCurrentScoreValid = currentScore < MAX_SCORE;

    // int invalidScore = 129;

    // System.out.printf("\nIs score is valid?  You score is %d and %b",currentScore,isCurrentScoreValid);

    System.out.printf("%nIs score is valid?  You score is %d and %b",currentScore,isCurrentScoreValid);
    boolean isUserNameCorrect = true;
    boolean isPasswordCorrect = false;

    // boolean isLoggedIn = isUserNameCorrect && isPasswordCorrect ? true: false;

    boolean isLoggedIn = isUserNameCorrect && isPasswordCorrect;

    if(isLoggedIn) System.out.println("User Logged In Successfully.");
    else System.out.println("invalid User Logged In");

    boolean isAdmin = false;
    boolean isManager = false;
    boolean isActive = true;

    if(isActive){
        if(isManager || isAdmin){
            System.out.println("User Logged In Successfully.");
        }else{
            System.out.println("Not Authrised User Logged In");
        }
    }else{
        System.out.println("User is blocked.");
    }

    }
}

// 1. x++  → use, then increment
// 2. ++x  → increment, then use

// 3. condition → already produces boolean
//    Don't use ? true : false unnecessarily

// 4. Translate English requirements carefully:
//    >  means >
//    >= means >=
//    <= means <=

// 5. Identify repeated calculations before coding

// 6. Operator precedence:
//    * and / before + and -

// 7. Integer division:
//    10 / 100   → 0
//    10.0 / 100 → 0.1

// 8. Compilation ≠ correctness

// 9. printf() does not add newline automatically
//    use %n

// 10. Shorter code ≠ better code
