package lt.bit.p0602;

public interface List<E> {

    void add(E s);

    void add(int index, E s);

    void remove(int index);

    E get(int index);

    int size();

}
