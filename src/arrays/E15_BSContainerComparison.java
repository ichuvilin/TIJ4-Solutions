package arrays;

import utils.BerylliumSphere;
import utils.Generated;
import utils.Generator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BSGenerator implements Generator<BerylliumSphere> {
    public BerylliumSphere next() {
        return new BerylliumSphere();
    }
}

public class E15_BSContainerComparison {
    public static void main(String[] args) {
        BSGenerator gen = new BSGenerator();
        BerylliumSphere[] spheres = Generated.array(
                BerylliumSphere.class, gen, 5);
        System.out.println(Arrays.toString(spheres));
        System.out.println(spheres[4]);
        List<BerylliumSphere> sphereList = Arrays.asList(
                Generated.array(BerylliumSphere.class, gen, 5));
        System.out.println(sphereList);
        System.out.println(sphereList.get(4));
        int[] integers = {0, 1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(integers));
        System.out.println(integers[4]);
        List<Integer> intList = new ArrayList<>(
                Arrays.asList(0, 1, 2, 3, 4, 5));
        intList.add(97);
        System.out.println(intList);
        System.out.println(intList.get(4));
    }
}
