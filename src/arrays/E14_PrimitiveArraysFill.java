package arrays;

import utils.CountingGenerator;
import utils.Generator;

import java.lang.reflect.Array;
import java.util.Arrays;

import static utils.Print.print;

class Fill {
    public static void primitive(Object array, Generator<?> gen) {
        int size = Array.getLength(array);
        Class<?> type = array.getClass().getComponentType();
        for (int i = 0; i < size; i++)
            if (type == Boolean.TYPE)
                Array.setBoolean(array, i, (Boolean) gen.next());
            else if (type == Byte.TYPE)
                Array.setByte(array, i, (Byte) gen.next());
            else if (type == Short.TYPE)
                Array.setShort(array, i, (Short) gen.next());
            else if (type == Integer.TYPE)
                Array.setInt(array, i, (Integer) gen.next());
            else if (type == Character.TYPE)
                Array.setChar(array, i, (Character) gen.next());
            else if (type == Float.TYPE)
                Array.setFloat(array, i, (Float) gen.next());
            else if (type == Double.TYPE)
                Array.setDouble(array, i, (Double) gen.next());
            else if (type == Long.TYPE)
                Array.setLong(array, i, (Long) gen.next());
    }
}

public class E14_PrimitiveArraysFill {
    public static void main(String[] args) {
        int size = 5;
        boolean[] a1 = new boolean[size];
        byte[] a2 = new byte[size];
        char[] a3 = new char[size];
        short[] a4 = new short[size];
        int[] a5 = new int[size];
        long[] a6 = new long[size];
        float[] a7 = new float[size];
        double[] a8 = new double[size];

        Fill.primitive(a1, new CountingGenerator.Boolean());
        print("a1 = " + Arrays.toString(a1));
        Fill.primitive(a2, new CountingGenerator.Byte());
        print("a2 = " + Arrays.toString(a2));
        Fill.primitive(a3, new CountingGenerator.Character());
        print("a3 = " + Arrays.toString(a3));
        Fill.primitive(a4, new CountingGenerator.Short());
        print("a4 = " + Arrays.toString(a4));
        Fill.primitive(a5, new CountingGenerator.Integer());
        print("a5 = " + Arrays.toString(a5));
        Fill.primitive(a6, new CountingGenerator.Long());
        print("a6 = " + Arrays.toString(a6));
        Fill.primitive(a7, new CountingGenerator.Float());
        print("a7 = " + Arrays.toString(a7));
        Fill.primitive(a8, new CountingGenerator.Double());
        print("a8 = " + Arrays.toString(a8));
    }
}
