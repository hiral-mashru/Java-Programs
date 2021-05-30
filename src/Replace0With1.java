import java.util.Scanner;
public class Replace0With1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while(temp>0){
            int i = temp%10;
            if(i==0){
                i=1;
            }
            sum = sum*10 + i;
            temp = temp/10;
        }
        int s = 0;
        int t = sum;
        while(t>0){
            int i = t%10;
            s = s*10 + i;
            t = t/10;
        }
        System.out.println(s);
    }
}
