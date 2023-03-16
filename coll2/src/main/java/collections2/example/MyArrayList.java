package collections2.example;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList <E> extends MyAbstractList<E>
        implements MyList<E>, GetNumber<Integer> {

    ArrayList<E> items;

    void compare(E e) {
        items.contains(e);

    }

    @Override
    public E getItem(int index) {
        return null;
    }

    @Override
    public Integer getNumber() {
        return null;
    }
}
