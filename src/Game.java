import java.util.Scanner;

public class Game {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int count = 0;
        while(n>0){
            if(n%2==0){
                n=n/2;
                count++;
            } else {
                n--;
                count++;
            }
        }
        System.out.println(count);
    }
}
