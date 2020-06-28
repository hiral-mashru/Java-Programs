import java.util.Scanner;
public class GreatestOf3Numbers {

    public static void main(String[] args) {
        System.out.println("Enter 1st number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.println("Enter 3rd number: ");
        int c = sc.nextInt();
        int gr1 = (a>b) ? a : b;
        int gr2 = (gr1>c) ? gr1 : c;
        System.out.println("Greatest: "+gr2);
    }
    
}
