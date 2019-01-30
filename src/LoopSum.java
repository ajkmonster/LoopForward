import java.util.Scanner;

public class LoopSum {
    public static void main(String[] args) {
        int i;
        int sum=0;
        Scanner key = new Scanner(System.in);
        System.out.print("Please enter a number from 1-100: ");
        i = key.nextInt();
        for (int j=i;j>=1;j--){
            sum = sum+ j;
            }
        System.out.println("Sum from " +i+ "-1 is: "+ sum);
        }

    }
