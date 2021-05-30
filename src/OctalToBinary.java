import java.util.Scanner;
public class OctalToBinary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int oct = sc.nextInt();
        int dec = 0, base=1;
        int o = oct;
        while(o>0){
            int r = o%10;
            dec = dec + base*r;
            base *= 8;
            o = o/10;
        }
        System.out.println("decimal : "+dec);
        int b[] = new int[40];
        int d =dec;
        int i=0;
        while(d>0){
            b[i++] = d%2;
            d=d/2;
        }
        System.out.print("binary: ");
        for(int j=i-1;j>=0;j--){
            System.out.print(b[j]);
        }
        System.out.println("");
    }
}
