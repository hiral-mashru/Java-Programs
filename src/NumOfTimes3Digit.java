import java.util.Scanner;
public class NumOfTimes3Digit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i=2;i<=n;i++){
            int r = i;
            while(r>0){
                if((r%10)/3==1 && (r%10)%3==0){
                    count++;
                }
                r=r/10;
            }
        }
        System.out.println("count of 3: "+count);
    }
}
