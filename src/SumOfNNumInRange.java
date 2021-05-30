import java.util.Scanner;
public class SumOfNNumInRange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int sum=0;
        for(int i=start;i<=end;i++){
            sum += i;
        }
        System.out.println("Sum of numbers: "+sum);
    }
}
