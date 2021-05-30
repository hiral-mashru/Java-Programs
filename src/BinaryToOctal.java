import java.util.Scanner;
public class BinaryToOctal {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int bin = sc.nextInt();
        int dec=0;
        int base =1;
        int b = bin;
        while(b>0){
            int r = b%10;
            dec += base*r;
            base = base*2;
            b=b/10;
        }
        System.out.println("decimal: "+dec);
        int o[] = new int[40];
        int d = dec;
        int i=0;
        while(d>0){
            o[i++] = d%8;
            d = d/8;
        }
        System.out.print("octal: ");
        for(int j=i-1;j>=0;j--){
            System.out.print(o[j]);
        }
        System.out.println("");
    }
}
