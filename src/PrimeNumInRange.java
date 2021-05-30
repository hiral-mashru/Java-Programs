import java.util.Scanner;
public class PrimeNumInRange {
    
    static void findPrime(int n){
        boolean flag = false;
        for(int j=2;j<n;j++){
            if(n%j==0){
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println(n+ " ");
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int i = start;
        while(i<=end){
            findPrime(i);
            i++;
        }
    }
}
