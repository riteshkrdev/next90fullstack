
public class Practice3006 {
    public static void main(String arr[]){
        Car car1 = new Car();

        car1.brand = "Suzuki";
        car1.model = "Vestro";
        car1.year = 2022;

        car1.displayInfo();

        Car car2 = new Car();

        car2.brand = "Mercedes";
        car2.model = "A2";
        car2.year = 2025;

        car2.displayInfo();

        Employee emp1 = new Employee();
        emp1.name = "Ritesh";
        emp1.salary = 26_400;

        emp1.displayEmployee();
        emp1.increaseSalary(5000);
        emp1.displayEmployee();

        Rectangle rec1 = new Rectangle();

        rec1.length = 30;
        rec1.width = 36;
        rec1.area();
        rec1.perimeter();
    }
}

class Rectangle{
    int length = 0;
    int width =  0;

    void area(){
        System.out.println(length * width);
    }

    void perimeter(){
        int perimeterResult = 2 * (length + width);
        System.out.println(perimeterResult);
    }
}

class Car{
    String brand = "";
    String model = "";
    int year = 2026;

    void displayInfo(){
        System.out.println(brand);
        System.out.println(model);
        System.out.println(year);
    }
}

class Employee {
    String name = "";
    int salary = 0;

    void displayEmployee(){
        System.out.println(name);
        System.out.println(salary);
    }

    void increaseSalary(int amount){
        salary += amount;
    }
}