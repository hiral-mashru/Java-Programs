import java.util.Scanner;
public class VowelOrConsonant {

    public static void main(String[] args) {
        System.out.println("Enter the character: ");
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if(c=='A'|| c == 'E' || c == 'I' || c == 'o' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            System.out.println("vowels");
        } else if((c>= 'a' && c<='z')||(c>='A' && c<='Z')){
            System.out.println("Consonants");
        } else {
            System.out.println("else...");
        }
    }
    
}
