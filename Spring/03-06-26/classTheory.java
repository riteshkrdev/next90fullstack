class Calculator{
    public int add(int n1, int n2 ){
        int result = n1 + n2;
        return result;
    }
}



public class classTheory {

    public static void main(String[] args){

        int num1 = 5;
        int num2 = 4;
    
        Calculator calc = new Calculator();
    
        int addResult = calc.add(num1,num2);
    
        System.out.println(addResult);
    }
}
