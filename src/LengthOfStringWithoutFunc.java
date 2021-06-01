import java.util.Scanner;
public class LengthOfStringWithoutFunc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int l = 0;
        for(char c: str.toCharArray()){
            l++;
        }
        System.out.println(l);
    }
}
