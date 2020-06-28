import java.util.Scanner;
public class PositiveOrNegative {

    public static void main(String[] args) {
        int n =0;
        System.out.print("Enter number:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(n>0){
            System.out.println(n+" is positive");
        } else {
            System.out.println(n+" is negative");
        }
    }
    
}
