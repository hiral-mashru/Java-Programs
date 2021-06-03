import java.util.Scanner;
public class FrequencyOfCharsInStr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c = sc.next().charAt(0);
        char ch[] = str.toCharArray();
        int f = 0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]==c){
                f++;
            }
        }
        System.out.println("freq of "+c+" is: "+f);
    }
}
