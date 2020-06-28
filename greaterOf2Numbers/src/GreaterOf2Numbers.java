import java.util.Scanner;
public class GreaterOf2Numbers {

    public static void main(String[] args) {
        System.out.println("Enter 1st number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = sc.nextInt();
        int gr = (a>b) ? a : b;
        System.out.println("Greatest: "+gr);
    }
    
}
