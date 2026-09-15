/**
 * Utility class demonstrating parity checks, arithmetic progressions, 
 * and integer overflow prevention in Java.
 * 
 * Includes a historical record of common logic traps (overflows, off-by-one errors) 
 * for future reference and learning.
 */
public class September15Review {
    
    public static void main(String[] args) {
        // --- SECTION 1: Parity (Even/Odd) Checks ---
        System.out.println("=== Parity Checks ===");
        System.out.println(isEvenOrOdd(0));     
        System.out.println(getParityText(35));  
        System.out.println(getParityText(544));

        // --- SECTION 2: Sum of First 'N' Natural Numbers ---
        System.out.println("\n=== Sum of First N Numbers ===");
        System.out.println(sumN(25));
        System.out.println(sumN(46340)); 
        System.out.println(sumN(46345)); 
        System.out.println(sumN(46325));

        // --- SECTION 3: Sum of 'N' Numbers with a Custom Starting Point ---
        System.out.println("\n=== Sum with Custom Start Boundary ===");
        System.out.println(sumN(4, 25));       
        System.out.println(sumN(46344.0, 25)); 
    }
    /**
     Uses the modulo operator to determine parity.
     */
    public static String isEvenOrOdd(int n) {
        return n % 2 == 0 ? "Even" : "Odd";
    }

    /**
     * Pure logic: strictly returns a boolean, optimized with bitwise operators.
     */
    public static boolean isEven(int n) {
        return (n & 1) == 0; 
    }

    /**
     * Presentation logic: consumes the boolean to return a formatted String.
     */
    public static String getParityText(int n) {
        return isEven(n) ? "Even" : "Odd";
    }

    /* =====================================================================
     * SUMMATION METHODS & LESSONS LEARNED
     * ===================================================================== */

    /*
     * ❌ MISTAKE 1: Integer Overflow Trap
     * Issue: (n * (n + 1)) is evaluated entirely as a 32-bit integer BEFORE 
     * dividing by 2.0. If N > 46,340, the multiplication exceeds Java's int limit 
     * and wraps around to a negative number.
     * 
     * public static double sumN_Flawed(int n){
     *     return (n * (n+1))/2.0;
     * }
     */

    /**
     * ✅ CORRECTION 1: Force Double Promotion
     * Calculates the sum of the FIRST 'n' natural numbers safely.
     * Changing '1' to '1.0' forces Java to treat the numerator as a double
     * immediately, preventing integer overflow.
     */
    public static double sumN(int n) {
        return (n * (n + 1.0)) / 2;
    }

    /*
     * ❌ MISTAKE 2: Off-By-One Error & Overflow Accumulator
     * Issue 1: The loop condition 'i <= n' runs n+1 times, adding an extra number.
     * Issue 2: 'int sum = 0' keeps all addition inside a 32-bit limit, which will 
     * silently overflow into negative numbers if 'f' or 'n' are large enough.
     * 
     * public static double sumN_Flawed(int f, int n){
     *     int sum = 0;
     *     for(int i=0; i <= n; i++){
     *         sum += f + i;
     *     }
     *     return sum;
     * }
     */

    /**
     * ✅ CORRECTION 2: Correct Loop Bounds & Accumulator Type
     * Iterative O(N) approach: Sums exactly 'n' consecutive numbers starting from 'f'.
     */
    public static double sumN(int f, int n) {
        double sum = 0; // Initialized as double to prevent overflow during addition
        
        // i < n ensures we add EXACTLY 'n' numbers without an off-by-one error
        for(int i = 0; i < n; i++) {
            sum += f + i;
        }
        return sum;
    }

    /**
     * Formula O(1) approach: Sums 'n' consecutive numbers starting from 'f'.
     * Uses the Arithmetic Progression sequence formula for instant execution,
     * bypassing the need for a loop entirely.
     */
    public static double sumN(double f, int n) {
        return (n / 2.0) * (2.0 * f + n - 1);
    }   
}