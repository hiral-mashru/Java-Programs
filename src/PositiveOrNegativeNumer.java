import java.util.Scanner;
public class PositiveOrNegativeNumer {
    public static void main(String[] args){
        System.out.println("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num==0){
            System.out.println("Number "+num+" is zero.");
        } else if(num<0){
            System.out.println("Number "+num+" is negative.");
        } else {
            System.out.println("Number "+num+" is positive.");
        }
    }
}
