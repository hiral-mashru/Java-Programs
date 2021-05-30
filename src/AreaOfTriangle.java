import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Area of triangle: "+(0.5)*l*b);
    }
}