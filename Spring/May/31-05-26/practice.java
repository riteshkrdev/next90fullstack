public class practice {
    public static void main(String[] args){
        byte smallNumber = 127;
        int age =27;
        long bigNumber = 10000000L;
        float decimalNumber = 6.95f;
        double doubleNumber = 9.9999;
        char grade = 'A';
        boolean isLearning = true;

        System.out.println("Age:" + age);
        System.out.println("Grade:" + grade);
        System.out.println("Is learning java " + isLearning);

        // conversion

        long ageLong = age;

        System.out.println("Widenning data: " + ageLong);

        // casting

        int castInt = (int) doubleNumber;

        System.out.println("Casting: " + castInt);
    }
}
