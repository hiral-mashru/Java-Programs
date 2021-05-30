import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int bin = sc.nextInt();
        int dec = 0,base = 1;
        int n = bin;
        while(n>0){
            int r = n % 10;
            dec += base*r;
            base *= 2;
            n = n/10;
        }
        System.out.println("decimal : "+dec);
    }
}
