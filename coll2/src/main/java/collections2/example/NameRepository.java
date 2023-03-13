package collections2.example;

import java.util.ArrayList;

public class NameRepository<T> implements Container {

    private ArrayList<T> names;

    public NameRepository(ArrayList<T> names) {
        this.names = names;
    }

    @Override
    public MyIterator getIterator() {
        return new NameIterator<T>(this);
    }

    private class NameIterator<T> implements MyIterator<T> {

        int index;
        public ArrayList<T> names;

        public NameIterator(NameRepository n) {
            this.names = n.names;
        }

        @Override
        public boolean hasNext() {

            if(index < names.size()){
                return true;
            }
            return false;
        }

        @Override
        public T next() {

            if(this.hasNext()){
                return names.get(index++);
            }
            return null;
        }

        @Override
        public void remove() {
            names.remove(index - 1);
            index--;
        }
    }
}