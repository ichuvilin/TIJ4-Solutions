package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class E24_ArraySearch {
    public static void main(String[] args) {
        Comparator<DataHolder> comp =
                new Comparator<>() {
                    public int compare(DataHolder o1, DataHolder o2) {
                        return (o1.data < o2.data ? -1 :
                                (o1.data == o2.data ? 0 : 1));
                    }
                };
        DataHolder[] a = new DataHolderWithEquals[10];
        for (int i = 0; i < a.length; i++)
            a[i] = new DataHolderWithEquals(i);
        Arrays.sort(a, comp);
        int location = Arrays.binarySearch(a, a[7], comp);
        System.out.println("Location of " + a[7] + " is " + location);
        if (location >= 0)
            System.out.println(", a[" + location + "] = " + a[location]);
        else
            System.out.println();
        location = Arrays.binarySearch(a, a[5], comp);
        System.out.println("Location of " + a[5] + " is " + location);
        if (location >= 0)
            System.out.println(", a[" + location + "] = " + a[location]);
    }
}
