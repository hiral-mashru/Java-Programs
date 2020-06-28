import java.util.Scanner;
public class SumOfNumber {
    
    public static void main(String[] args) {
        
        int sum = 0;
        System.out.println("Enter length of numbers: ");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        System.out.println("Enter ur numbers: ");
        int arr[] = new int[len];
        for(int i=0;i<len;i++){
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("sum of numbers: "+sum);
        
    }
    
}
