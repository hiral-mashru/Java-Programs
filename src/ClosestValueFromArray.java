import java.util.Scanner;

public class ClosestValueFromArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int l = sc.nextInt();
        int arr[] = new int[l];
	for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
	}
	int target = 12;
	int diff[] = new int[arr.length];
	for(int i=0;i<arr.length;i++){
	    if(target-arr[i] < 0){
	        diff[i] = arr[i] - target;
	    } else {
	        diff[i] = target - arr[i];
	    }
	}
        int min=diff[0];
        int temp = 0;
        for(int i=0;i<arr.length;i++){
            if(diff[i]<min){
                min=diff[i];
                temp=i;
            }
        }
	System.out.println("closest value "+arr[temp]);
    }
}
