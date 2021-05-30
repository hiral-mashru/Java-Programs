import java.util.Scanner;
public class PalindromeNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int rn = 0;
        while(temp>0){
            rn = (rn*10) + (temp%10);
            temp = temp / 10;
        }
        if(n==rn){
            System.out.println("palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}