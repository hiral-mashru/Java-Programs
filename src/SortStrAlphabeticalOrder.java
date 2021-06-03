import java.util.Arrays;
import java.util.Scanner;
public class SortStrAlphabeticalOrder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch[] = str.toCharArray();
        for(int j=0;j<ch.length;j++){
            for(int i=0;i<ch.length;i++){
                if(ch[j]<ch[i]){
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }
//        second way
//        Arrays.sort(ch);
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]);
        }
    }
}
