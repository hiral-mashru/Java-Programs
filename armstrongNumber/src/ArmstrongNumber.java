import java.util.Scanner;
public class ArmstrongNumber {
    
    boolean armstrong(int len, int[] a,int temp){
        int sum=0;
        int mul = 1;
        int o[] = new int[len];
        for(int i=0;i<len;i++){
            o[i]=(int) Math.pow(a[i], len);
            sum=sum+o[i];
            
        }
        System.out.println(sum);
        return (sum==temp);
    }
    public static void main(String args[]) {
        ArmstrongNumber an = new ArmstrongNumber();
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int a[] = new int[10];
        int r = 0;
        int len=0, i=0;
        while(n>0) {
            r=n%10;
            len++;
            a[i]=r;i++;
            n=n/10; 
        }
        //System.out.println(len);
        System.out.println("armstrong or not?: "+an.armstrong(len, a, temp));
        
    }
    
}
