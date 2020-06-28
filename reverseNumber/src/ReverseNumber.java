import java.util.Scanner;
public class ReverseNumber {

    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int r = 0;
        while(n>0) {
            r = n % 10;
            System.out.print(r);
            n = n / 10;
        }
    }
    
}
