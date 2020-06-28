import java.util.Scanner;
public class Fibonacci {

    public static void main(String[] args) {
        int n = 0;
        System.out.println("Enter the length of fibonacci series: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print("0"+" "+"1"+" ");
        int c = 0;
        for(int i=0;i<n;i++)
        {
            
            c = a+b;
            System.out.print(c+" ");
            a = b;
            b = c;
            
        }
    }
    
}
