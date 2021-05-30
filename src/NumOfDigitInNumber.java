import java.util.Scanner;
public class NumOfDigitInNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int l=0;
        while(temp>0){
            temp = temp / 10;
            l++;
        }
        System.out.println("length : "+l);
    }
}
