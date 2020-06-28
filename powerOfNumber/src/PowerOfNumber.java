import java.util.Scanner;
public class PowerOfNumber {

    public static void main(String[] args) {
        System.out.println("Enter numer: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter power of "+n+": ");
        int p = sc.nextInt();
        int mul = 1;
        int i=1;
        while(i<=p){
            mul = mul * n;
            i++;
        }
        System.out.println(mul);
    }
    
}
