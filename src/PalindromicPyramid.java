import java.util.Scanner;
public class PalindromicPyramid {
    
    public static void halfPyramidWithNums(int n){
        for(int i=1;i<=n;i++){
            int k=1;
            for(int j=1;j<=2*i-1;j++){
                if(j<=i){
                    System.out.print(k+" ");
                    k++;
                } else {
                    k--;
                    System.out.print((k-1)+" ");
                }
            }
            System.out.println("");
        }
    }
    
    public static void halfPyramidWithAlphabets(int n){
        // 65 to 90
        for(int i=1;i<=n;i++){
            int k=65;
            for(int j=1;j<=2*i-1;j++){
                if(j<=i){
                    System.out.print((char)(k)+" ");
                    k++;
                } else {
                    k--;
                    System.out.print((char)(k-1)+" ");
                }
            }
            System.out.println("");
        }
    }
    
    public static void fullPyramidWithNums(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            int k=1;
            for(int j=1;j<=2*i-1;j++){
                if(j<=i){
                    System.out.print(k+" ");
                    k++;
                } else {
                    k--;
                    System.out.print((k-1)+" ");
                }
            }
            System.out.println("");
        }
    }
    
    public static void fullPyramidWithAlphabets(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            int k=65;
            for(int j=1;j<=2*i-1;j++){
                if(j<=i){
                    System.out.print((char)(k)+" ");
                    k++;
                } else {
                    k--;
                    System.out.print((char)(k-1)+" ");
                }
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        halfPyramidWithNums(n);
        System.out.println("--------------------");
        halfPyramidWithAlphabets(n);
        System.out.println("--------------------");
        fullPyramidWithNums(n);
        System.out.println("--------------------");
        fullPyramidWithAlphabets(n);
    }
}
