package arrays;

import java.util.Locale;
import java.util.Random;

public class E03_TwoDDoubleArray {

    static double[][] createDoubleArray(int sizeX, int sizeY, double valStart, double valEnd) {
        double[][] result = new double[sizeX][sizeY];
        double increment = (valEnd - valStart) / (sizeX * sizeY);
        double val = valStart;
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = val;
                val += increment;
            }
        }
        return result;
    }

    static void printDoubleArray(double[][] arr) {
        for(double[] dd : arr) {
            for (double d: dd) {
                System.out.printf(Locale.US, "%.2f ", d);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printDoubleArray(createDoubleArray(4, 6, 47.0, 99.0));
    }

}
