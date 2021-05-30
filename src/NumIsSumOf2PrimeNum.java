import java.util.Scanner;
public class NumIsSumOf2PrimeNum {
    
    static int prime(int a){
        boolean flag = false;
        for(int i=2;i<a;i++){
            if(a%i==0){
                flag = true;
                break;
            }
        }
        if(!flag){
            return a;
        } else {
            return 0;
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<n;i++){
            int a = prime(i);
            if(a!=0){
                a = n-a;
                a = prime(a);
                if(a!=0){
                    System.out.println(n+" can be expressed as sum of "+a+" and "+(n-a));
                }
            }
        }
    }
}
