package arrays;

import utils.BerylliumSphere;

import java.util.Arrays;

public class E07_Filling3DArray {
    static BerylliumSphere[][][] fill(int sizeX, int sizeY, int sizeZ) {
        BerylliumSphere[][][] arr = new BerylliumSphere[sizeX][sizeY][sizeZ];
        for (int i = 0; i < sizeX; i++)
            for (int j = 0; j < sizeY; j++)
                for (int n = 0; n < sizeZ; n++)
                    arr[i][j][n] = new BerylliumSphere();
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(fill(3, 3, 3)));
    }
}
