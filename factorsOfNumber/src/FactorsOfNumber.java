import java.util.Scanner;
public class FactorsOfNumber {
    
    public static void main(String[] args) {
        System.out.println("enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i*j==n){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
    
}
