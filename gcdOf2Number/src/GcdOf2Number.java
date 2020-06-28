import java.util.Scanner;
public class GcdOf2Number {

    public static void main(String[] args) {
        System.out.println("Enter 1st numbers: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int y = sc.nextInt();
        //int gcd = (x<y) ? x : y;
        int gcd=1;
        int i=1;
        while(i<=x && i<=y){
            if(x%i==0 && y%i==0){
                gcd=i;
            }
            i++;
        }
        System.out.println("GCD of "+x+" and "+y+" is: "+gcd);
    }
    
}
