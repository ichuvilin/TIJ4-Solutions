package arrays;

import utils.BerylliumSphere;

import java.lang.reflect.Field;
import java.util.Arrays;

public class E18_ArrayCopy {
    static void setID(BerylliumSphere bs, long value) {
        try {
            Field fid =
                    BerylliumSphere.class.getDeclaredField("id");
            fid.setAccessible(true);
            fid.setLong(bs, value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        BerylliumSphere[] ba1 = new BerylliumSphere[4];
        Arrays.fill(ba1, new BerylliumSphere());
        BerylliumSphere[] ba2 = new BerylliumSphere[8];
        Arrays.fill(ba2, new BerylliumSphere());
        System.out.println("ba1 = " + Arrays.toString(ba1));
        System.out.println("ba2 = " + Arrays.toString(ba2));
        System.arraycopy(ba1, 0, ba2, 4, ba1.length);
        System.out.println("ba1 = " + Arrays.toString(ba1));
        System.out.println("ba2 = " + Arrays.toString(ba2));
        setID(ba1[0], -1L);
        System.out.println("ba1 = " + Arrays.toString(ba1));
        System.out.println("ba2 = " + Arrays.toString(ba2));
    }
}
