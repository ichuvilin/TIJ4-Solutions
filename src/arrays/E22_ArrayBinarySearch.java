package arrays;

import utils.ConvertTo;
import utils.Generated;
import utils.Generator;
import utils.RandomGenerator;

import java.util.Arrays;

public class E22_ArrayBinarySearch {
    public static void main(String[] args) {
        Generator<Integer> gen =
                new RandomGenerator.Integer(1000);
        int[] a = ConvertTo.primitive(
                Generated.array(new Integer[25], gen));
        System.out.println("Unsorted array: " + Arrays.toString(a));
        int location = Arrays.binarySearch(a, a[10]);
        System.out.println("Location of " + a[10] + " is " + location);
        if(location >= 0)
            System.out.println(", a[" + location + "] = " + a[location]);
        else
            System.out.println();
        location = Arrays.binarySearch(a, a[5]);
        System.out.println("Location of " + a[5] + " is " + location);
        if(location >= 0)
            System.out.println(", a[" + location + "] = " + a[location]);
    }
}
