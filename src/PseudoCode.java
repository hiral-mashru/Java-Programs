
public class PseudoCode {
    public static int func(int n){
        if(n>100){
            return n-10;
        }
        return func(func(n+11));
    }
    public static void main(String[] args){
        int ans = func(1);
        System.out.println("i: "+ans);
//        int arr [] = {1,2,3,4,5};
//        System.out.println(arr[5]);
    }
}
