import java.util.Scanner;
public class SumOfDigitsOfNumber {

    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        int temp =n;
        while(temp>0) {
            int r = temp % 10;
            sum = sum + r;
            temp = temp / 10;
        }
        System.out.println("Sum of "+n+": "+sum);
    }
    
}
