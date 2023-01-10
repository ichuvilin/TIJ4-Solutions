package arrays;

import java.util.Arrays;
import java.util.Locale;

public class E04_ThreeDDoubleArray {


    static double[][][] createDoubleArray(int sizeX, int sizeY,int sizeZ, double valStart, double valEnd) {
        double[][][] result = new double[sizeX][sizeY][sizeZ];
        double increment = (valEnd - valStart) / (sizeX * sizeY * sizeZ);
        double val = valStart;
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                for (int n = 0; n < result[i][j].length; n++) {
                    result[i][j][n] = val;
                    val += increment;
                }
            }
        }
        return result;
    }

    static void printDoubleArray(double[][][] arr) {
        for(double[][] i : arr) {
            for (double[] j : i) {
                for (double n : j) {
                    System.out.printf(Locale.US, "%.2f ", n);
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printDoubleArray(createDoubleArray(5, 6, 5, 47.0, 99.0));
    }
}
