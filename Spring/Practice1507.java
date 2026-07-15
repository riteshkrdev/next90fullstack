public class Practice1507 {
    public static void main(String[] args) {
        int num[] = new int[5];
        for(int i=0;i <num.length;i++){
            num[i] = i + 1;
            System.out.println(num[i]);
        }
        num[2] = 90;
        int sum = 0;
        int averageNum = 0;
        int largestNumber = 0;
        int smallestNumber = num[num.length - 1];
        for(int i=0;i <num.length;i++){
            sum += num[i];
            averageNum = sum/5;
            if(num[i] > largestNumber) largestNumber = num[i];
            if(num[i] < smallestNumber) smallestNumber = num[i];
            System.out.println(num[i] + " " + sum + " " + averageNum + " " + largestNumber + " " + smallestNumber);
        }

    }
}
