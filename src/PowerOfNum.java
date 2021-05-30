import java.util.Scanner;
public class PowerOfNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        int pow = 1;
        for(int i=0;i<e;i++){
            pow *= n;
        }
        System.out.println("Power of "+n+" is : "+pow);
    }
}
