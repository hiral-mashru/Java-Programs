import java.util.Scanner;
public class RemoveBracketsFromExpression {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch[] = str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='(' || ch[i]==')' || ch[i]=='{' || ch[i]=='}' || ch[i]=='[' || ch[i]==']'){
                ch[i] = '\0';
            }
        }
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]);
        }
    }
}
