import java.util.Scanner;
public class StrongNumber {
    
    public static int fact(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact *= i;
        }
        return fact;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while(temp>0){
            sum += fact(temp%10);
            temp = temp / 10;
        }
        if(n==sum){
            System.out.println(n+" is strong numer.");
        } else {
            System.out.println(n+" is not strong number.");
        }
    }
}
