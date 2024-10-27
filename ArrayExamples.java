import java.util.Arrays;

public class ArrayExamples {
    static void serialHello(String[] names) {
        for (int i = 0; i < names.length; i++) {
            System.out.println("Hello " + names[i] + "!");
        }
    }

    static double[] vectorAddition(double[] v1, double[] v2) {
        int dimension = v1.length;
        double[] sum = new double[dimension];
        for (int i = 0; i < dimension; i++) {
            sum[i] = v1[i] + v2[i];
        }
        return sum;
    }

    static void printTicTacToe(char[][] grid) {
        for (int y = 0; y < 3; y++) { // Zeile für Zeile
            for (int x = 0; x < 3; x++) {
                System.out.print(grid[x][y]);
            }
            System.out.println(); //Zeilenwechsel
        }
    }

    public static void main(String[] args) {
        String[] studentNames = { "Julia", "Adriana", "Samara", "Hanna" };
        serialHello(studentNames);
        System.out.println();

        System.out.println(Arrays.toString(vectorAddition(new double[] {0, -1}, new double[] {2.5, 0.5})));
        System.out.println(Arrays.toString(vectorAddition(new double[] {1, 2, 3}, new double[] {1, 0, 1})));
        System.out.println(Arrays.toString(vectorAddition(new double[] {1, 1, 1, 1, 1, 1}, new double[] {2, 0, 3, 0, 4, 8})));
        System.out.println();

        char[][] grid = { { 'X', 'X', 'O' },
                { 'O', 'O', 'X' },
                { 'X', 'O', 'O' } };
        printTicTacToe(grid);
    }
}
