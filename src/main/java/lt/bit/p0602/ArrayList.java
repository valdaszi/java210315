package lt.bit.p0602;

public class ArrayList<E> implements List<E> {

    private Object[] array; //  [0 1]
    private int size;       //  =0
    private final int arraySize;

    public ArrayList() {
        this(10);
    }

    public ArrayList(int arraySize) {
        this.arraySize = arraySize;
        array = new Object[arraySize];
    }

    private void resize() {
        if (size == array.length) {
            Object[] newArray = new Object[array.length + arraySize];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    private void checkIndex(int index) {
        if (index < 0 && index >= size) {
            throw new ArrayIndexOutOfBoundsException("index: " + index +
                    " but array size " + size);
        }
    }

    @Override
    public void add(E s) {
        resize();
        // irasom i gala ir padidinam size
        array[size++] = s;
    }

    //  0 1 2 3 4
    //  a b c d
    // add(1, x):
    //  a . b c d
    //    x
    @Override
    public void add(int index, E s) {
        checkIndex(index);
        resize();

        // 1) reikia pastumti i desine elementus nuo gali iki index
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }

        // 2) irasome i atlaisvinta vieta
        array[index] = s;

        // 3) padidinam size
        size++;
    }

    //  0 1 2 3 4 - size=5
    //  a b c d e
    // remove(1)
    //  a c d e
    @Override
    public void remove(int index) {
        checkIndex(index);

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        size--;
    }

    @Override
    public E get(int index) {
        checkIndex(index);
        return (E) array[index];
    }

    @Override
    public int size() {
        return size;
    }
}
