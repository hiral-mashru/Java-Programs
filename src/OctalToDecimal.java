import java.util.Scanner;
public class OctalToDecimal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int oct = sc.nextInt();
        int dec = 0,base = 1;
        while(oct>0){
            int r = oct%10;
            dec += base*r;
            base *= 8;
            oct = oct/10;
        }
        System.out.println("decimal: "+dec);
    }
}
