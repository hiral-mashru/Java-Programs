import java.util.Scanner;
public class SumOfDigitsOfNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = n;
        while(i>0){
            sum += i % 10;
            i = i / 10;
        }
        System.out.println("Sum of digits of given number: "+sum);
    }
}
