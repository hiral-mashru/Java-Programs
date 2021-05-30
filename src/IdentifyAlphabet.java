import java.util.Scanner;
public class IdentifyAlphabet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        char ch = Character.toLowerCase(c);
        if(ch>='a'&&ch<='z'){
            System.out.println(c+" is an alphabet.");
        } else {
            System.out.println(c+" is not an alphabet.");
        }
    }
}
