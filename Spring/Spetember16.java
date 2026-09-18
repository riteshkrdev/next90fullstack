public class Spetember16 {
    public static void main(String[] args) {
        System.out.println(SumR(255646546, 495646654));
        System.out.println(greatestNum(250,35,100));
    }

    public static long SumR(long a, long b){
        // Here is the breakdown of how the formula works:
        // $a$ is the starting number in your range.
        // $b$ is the ending number in your range.
        // $(b - a + 1)$ calculates the total number of terms in that range.
        // $(a + b)$ calculates the sum of the first and last term.

        long totalNumber = b - a + 1;
        long sumFirstLast = a + b;

        return (totalNumber * sumFirstLast)/2;
    }
    
    // Changed the method parameters a and b to long to prevent overflow during the addition or subtraction steps.
    // Changed the return type from double to long.
    // Combined the formula into a single return statement.
    // Lowercased the method name to sumR to follow Java's standard camelCase naming conventions for methods.
    
    public static long greatestNum(long a, long b){
        return a > b ? a : b;
    }

    // public static long greatestNum(long a, long b, long c){
    //     if(a > b){
    //         if(a > c){
    //             return a;
    //         }else{
    //             return c;
    //         }
    //     }else{
    //         if(b > c){
    //             return b;
    //         }else{
    //             return c;
    //         }
    //     }
    // }

    // Method 2: Compares three numbers by reusing Method 1
    public static long greatestNum(long a, long b, long c){
        // First find the greatest between a and b, then compare that result to c
        return greatestNum(greatestNum(a, b), c); 
    }
}
