class practice1908{

    public static void main(String[] args){

        double salary = 45000;
        System.out.println(salary);

        double yearlySalary =  12 * 45000;

        yearlySalary = (0.1 * yearlySalary) + yearlySalary;

        salary = yearlySalary / 12;

        System.out.println(yearlySalary + " " +salary);


        int age = 29;

        int preAge = ++age;
        System.out.println(preAge);

        age = 29;
        int postAge = age++;
        System.out.println(postAge);

        int math = 100;
        int java = 39;
        int db = 15;

        double average = (math + java + db)/3.0;

        System.out.println("Average Marks" + " " +average);

        boolean isLoggedIn = true;
        boolean hasPermission = false;

        double marksPercentage = isLoggedIn && hasPermission ? (average / 300) * 100 : 0;

        System.out.println(marksPercentage);

        int read = 12;
        int write = 29;
        int delete = 47;

        System.out.println(Integer.toBinaryString(read));
        System.out.println(Integer.toBinaryString(write));
        System.out.println(Integer.toBinaryString(delete));
        System.out.println(read | write);
        System.out.println(read & write);
        System.out.println(write ^ delete);


        int number = 20;
        int remainder =  number % 3;
        System.out.println(remainder);

        int number1 = -2;
        int leftShift = number1 << 1;
        int rightShift = number1 >> 1;
        int unsignedRightShift = number1 >>> 2;
        System.out.println(leftShift);
        System.out.println(rightShift);
        System.out.println(unsignedRightShift);

        final int incrementsPer = 7;

        // incrementsPer = 35;

        int x = 10;
        Integer b = 32;
        int result  = x + b;
        System.out.println(result);

        String name = "Ritesh Kumar";
        int age1 = 29;
        int salary1 = 45000;
        boolean isPermanent = true;
        char wing = 'B';

        int hikeAmount = salary1 > 30000 ? (int) (salary1 * (incrementsPer / 100.0)) : 5000;
        System.out.println(salary1 * (incrementsPer / 100.0));

        salary1 = isPermanent ? salary1 + hikeAmount: salary1 + 5000;

        System.out.println(name +" "+ salary1 + "hike is " + hikeAmount);


    }
    
}

