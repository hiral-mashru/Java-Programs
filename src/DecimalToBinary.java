import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int dec = sc.nextInt();
        int b[] = new int[40];
        int i=0;
        while(dec>0){
            b[i] = dec%2;
            dec = dec / 2;
            i++;
        }
        System.out.print("binary: ");
        for(int j=i-1;j>=0;j--){
            System.out.print(b[j]);
        }
        System.out.println("");
    }
}
