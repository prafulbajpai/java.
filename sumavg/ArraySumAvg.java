import java.util.Scanner;
import java.util.Arrays;
public class ArraySumAvg {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int n = 5;
        int[] numbers = new int[n];
        for (int i = 0; i < 5; i++) {
            numbers[i] = a.nextInt();
        }

        int max =0 ;
        for(int i = 0;i<5;i++){
            if (numbers[i]>max){
                max = numbers[i] ;
            }
        }
        System.out.println("max number in array : " + max);
        System.out.println("enter the nth value for the heighest number : " + max);
        int n1 = a.nextInt();
        Arrays.sort(numbers);
        System.out.println("enter the nth highest value is : " +numbers[n1-1]);
            a.close();
    }
}  