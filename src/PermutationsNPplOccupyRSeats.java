import java.util.Scanner;
public class PermutationsNPplOccupyRSeats {
    
    static int fact(int x){
        int fact = 1;
        for(int i=x;i>=1;i--){
            fact *= i;
        }
        return fact;
    }
    
    static int fact1(int n,int r){
        int fact = 1;
        for(int i=n;i>r;i--){
            fact *= i;
        }
        return fact;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int temp;
        if(n<r){
            temp = n;
            n = r;
            r = temp;
        }
        System.out.println("permutations: "+(fact(n)/fact(n-r)));
        // second method
        System.out.println("permutations: "+fact1(n,n-r));
    }
}
