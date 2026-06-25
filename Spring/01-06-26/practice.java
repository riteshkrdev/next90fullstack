public class practice {
    public static void main(String[] args) {
        // Coding Questions for VS Code Practice
        // Question 1 (Variables & Data Types): Write a Java program that creates an
        // integer variable for year (2026), a double variable for temperature (36.6),
        // and a boolean for isHot (true). Print them out.
        // Hint: Use the primitive data types int, double, and boolean
        // ,
        // . Remember to wrap your code inside a class and the public static void
        // main(String[] args) method.

        int currFinYr = 2026;
        double currTemp = 36.6;
        boolean isHot = (currTemp > 30);

        System.out.println("Is temprature hot " + isHot);

        // Question 2 (Casting): Create a float variable with the literal value 9.99f.
        // Cast it to a byte variable and print both values.
        // Hint: Narrowing conversion from a larger float to a smaller byte must be done
        // manually using the syntax (byte)
        // .

        float constLteral = 9.99f;
        byte castingLiteral = (byte) constLteral;
        // System.out.println(constLteral + castingLiteral);
        System.out.println(castingLiteral);
        System.out.println(constLteral);
        // Question 3 (Operators): Write a Java program to find the remainder when 17 is
        // divided by 5. Then, use the compound addition assignment operator (+=) to add
        // 10 to that remainder and print it.
        // Hint: Use the modulus operator % to find the remainder
        // , and += to add and assign
        // .

        int a = 17;
        int b = 5;
        int result = a % b;
        result += 10;
        System.out.println(result); 

        int n = 10;
        int d = 0;

        if( d != 0 && (n % d) == 0)
            System.out.println("Divide done");
        else
            System.out.println("Can not divide.");

        int markObtained = 76;
        int passingMarks = 40;

        if(markObtained >= passingMarks){
            if(markObtained > 90){
            System.out.println("Grade A");    
            }else if(markObtained > 75){
                System.out.println("Grade B");
            }else if(markObtained > 60){
                System.out.println("Grade C");
            }else {
                System.out.println("Grade D");
            }
        }else{
            System.out.println("Fail");
        }

        int score = 2;

        switch(score){
            case 1: 
                System.out.println("Score is 1");
                break;
            case 2: 
                System.out.println("Score is 2");
                break;
            case 3: 
                System.out.println("Score is 3");
                break;
            default:
                System.out.println("Score not found.");
        }


//         Question 1 (Short-Circuit): Write a Java program that creates two integers: divisor = 0 and total = 100. Write an if statement using the short-circuit AND (&&) to check if divisor is greater than 0 AND if total / divisor is greater than 10. Print "Valid" if true, and "Invalid or zero" if false.
// Hint: The left side of the && must check if divisor > 0 to safely short-circuit and prevent a crash when checking total / divisor > 10 on the right side.

int divisor = 0;
int total = 100;

if(divisor > 0 && total/divisor > 10){
    System.out.println("Valid");
}else{
    System.out.println("Not Valid");
}

// Question 2 (Conditional Statements): Write a Java program that declares an integer income = 45000. Use an if - else if - else ladder to determine the tax rate. If income is less than 10000, tax is 0. Else if income is less than 35000, tax is 10. Else, tax is 20. Print the tax amount.
// Hint: Follow the top-down evaluation structure. Start with if (income < 10000).


int income = 45_000;
if (income < 10_000){
    System.out.println("Tax is 0");
}else if(income < 35_000){
    System.out.println("Tax is 10");
}else{
    System.out.println("Tax is 20");
}

// Question 3 (Switch Statement): Write a Java program that declares an integer day = 3. Use a switch statement to print "Monday" for case 1, "Tuesday" for case 2, and "Wednesday" for case 3. Include a default case that prints "Invalid day".
// Hint: Remember to use the break; statement at the end of case 1, case 2, and case 3 to prevent execution from falling through to the next cases.

int day = 3;

switch(day){
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Invalid day.");
}
    }
}
