import java.util.Arrays;
import java.util.Scanner;

public class NotReapitingArray {

    public static void main(String[] args) {
        Scanner length=new Scanner(System.in);
        System.out.println("enter the length of array");
        int n=length.nextInt();
    int arr[]=new int[n];
        System.out.println("Enter the number of element of arrey");
        Scanner arrey=new Scanner(System.in);
        for (int i=0;i<n;i++) {
            arr[i] = arrey.nextInt();
        }
        for (int i=0;i<n;i++) {
            System.out.print(arr[i]);
        }
        int countArray[]=new int[arr.length];
        for (int i=0;i<arr.length;i++){
            countArray[i]=0;
        } for (int i=0;i<arr.length;i++){
        for (int j=0;j<arr.length;j++){
            if (i!=j&&arr[i]==arr[i]){
                countArray[i]++;
            }
        }
    }
        System.out.println(Arrays.toString(countArray));
        for (int i=0;i<arr.length;i++){
            if (countArray[i]==0){
                System.out.println(arr[i]);
                break;
            }
        }
}
}
