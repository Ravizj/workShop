import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        int sum=0;
        Scanner num=new Scanner(System.in);
        System.out.println("Enter the number");
        int digit=num.nextInt();
        while (digit!=0){
             sum +=digit%10;
             digit=digit/10;

        }
        System.out.println("sum of Digit is= "+sum);

    }
}
