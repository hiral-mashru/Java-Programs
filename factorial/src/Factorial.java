import java.util.Scanner;
public class Factorial {
    
    int factorial(int n){
        int fact=1;
        if(n==0){
            return 1;
        } else if(n>0){
            for(int i=1;i<=n;i++){    
                fact=fact*i;    
            } 
            return fact;
        }else{}
        return 0;
    }
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Factorial f = new Factorial();
        System.out.println("factorial of "+n+": "+f.factorial(n));
        
        
    }
    
}
