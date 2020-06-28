import java.util.Scanner;
public class Add2Fraction {

    public static void main(String[] args) {
        System.out.println("write number i this format: a/b");
        System.out.println("Enter 1st number: ");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println("Enter 2nd number: ");
        String b = sc.nextLine();
        if(a.contains("/") && b.contains("/") && a.matches(".*\\d.*") && b.matches(".*\\d.*")){
            String[] strarr1 = a.split("/");
            String[] strarr2 = b.split("/");
            int[] intarr1 = new int[2];
            int[] intarr2 = new int[2];
            
            for (int count = 0; count < 2 ; count++) {
                intarr1[count] = Integer.parseInt(strarr1[count]);
                intarr2[count] = Integer.parseInt(strarr2[count]);
            }
            if(intarr1[1] != 0 && intarr2[1] != 0){
                int lcm = (intarr1[1]>intarr2[1] ? intarr1[1] : intarr2[1]);
                while(true){
                    if(lcm%intarr1[1]==0 && lcm%intarr2[1]==0) {
                          System.out.println(lcm);
                        break;
                    }
                    ++lcm;
                }
                int x = 0,y = 0;
                    if(lcm%intarr1[1]==0) {
                        x = (lcm/intarr1[1]);
                        //System.out.println(x);
                    }
                    if(lcm%intarr2[1]==0) {
                        y = (lcm/intarr2[1]);
                        //System.out.println(y);
                    }
                intarr1[0] = intarr1[0] * x;
                intarr2[0] = intarr2[0] * y;
                intarr1[1] = lcm;
                intarr2[1]=lcm;
                int ans1 = intarr1[0]+intarr2[0];
                if(ans1 % lcm == 0){
                System.out.println("Ans: "+(ans1/lcm));
            } else {
                System.out.println("Ans: "+ans1+"/"+lcm);
            }
                
        }
        else {
            System.out.println("Enter value in given format");
        }
        } else {
            System.out.println("Denomitordoesn't contain 0");
        }
    }
    
}
