import java.util.Scanner;
public class LCMOf2Num {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int lcm = a>b ? a : b;
        while(true){
            if(lcm%a==0 && lcm%b==0){
                System.out.println("lcm: "+lcm);
                break;
            }
            lcm++;
        }
    }
}
    