import java.util.Scanner;
public class PrintNonRepeatingChars {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        String ans = "";
        for(int i=0;i<ch.length;i++){
            int f = 0;
            for(int j=0;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    f++;
                }
            }
            if(f==1){
                ans += ch[i]+" ";
            }
        }
        System.out.println(ans);
    }
}
