import java.util.Scanner;
public class DiamondWithNums {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i+1;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
        System.out.println("------------------------------------");
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i+1;j++){
                System.out.print(i+1);
            }
            System.out.println("");
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print(i);
            }
            System.out.println("");
        }
        System.out.println("---------------------------------");
        for(int i=0;i<n;i++){
            for(int j=n-i-1;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i+1;j++){
                System.out.print(j);
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println("");
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=i-1;j>=1;j--){
                System.out.print(j);
            }
            System.out.println("");
        }
        System.out.println("---------------------------------");
        int r = (n+1)/2;
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
        for(int i=r-1;i>=1;i--){
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}