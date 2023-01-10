package arrays;

import utils.Generated;
import utils.Generator;
import utils.RandomGenerator;

import java.util.Arrays;
import java.util.Collections;

public class E23_ArraySort2 {
    public static void main(String[] args) {
        Generator<Integer> gen =
                new RandomGenerator.Integer(1000);
        Integer[] a = Generated.array(new Integer[25], gen);
        System.out.println("Unsorted array: " + Arrays.toString(a));
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println("Sorted array: " + Arrays.toString(a));
    }
}
