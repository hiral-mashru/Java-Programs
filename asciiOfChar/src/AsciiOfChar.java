import java.util.Scanner;
public class AsciiOfChar {

    public static void main(String[] args) {
        System.out.println("Enter the character: ");
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        int value = (int) c;
        System.out.println("value of "+c+": "+value);
    }
}
