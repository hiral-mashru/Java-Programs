import java.util.Scanner;
import java.lang.Math.*;
public class AreaOfCircle {
    
    public static void main(String[] args) {
        System.out.println("Enter the radius of circle: ");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double area = Math.PI*r*r;
        System.out.println("Area of radius: "+area);
    }
    
}
