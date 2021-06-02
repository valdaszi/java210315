package lt.bit.p0602;

public interface StringList {

    void add(String s);

    void add(int index, String s);

    void remove(int index);

    String get(int index);

    int size();
}

