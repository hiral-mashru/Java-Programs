import java.util.*;

public class IntToStrStrToIntHexToBinary {
    
    static String intToString(int num){
        int l = 0;
        int temp = num;
        while(temp>0){
            temp = num/10;
            System.out.println("l "+l);
            l++;
        }
        System.out.println("l:- "+l);
        return "";
    }
    
    static int stringToInt(String str){
        int num = 0;
        for(int i=0;i<str.length();i++){
            num = num*10 + ((int)str.charAt(i)-48);
        }
        return num;
    }    
    
    static String IntegerToString(int number){

        int eachDigit = number;
        int afterDivide = number;
        String reVal = "";
        while(afterDivide >0)
        {
            eachDigit = afterDivide % 10;
            afterDivide = afterDivide / 10;
            if(eachDigit == 0)
            {
                reVal += "0";
            }
            else if(eachDigit == 1)
            {
                reVal += "1";
            }
            else if(eachDigit == 2)
            {
                reVal += "2";
            }
            else if(eachDigit == 3)
            {
                reVal += "3";
            }
            else if(eachDigit == 4)
            {
                reVal += "4";
            }
            else if(eachDigit == 5)
            {
                reVal += "5";
            }
            else if(eachDigit == 6)
            {
                reVal += "6";
            }
            else if(eachDigit == 7)
            {
                reVal += "7";
            }
            else if(eachDigit == 8)
            {
                reVal += "8";
            }
            else if(eachDigit == 9)
            {
                reVal += "9";
            }
        }
        String reVal2 = "";
        for(int index =  reVal.length() -1 ; index >= 0 ; index--)
        {
            reVal2 += reVal.charAt(index);
        }
        return reVal2;
    }
    
    static String HextoBinary(String hex){
        hex = hex.toUpperCase();
        HashMap<Character,String> hash = new HashMap<Character,String>();
        hash.put('0', "0000");
        hash.put('1', "0001");
        hash.put('2', "0010");
        hash.put('3', "0011");
        hash.put('4', "0100");
        hash.put('5', "0101");
        hash.put('6', "0110");
        hash.put('7', "0111");
        hash.put('8', "1000");
        hash.put('9', "1001");
        hash.put('A', "1010");
        hash.put('B', "1011");
        hash.put('C', "1100");
        hash.put('D', "1101");
        hash.put('E', "1110");
        hash.put('F', "1111");
        String binary = "";
        char ch;
        for(int i=0;i<hex.length();i++){
            ch = (char)hex.charAt(i);
            if(hash.containsKey(ch)){
                binary += hash.get(ch);
            }
        }
        
        return "";
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        System.out.println(stringToInt(str));
        
        int num = sc.nextInt();
        System.out.println(""+num);
        System.out.println(IntegerToString(num));
    }
}
