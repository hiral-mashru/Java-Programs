import java.util.Scanner;
public class PyramidWithStars {
    
    public static void halfPyramid(int n){
        for(int i=1;i<=5;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
    public static void invertedHalfPyramid(int n){
        for(int i=n;i>=1;i--){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
    public static void flippedHalfPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>0;j--){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
    public static void fullPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>0;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
    public static void fullPyramid2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
    public static void invertedFullPyramid(int n){
        for(int i=n;i>=1;i--){
            for(int j=n-i;j>0;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
    public static void invertedFullPyramid2(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
    public static void invertedFlippedPyramid(int n){
        for(int i=n;i>=1;i--){
            for(int j=n-i;j>0;j--){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        halfPyramid(n);
        System.out.println("--------------");
        invertedHalfPyramid(n);
        System.out.println("--------------");
        fullPyramid(n);
        System.out.println("--------------");
        flippedHalfPyramid(n);
        System.out.println("--------------");
        invertedFullPyramid(n);
        System.out.println("--------------");
        invertedFlippedPyramid(n);
        System.out.println("--------------");
        fullPyramid2(n);
        System.out.println("--------------");
        invertedFullPyramid2(n);
    }
}
