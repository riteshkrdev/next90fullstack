// package Spring;

public class Practice2806 {
    public static void main(String arr[]){
        int studentsInClass = 300;
        int employees = 25;
        int cars = 10;
        int books = 1;
        System.out.println(studentsInClass);
        System.out.println(cars);
        System.out.println(employees);
        System.out.println(books);

        byte daysInWeek = 7;
        byte monthsInYear = 12;
        byte hoursInDay = 24;
        byte maximumDiceValue = 6;

        System.out.println(daysInWeek);
        System.out.println(monthsInYear);
        System.out.println(hoursInDay);
        System.out.println(maximumDiceValue);

        byte age = 27;
        int populationOfVillage = 50_00_000;
        byte temperature = 24;
        char grade = 'A';
        boolean isLoggedIn = false;

        long worldPopulation = 5_00_00_00_00_000L;
        long distanceToSUnInKm = 10_00_00_00_00_000L;
        long nationDebt = 10_00_00_00_00_00_000L;

        System.out.println(worldPopulation);
        System.out.println(distanceToSUnInKm);
        System.out.println(nationDebt);

        float piValue = 3.14F;
        double temperatureValue = 26.5;
        double bankBalance = 2300;
        char gradeInMath = 'A';
        char gender = 'M';
        char firstLetter = 'R';

        System.out.println(gradeInMath + gender + firstLetter);

        boolean isLoggedInUser = false;
        boolean hasDrivingLicense = false;
        boolean isJavaFun = true;

        System.out.println(isLoggedInUser);
        System.out.println(hasDrivingLicense);
        System.out.println(isJavaFun);

        int num1 = 4;
        int num2 = 10;

        System.out.println(num1 + num2);
        System.out.println(num2 - num1);
        System.out.println(num1 * num2);
        System.out.println(num2 / num1);
        System.out.println(num2 % num1);


        System.out.println(num1 > num2);
        System.out.println(num1 < num2);
        System.out.println(num1 >= num2);
        System.out.println(num2 <= num1);
        System.out.println(num2 == num1);
        System.out.println(num2 != num1);

        boolean isAdult = true;
        boolean hasLicense = false;

        System.out.println(isAdult && hasLicense);
        System.out.println(isAdult || hasLicense);
        System.out.println(!isAdult && hasLicense);

        int count = 10;

        // System.out.println(count++);
        // System.out.println(++count);
        // System.out.println(count--);
        System.out.println(--count);

        int positiveNumber = 3;

        if(positiveNumber > 0){
            System.out.println("Positive");
        }else if(positiveNumber < 0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }

        int currAge = 27;
        if(currAge >= 18){
            System.out.println("Eligible to Vote");
        }else{
            System.out.println("Not Eligible");
        }

        

        int number1 = 3;
        if(number1 % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

        int number2 = 4;

        if(number1 > number2){
            System.out.println("number1 is largest");
        }else{
            System.out.println("number2 is largest");
        }

        int number3 = 16;

        if(number1 >= number2 && number1 >= number3){
            System.out.println("number1 is largest");
        }else if(number2 >= number3){
            System.out.println("number2 is largest");
        }else{
            System.out.println("number3 is largest");
        }

        String result = currAge >= 18 ? "Eligible to Vote" : "Not Eligible";
        System.out.println(result);

        String result2 =positiveNumber > 0 ? "Positive Number" : "Negative Number";
        System.out.println(result2);

        int day = 7;
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
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Entry");
        }

        int num3 = 34;
        int num4 = 45;
        char operator = 'P';

        switch(operator){
            case '+':
                System.out.println(num3 + num4);
                break;
            case '-':
                System.out.println(num3 - num4);
                break;
            case '*':
                System.out.println(num3 * num4);
                break;
            case '/':
                System.out.println(num3 / num4);
                break;
            case '%':
                System.out.println(num3 % num4);
                break;
            default:
                System.out.println("Operation cannot perform.");
        }
        int choice = 2;

        switch(choice){
            case 1:
                System.out.println("Add Student");
                break;
            case 2:
                System.out.println("Update Student");
                break;
            case 3:
                System.out.println("Delete Student");
                break;
            case 4:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid Choice");
        }

        int i = 1;

        while ( i <= 10){
            System.out.println(i);
            i++;
        }

        int j = 10;

        while ( j > 0){
            System.out.println(j);
            j--;
        }

        int k = 2;
        // while(k <= 20){
        //     System.out.println(k);
        //     k += 2;
        // }
        do{
            System.out.println(k);
            k += 2;
        }while(k <= 20);

        int m = 1;
        while(m <= 20){
            // if(m % 2 != 0)
                System.out.println(m);
            m += 2;
        }

        int n = 1;
        while(n <= 10){
          
                System.out.println(n * 5);
            n++;
        }

        for (int q =1; q <=10; q++){
            System.out.println(q);
        }

        for (int q =10; q > 0; q--){
            System.out.println(q);
        }

        for (int q =2; q <= 20; q +=2 ){
            System.out.println(q);
        }

        for (int q =1; q <= 20; q +=2 ){
            System.out.println(q);
        }

        for (int q =1; q <= 10; q++ ){
            System.out.println(q * 7);
        }

        int sum = 0;

        for (int q =1; q <= 100; q++ ){
            sum += q;
        }
        System.out.println(sum);

        int factorialNum = 1;
        for (int q =5; q > 0; q-- ){
            factorialNum *= q;
        }
        System.out.println(factorialNum);

        
    }
}
