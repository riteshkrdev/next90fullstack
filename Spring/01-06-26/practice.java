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

        if( d != 0 & (n % d) == 0)
            System.out.println("Divide done");
        else
            System.out.println("Can not divide.");
    }
}
