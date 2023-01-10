package arrays;

import utils.BerylliumSphere;

import java.util.Arrays;

public class E06_Filling2DArray {

    static BerylliumSphere[][] fill(int sizeX, int sizeY) {
        BerylliumSphere[][] arr = new BerylliumSphere[sizeX][sizeY];
        for (int i = 0; i < sizeX; i++)
            for (int j = 0; j < sizeY; j++)
                arr[i][j] = new BerylliumSphere();
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(fill(3, 3)));
    }
}
