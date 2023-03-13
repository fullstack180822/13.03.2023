package collections2.example;

public interface MyIterator<T> {

    public boolean hasNext();

    public T next();

    public void remove();
}
