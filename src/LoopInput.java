import java.util.Scanner;

public class LoopInput {
    public static void main(String[] args){
        int i;
        Scanner key = new Scanner(System.in);
        System.out.print("Please enter an integer equal to or higher than 1: ");
        i = key.nextInt();
        for (i=i ;i>=1;i--){
            System.out.println(i);
        }
    }
}
