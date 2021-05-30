import java.util.Scanner;
public class ASCIIOfChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        System.out.println("ASCII value of "+c+" is : "+(int)c);
    }
}
