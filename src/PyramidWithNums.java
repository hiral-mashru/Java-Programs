import java.util.Scanner;
public class PyramidWithNums {
    
    public static void halfPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    } 
    
    public static void invertedHalfPyramid(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
    
    public static void fullPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            int k =i;
            int l = 0;
            for(int j=1;j<=2*i-1;j++){
                if(l<i){
                    System.out.print(k+" ");
                    k++; l++;
                } else {
                    k--;
                    System.out.print((k-1)+" ");
                    l++;
                }
            }
            System.out.println("");
        }
    }
    
    // not totally completed
    public static void pascalPyramid(int n){
        int coef = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            System.out.print("1  ");
            for(int j=1;j<=i-2;j++){
                coef = coef * (i - j + 1) / j;
                System.out.print((i-1)+"  ");
            }
            if(i!=1){
                System.out.print("1");
            }
//            for(int j=0;j<i;j++){
//                int res = 1;
//                if(j>i-j){
//                    j=i-j;
//                }
//                for(int k =0;k<j;++k){
//                    res *= (i-k);
//                    res /= k+1;
//                }
//                System.out.print(res+" ");
//            }
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
        pascalPyramid(n);
   }
}
