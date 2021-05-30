import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int reverse=0;
        while(temp>0){
            reverse = (reverse*10) + (temp % 10);
            temp = temp / 10;
        }
        System.out.println("Reverse number: "+reverse);
    }
}
