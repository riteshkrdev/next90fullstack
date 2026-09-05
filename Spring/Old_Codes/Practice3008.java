public class Practice3008 {
    public static void main(String[] args){
         {String username = "Ritesh";

        //  if(username.equals(`"Ritesh"`)){  // illegal character `
        //  if(username.equals("Ritesh")){
         if(username == "Ritesh"){

            System.out.println(username);
         }
    }

    String name = "Java Programming";

    System.out.println(name.length());
    System.out.println(name.toUpperCase());
    System.out.println(name.toLowerCase());
    System.out.println(name.charAt(0));
    // System.out.println(name.charAt(-1));
    System.out.println(name.charAt(name.length() - 1));


    String firstName = "Ritesh";
    String lastName = "Kumar";

    String concateString = firstName + " " + lastName;
    String concateReverse = lastName.toUpperCase() + ", " + firstName;

    System.out.println(concateString);
    System.out.println(concateReverse);


    String day = "Monday";
    day = "Tuesday";
    // day = "Tuesday";
    day = "Wednesday";
    day = "Thursday";
    day = "Friday";
    day = "Saturday";
    day = "Sunday";
    // day = "Tuesday";

    switch(day){
        case "Monday":
            System.out.println("Start of week");
            break;
        case "Tuesday":
            System.out.println("Work day");
            break;
        case "Wednesday":
            System.out.println("Work day");
            break;
        case "Thursday":
            System.out.println("Work day");
            break;
        case "Friday":
            System.out.println("Work day");
            break;
        case "Saturday":
            System.out.println("Weekend");
            break;
        case "Sunday":
            System.out.println("Weekend");
            break;
        default:
            System.out.println("Invaild Entry.");
        
    }



int choice = 3;

switch(choice){
    case 1:
        System.out.println("Add");
        break;
    case 2:
        System.out.println("Subtract");
        break;
    case 3:
        System.out.println("Multiply");
        break;
    case 4:
        System.out.println("Divide");
        break;
    default:
        System.out.println("None");
}

double a = 20;
double b = 5;
char operator = '*';

switch(operator){
    case '+':
        double result = a + b;
        System.out.println("Add" + " " + result);
        break;
    case '-':
        result = a - b;
        System.out.println("Subtract" + " " + result);
        break;
    case '*':
        result = a * b;
        System.out.println("Multiply" + " " + result);
        break;
    case '/':
        result = a / b;
        System.out.println("Divide" + " " + result);
        break;
    default:
        System.out.println("None");
}


for(int i=0; i<20;i++){
    int currentIndex = i + 1;
   if(currentIndex % 2 == 0) System.out.println(currentIndex);
}

int sum = 0;
for(int i=0; i <=100;i++){
    sum += i;
}
System.out.println(sum);

int number = 7;

for(int i=1;i <= 10; i++){
    int result = number * i;
    System.out.printf("%d x %d =%d %n",number,i,result);
}

for(int i =10; i>=0; i--){
    if(i > 0)System.out.println(i);
    else System.out.println("Blast off!");
}
int numbers = 1;

while(numbers <= 10){
    System.out.println(numbers);

    numbers++;
}

int i = 1;
while (i <= 30){
    if(i % 3 == 0){
        System.out.println(i);
    }
    // else{
    //     continue;
    // }
    i++;
}
int j = 1;
while (j <=50){
    System.out.println(j);
    if(j == 17) break;
    j++;
}

char menuChoice = 'a';
int counter = 0;
while (menuChoice != 'q') {
if(counter == 10) break;
System.out.println(menuChoice);
counter++;
    
}

}


}
