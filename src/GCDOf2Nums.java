import java.util.Scanner;
public class GCDOf2Nums {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int l = (a<b) ? a : b;
        int gcd = 1;
        for(int i=1;i<=l;i++){
            if(a%i==0 && b%i==0){
                gcd = i;
            }
        }
        System.out.println("gcd: "+gcd);
    }
}
