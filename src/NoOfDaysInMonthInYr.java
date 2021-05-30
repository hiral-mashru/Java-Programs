import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class NoOfDaysInMonthInYr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(1,31);
        hm.put(3,31);
        hm.put(4,30);
        hm.put(5,31);
        hm.put(6,30);
        hm.put(7,31);
        hm.put(8,30);
        hm.put(9,31);
        hm.put(10,30);
        hm.put(11,31);
        hm.put(12,30);
        if((year%400==0) || (year%4==0 && year%100!=0)){
            hm.put(2,29);
        } else {
            hm.put(2,28);
        }
        for(Map.Entry<Integer,Integer> e: hm.entrySet()){
            if(month==e.getKey()){
                System.out.println("days: "+e.getValue());
            }
        }
//        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
//            System.out.print("Number of days is 31");
//	else if((month == 2) && ((year%400==0) || (year%4==0 && year%100!=0))){
//            System.out.print("Number of days is 29");
//	}else if(month == 2){
//            System.out.print("Number of days is 28");
//	}else
//            System.out.println("Number of days is 30");   
    }
}

