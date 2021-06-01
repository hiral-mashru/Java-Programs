import java.util.Scanner;
public class Compare2Strings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(str1.equals(str2));
        
        // without function
        if(str1.length()!=str2.length()){
            System.out.println("not same");
        } else {
            char ch1[] = new char[str1.length()];
            char ch2[] = new char[str2.length()];
            for(int i=0;i<str1.length();i++){
                ch1[i]=str1.charAt(i);
            }
            for(int i=0;i<str2.length();i++){
                ch2[i]=str2.charAt(i);
            }
            int l = 0;
            for(int i=0;i<str1.length();i++){
                if(ch1[i]==ch2[i]){
                    l++;
                } 
            }
            if(l==str1.length()){
                System.out.println("same");
            } else {
                System.out.println("not same");
            }
        }
        
    }
}
