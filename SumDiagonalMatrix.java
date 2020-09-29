import java.util.Scanner;

public class SumDiagonalMatrix {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] matrix = new int[4][4];

        String introText = "Oppgi en 4x4 matrise rad for rad (adskill tallene med mellomrom):",
                sumText = "Summen av diagonalen er: %18.2f %n",
                averageText = "Gjennomsnittet av tall i diagonalen er: %.2f %n";

        System.out.println(introText);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = input.nextInt();

            }

        }

        System.out.printf(sumText, sumDiagonal(matrix));
        System.out.printf(averageText, averageDiagonal(matrix));
    }

    public static double sumDiagonal(int matrix[][]) {
        double sum = 0;

        for (int i = 0, j = 0; i < matrix.length; i++, j++) {
            sum += matrix[i][j];

        }

        return sum;
    }

    public static double averageDiagonal(int matrix[][]) {

        return sumDiagonal(matrix) / 4;
    }
}
