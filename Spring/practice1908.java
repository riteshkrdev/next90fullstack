class practice1908{

    public static void main(String[] args){

        double salary = 45000;
        System.out.println(salary);

        double yearlySalary =  12 * 45000;

        yearlySalary = (0.1 * yearlySalary) + yearlySalary;

        salary = yearlySalary / 12;

        System.out.println(yearlySalary + " " +salary);
    }
    
}

