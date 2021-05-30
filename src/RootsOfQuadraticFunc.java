import java.text.DecimalFormat;
import java.util.Scanner;
public class RootsOfQuadraticFunc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double dicriminant = (b*b - 4*a*c);
        double root1, root2;
        double image,real;
        if(dicriminant > 0){
            root1 = Double.parseDouble(new DecimalFormat("##.##").format((-b+Math.sqrt(dicriminant))/(2*a)));
            root2 = Double.parseDouble(new DecimalFormat("##.##").format((-b-Math.sqrt(dicriminant))/(2*a)));
            System.out.println("root1: "+root1);
            System.out.println("root2: "+root2);
        } else if(dicriminant==0){
            root1 = Double.parseDouble(new DecimalFormat("##.##").format(-b/(2*a)));
            root2 = root1;
            System.out.println("root1 = root2 = "+root1);
        } else {
            image = Double.parseDouble(new DecimalFormat("##.##").format(Math.sqrt(-dicriminant)/(2*a)));
            real = Double.parseDouble(new DecimalFormat("##.##").format(-b/(2*a)));
            System.out.println("root1 = "+real+"+"+image+"i");
            System.out.println("root1 = "+real+"-"+image+"i");
        }
    }
}
