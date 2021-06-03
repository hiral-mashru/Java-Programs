import java.util.Arrays;
import java.util.Scanner;
public class CheckAnagramStrings {
    
    static void sort(char[] ch){
        for(int i=0;i<ch.length;i++){
            for(int j=0;j<ch.length;j++){
                if(ch[j]>ch[i]){
                    char temp = ch[j];
                    ch[j] = ch[i];
                    ch[i] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        if(str1.length()!=str2.length()){
            System.out.println("not anagram");
        } else {
            char ch1[] = str1.toCharArray();
            char ch2[] = str2.toCharArray();
//            Arrays.sort(ch1);
//            Arrays.sort(ch2);
            sort(ch1);
            sort(ch2);
            boolean flag = false;
            for(int i=0;i<ch1.length;i++){
                if(ch1[i]!=ch2[i]){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.println("angram");
            } else {
                System.out.println("not anagram");
            }
        }
    }
}
        
