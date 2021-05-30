import java.util.Scanner;
public class DecimalToOctal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int dec = sc.nextInt();
        int oct[] = new int[40];
        int i=0;
        while(dec>0){
            oct[i++] = dec%8;
            dec = dec/8;
        }
        System.out.print("Octal: ");
        for(int j=i-1;j>=0;j--){
            System.out.print(oct[j]);
        }
        System.out.println("");
    }
}
