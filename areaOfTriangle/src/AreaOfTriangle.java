import java.util.*;
public class AreaOfTriangle {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of triangle: ");
        double l = sc.nextDouble();
        System.out.println("Enter the base of triangle: ");
        double b = sc.nextDouble();
        double area = (0.5)*l*b;
        System.out.println("Area of triangle: "+area);
    }
    
}
