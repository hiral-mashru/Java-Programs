import java.util.Scanner;
public class ToggleEachCharOfStr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char a[]=str.toCharArray();
        for(int i=0;i<a.length;i++){
            int l = (int)a[i];
            if(l>=65 && l<=90){
                l +=  32;
                a[i] = (char)l;
            } else if(l>=97 && l<=122){
                l -= 32;
                a[i] = (char)l;
            } else {
                a[i] = (char)l;
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
    }
}
