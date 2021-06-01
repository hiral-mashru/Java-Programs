import java.util.Scanner;
public class DiamondWithStars {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=(2*n-1);i++){
            if(i<=n){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("* ");
                }
            } else {
                for(int j=1;j<=i-n;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=n-(i-n);j++){
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
        System.out.println("-----------------------------------------");
        for(int i=1;i<=(2*n-1);i++){
            if(i<=n){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    if(j==1 || j==i)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
            } else {
                for(int j=1;j<=i-n;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=n-(i-n);j++){
                    if(j==1 || j==n-(i-n))
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
            }
            System.out.println("");
        }
        System.out.println("---------------------------------");
        for(int i=1;i<=2*n-1;i++){
            if(i<=n){
                for(int j=1;j<=i;j++){
                    System.out.print("* ");
                }
            } else {
                for(int j=1;j<=n-(i-n);j++){
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
        System.out.println("---------------------------------");
        for(int i=1;i<=n+1;i++){
            for(int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("---------------------------------");
        for(int i=1;i<=n+1;i++){
            System.out.print("* ");
            if(i>1){
                for(int j=1;j<=i-1;j++){
                    System.out.print(j+" ");
                }
                for(int j=i-2;j>=1;j--){
                    System.out.print(j +" ");
                }
                System.out.print("* ");
            }
            System.out.println("");
        }
        for(int i=n;i>=1;i--){
            System.out.print("* ");
            for(int j=1;j<=i-1;j++){
                System.out.print(j+" ");
            }
            for(int j=i-2;j>=1;j--){
                System.out.print(j+" ");
            }
            if(i!=1){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
