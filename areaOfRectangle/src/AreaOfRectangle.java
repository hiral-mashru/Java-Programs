import java.util.*;
public class AreaOfRectangle {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle: ");
        double l = sc.nextDouble();
        System.out.println("Enter the width of rectangle: ");
        double b = sc.nextDouble();
        double area = l*b;
        System.out.println("Area of rectangle: "+area);
    }
    
}
