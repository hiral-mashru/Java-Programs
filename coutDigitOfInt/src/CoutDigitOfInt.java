import java.util.Scanner;
public class CoutDigitOfInt {

    public static void main(String[] args) {
        System.out.println("Enter integer: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 0;
        int count = 0;
        while(n!=0) {
            r = n % 10;
            count++;
            n = n / 10;
        }
        System.out.println("Count: "+count);
    }
    
}
