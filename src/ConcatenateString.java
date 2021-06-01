import java.util.Scanner;
public class ConcatenateString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = sc.nextLine();
        str += str1;
        System.out.println(str);
    }
}
