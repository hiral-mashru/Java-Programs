import java.util.Scanner;

class StrongNumber {
    
    public static void main(String[] args){
        System.out.println("Enter a number: ");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        int r=0;
        int sum = 0;
        while(n>0){
            r=n%10;
            int fact=1;
            while(r>0){
                fact=fact*r;
                r--;
            }
            sum=sum+fact;
            n=n/10;
        }
        System.out.println("sum of it's factorials: "+sum);
        if(sum==m){
            System.out.println("This is a strong number...");
        } else {
            System.out.println("not strong number...");
        }
    }
}