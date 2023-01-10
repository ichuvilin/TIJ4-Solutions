package arrays;

import utils.BerylliumSphere;

import java.util.Arrays;

public class E02_ReturningArray {

    static BerylliumSphere[] createArray(int size) {
        BerylliumSphere[] arr = new BerylliumSphere[size];
        for (int i = 0; i < arr.length; i++) arr[i] = new BerylliumSphere();
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(createArray(5)));
    }
}
