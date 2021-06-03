import java.util.Scanner;
public class SumOfNumsInStr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch[] = str.toCharArray();
        int count = 0;
        for(int i=0;i<ch.length;i++){
            if((int)ch[i]>=48 && (int)ch[i]<=57){
                count += (int)ch[i]-48;
            }
        }
        System.out.println(count);
    }
}
