import java.util.Scanner;
public class CopyString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        System.out.println("1st way");
        char [] ch = str.toCharArray();
        String copy = "";
        for(int i=0;i<ch.length;i++){
            copy+=ch[i];
        }
        System.out.println(copy);
        
        
        System.out.println("2nd way");
        char[] ch1 = new char[str.length()];
        for(int i=0;i<ch1.length;i++){
            ch1[i]=str.charAt(i);
        }
        String copy1 = "";
        for(int i=0;i<ch1.length;i++){
            copy1+=ch1[i];
        }
        System.out.println(copy1);
        
        
        System.out.println("3rd way");
        String copy2 = str;
        System.out.println(copy2);
        
        
        System.out.println("4th way");
        String strCopy = String.valueOf(str);
        System.out.println(strCopy);
        
        
        System.out.println("5th way");
        String strCopy1 = String.valueOf(str.toCharArray(), 0, str.length());
        System.out.println(strCopy1);
        
        
        System.out.println("6th way");
        String strCopy3 = String.copyValueOf(str.toCharArray());
        System.out.println(strCopy3);
        
        
        System.out.println("7th way");
        String strCopy4 = String.copyValueOf(str.toCharArray(), 0, str.length());
        System.out.println(strCopy4);
        
        System.out.println("8th way");
        char [] chh = str.toCharArray();
        char [] cpych = new char[chh.length];
        for(int i=0;i<chh.length;i++){
            cpych[i]=chh[i];
        }
        System.out.println(String.valueOf(cpych));
   }
}
