public class LoopAsterickSquare {

    public static void main(String[] args) {
        int rows = 9;

        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= rows; ++j) {
                System.out.print("*"+ "\t");
            }
            System.out.println("");
        }
    }
}
