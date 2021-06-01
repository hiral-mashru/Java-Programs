import java.util.Scanner;
public class CheckPalindromeString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch[] = str.toCharArray();
        boolean l = false;
        for(int i=0;i<ch.length/2;i++){
            if(ch[ch.length-i-1]!=ch[i]){
                l = true;
            }
        }
        if(l){
            System.out.println("not palindrome");
        } else {
            System.out.println("palindrome");
        }
    }
}
