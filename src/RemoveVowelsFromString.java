import java.util.Scanner;
public class RemoveVowelsFromString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch[] = str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' || ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U'){
                ch[i] = '\0';
            }
        }
        String ans = "";
        for(int i=0;i<ch.length;i++){
            ans+=ch[i];
        }
        System.out.println(ans);
    }
}
