import java.util.Scanner;
public class VowelOrConsonant {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        char c = Character.toLowerCase(ch);
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            System.out.println(c+" is vowel.");
        } else {
            System.out.println(ch+" is consonant.");
        }
    }
}
