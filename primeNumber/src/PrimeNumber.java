import java.util.Scanner;
public class PrimeNumber {
    boolean prime(int n){
        
       int x = 0; 
       int y=0;
        for(int i=2;i<n;i++){
            if((n%i==0)){
                x = 1;
            } else {
                y = 2;
            }
        }
        if(x==1){
            return false;
        } else {
            return true;
        }
        
    }
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrimeNumber pn = new PrimeNumber();
        System.out.println("Ans: "+pn.prime(n));
    }
    
}
