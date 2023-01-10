package arrays;

import java.util.*;

public class E25_PythonLists {

    public static void main(String[] args) {
        List<Integer> aList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(aList.getClass().getSimpleName());
        System.out.println(aList);
        System.out.println(aList.get(4));
        aList.add(6);
        aList.addAll(Arrays.asList(7, 8));
        System.out.println(aList);
        List<Integer> aSlice = aList.subList(2, 4);
        System.out.println(aSlice);

        class MyList<T> extends ArrayList<T> {
            MyList(Collection<? extends T> c) {
                super(c);
            }

            MyList(int initialCapacity) {
                super(initialCapacity);
            }

            List<T> getReversed() {
                List<T> reversed = new MyList<T>(size());
                ListIterator<T> it = listIterator(size());
                while (it.hasPrevious()) reversed.add(it.previous());
                return reversed;
            }
        }

        MyList<Integer> list2 = new MyList<>(aList);

        System.out.println(list2.getClass().getSimpleName());

        System.out.println(list2.getReversed());
    }
}
