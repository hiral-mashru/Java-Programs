import java.util.Scanner;
public class ArmstrongNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = 0;
        int temp = n;
        while(temp>0){
            temp = temp / 10;
            l++;
        }
        int sum = 0;
        int tmp = n;
        while(tmp>0){
            int fact = 1;
            for(int i=0;i<l;i++){
                fact *= tmp%10;
            }
            sum += fact;
            tmp = tmp / 10;
        }
        if(sum==n){
            System.out.println(n+" is armstrong");
        }
    }
}
