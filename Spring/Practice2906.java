public class Practice2906 {
    public static void main (String a[]){
        int intialAmount = 25_000;
        int withdrawAmount = 7_200;

        if(intialAmount >= withdrawAmount){
            System.out.println("Withdrawal Successful.");
            int remainingAmount = intialAmount - withdrawAmount;
            System.out.println(remainingAmount);
        }else
            System.out.println("Insufficent Balance.");
        int consumedUnits = 300;
        int remainingUnits = 300;
        int bill = 0;
        if(remainingUnits > 200){
            int calcUnits = remainingUnits - 200;
            bill += calcUnits * 10; 
            remainingUnits = remainingUnits - calcUnits;
        }
        if(remainingUnits > 100){
            int calcUnits = remainingUnits - 100;
            bill += calcUnits * 7;
            remainingUnits = remainingUnits - calcUnits;
        }
        if(remainingUnits <=100){
            bill += remainingUnits * 5;
        }

        System.out.println(consumedUnits);
        System.out.println(bill);

        boolean isRegistered = true;
        boolean isPasswordCorrect = true;
        boolean isAccountLocked = false;

        if(!isRegistered){
            System.out.println("User not registered.");
        }else if(isAccountLocked){
            System.out.println("Account Locked.");
        }else if(!isPasswordCorrect){
            System.out.println("Incorrect Password.");
        }else{
            System.out.println("Login Successful.");
        }

        String studentName = "Ritesh Kumar";
        int marksInMath = 35;
        int marksInScience = 50;
        int marksInEnglish = 60;
        String result = "";
        int total = marksInMath + marksInEnglish + marksInScience;
        double average = total/3.0;
        char grade = 'E';
        if(marksInMath < 35 || marksInEnglish < 35 || marksInScience < 35 ){
            result = "Fail";
        }else{
            result = "Pass";
            // switch(average){
            //     case average >= 90: 

            // }
            if(average >= 90){
                grade = 'A';
            }else if(average >= 75){
                grade = 'B';
            }else if(average >= 60){
                grade = 'C';
            }else if(average >= 35){
                grade = 'D';
            }else {
                grade = 'E';
            }

        }
        // System.out.println("Name" + " " + studentName);
        System.out.println(studentName);
        System.out.println(total);
        System.out.println(average);
        System.out.println(result);
        if(grade != 'E') System.out.println(grade);

        Student stud = new Student();
        stud.displayInfo();

        Student stud2 = new Student();
        stud2.name = "Reena";
        stud2.age = 35;
        stud2.marks = 458;
        stud2.displayInfo();

    }

}

class Student{
    int age = 27;
    String name = "Ritesh";
    int marks = 317;

    void displayInfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(marks);
    }

    boolean isPassed(){
        return marks > 300 ? true : false;
    }
}
