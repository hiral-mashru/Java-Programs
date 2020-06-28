import java.util.Scanner;
public class LcmOf2Numbers {

    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        int lcm = (a>b) ? a : b;
        while(true){
            if(lcm%a==0 && lcm%b==0){
                System.out.println("lcm : "+lcm);
                break;
                
            }
            lcm++;
        }
    }
    
}
