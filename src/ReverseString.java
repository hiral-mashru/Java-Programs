import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch[] = str.toCharArray();
        char reverse[] = new char[ch.length];
        for(int i=0;i<ch.length;i++){
            reverse[ch.length-i-1] = ch[i];
        }
        System.out.println(String.valueOf(reverse));
    }
}
