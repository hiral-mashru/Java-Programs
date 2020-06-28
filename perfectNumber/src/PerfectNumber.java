import java.util.Scanner;
public class PerfectNumber {

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0){
            int sum = 0;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    if(i*j==n){
                        System.out.println(i+" "+j);
                        sum=sum+i;
                        sum=sum+j;
                    }
                    
                }
            }
            System.out.println("sum of it's factors: "+(sum-n));
            if((sum-n)==n){
                System.out.println("PERFECT...");
            }
            else {
                System.out.println("IMPERFECT...");
            }
        } else {
            System.out.println("Enter positive number..");
        }
    }
    
}
