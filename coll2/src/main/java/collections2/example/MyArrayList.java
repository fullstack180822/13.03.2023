package collections2.example;

import java.util.ArrayList;

public class MyArrayList <E> extends MyAbstractList<E>
        implements MyList<E>, GetNumber<Integer> {

    ArrayList<E> items;

    @Override
    public E getItem(int index) {
        return null;
    }

    @Override
    public Integer getNumber() {
        return null;
    }
}
