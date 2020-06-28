import java.util.Scanner;
public class IsAlphabetOrNot {

    public static void main(String[] args) {
        System.out.println("Enter the character: ");
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if((c>='a' && c<='z') || (c>='A' && c<='Z')){
            System.out.println("characters..");
        } else{
            System.out.println("else");
        }
    }
    
}
