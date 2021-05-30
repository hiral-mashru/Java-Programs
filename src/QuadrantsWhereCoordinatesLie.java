import java.util.Scanner;
public class QuadrantsWhereCoordinatesLie {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x==0 && y==0){
            System.out.println("Origin");
        } else if(x==0 && y>0){
            System.out.println("+Y");
        } else if(x==0 && y<0){
            System.out.println("-Y");
        } else if(x>0 && y==0){
            System.out.println("+X");
        } else if(x<0 && y==0){
            System.out.println("-X");
        } else if(x>0 && y>0){
            System.out.println("1st");
        } else if(x>0 && y<0){
            System.out.println("4th");
        } else if(x<0 && y<0){
            System.out.println("3rd");
        } else if(x<0 && y>0){
            System.out.println("2nd");
        } 
    }
}
