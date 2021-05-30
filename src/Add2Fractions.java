import java.util.Scanner;
public class Add2Fractions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int aa[] = new int[2];
        aa[0] = Integer.parseInt(a.split("/")[0]);
        aa[1] = Integer.parseInt(a.split("/")[1]);
        String b = sc.next();
        int bb[] = new int[2];
        bb[0] = Integer.parseInt(b.split("/")[0]);
        bb[1] = Integer.parseInt(b.split("/")[1]);
        int lcm = aa[1]>bb[1] ? aa[1] : bb[1];
        while(true){
            if(lcm%aa[1]==0 && lcm%bb[1]==0){
                System.out.println("lcm : "+lcm);
                break;
            }
            lcm++;
        }
        if(lcm%(aa[0]+bb[0])==0){
            System.out.println("ans: 1/"+(lcm/(aa[0]+bb[0])));
        } else if ((aa[0]+bb[0])%lcm == 0){
            System.out.println("ans: "+((aa[0]+bb[0])/lcm));
        } else {
            System.out.println("ans: "+aa[0]+bb[0]+"/"+lcm);
        }
    }
}
