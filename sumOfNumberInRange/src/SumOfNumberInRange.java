import java.util.Scanner;
public class SumOfNumberInRange {

    public static void main(String[] args) {
        System.out.println("Enter start: ");
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        System.out.println("Enter end: ");
        int end = sc.nextInt();
        int sum = 0;
        while(start<=end){
            sum = sum + start;
            start++;
        }
        System.out.println("Sum: "+sum);
    }
    
}
