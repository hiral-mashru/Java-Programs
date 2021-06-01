import java.util.Scanner;
public class DrawSolidAndHollowRectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Hollow Rectangle: ");
        for(int i=0;i<b;i++){
            for(int j=0;j<l;j++){
                if(i==0 || i==b-1){
                    System.out.print("*");
                }else{
                    if(j==0 || j==l-1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println("");
        }
        System.out.println("Solid rectangle:");
        for(int i=0;i<b;i++){
            for(int j=0;j<l;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
