import java.util.Scanner;
public class MatchStrWithWildcardStr {
    
    static boolean match(String s1,String s2){
        if(s1.length()==0 && s2.length()==0){
            return true;
        }
        if(s1.length()>0 && s1.charAt(0)=='*' && s2.length()==0){
            return false;
        }
        
        if((s1.length()>0 && s1.charAt(0)=='?') || (s1.length()!=0 && s2.length()!=0 && s1.charAt(0)==s2.charAt(0))){
            return match(s1.substring(1),s2.substring(1));
        }
        
        if(s1.length()>0 && s1.charAt(0)=='*'){
            return match(s1,s2.substring(1)) || match(s1.substring(1),s2);
        }
        return false;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        if(match(str1,str2)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
