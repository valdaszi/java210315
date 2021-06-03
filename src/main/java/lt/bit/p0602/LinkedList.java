package lt.bit.p0602;

public class LinkedList<E> implements List<E>{


    class Node {
        E element;
        Node prev;
        Node next;

        public Node(E element) {
            this.element = element;
        }
    }

    private Node root;
    private int size;
    private Node last;

    @Override
    public void add(E s) {
        if (size == 0) {
            root = last = new Node(s);
        } else {
            Node node = new Node(s);
            last.next = node;
            node.prev = last;
            last = node;
        }
        size++;
    }

    private void checkIndex(int index) {
        if (index < 0 && index >= size) {
            throw new ArrayIndexOutOfBoundsException("index: " + index +
                    " but array size " + size);
        }
    }


    private Node getNode(int index) {
        Node node = root;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    //  a <-> b <-> c
    //        ?
    //  a <-> x <-> b <-> c

    @Override
    public void add(int index, E s) {
        checkIndex(index);
        if (index == size) add(s);
        else if (index == 0) {
            Node node = new Node(s);
            root.prev = node;
            node.next = root;
            root = node;
            size++;
        } else {
            Node nodeB = getNode(index);
            Node nodeA = nodeB.prev;
//            Node nodeC = nodeB.next;
            Node node = new Node(s); // nodeX
            node.prev = nodeA;
            node.next = nodeB;
            nodeA.next = node;
            nodeB.prev = node;
            size++;
        }
    }

    // root -> a <-> b
    // root ->       b

    // ... x <-> y <-> z <-- last
    // ... x <-> y       <-- last

    // ... k <-> l <-> m ...
    //     k <-------> m
    @Override
    public void remove(int index) {
        checkIndex(index);
        if (index == 0) {
            root = root.next;
            root.prev = null;
            size--;
        } else if (index == size - 1) {
            last = last.prev;
            last.next = null;
            size--;
        } else {
            Node node = getNode(index);
            Node nodeK = node.prev;
            Node nodeM = node.next;
            nodeK.next = nodeM;
            nodeM.prev = nodeK;
            node.prev = null;
            node.next = null;
            size--;
        }
    }

    @Override
    public E get(int index) {
        checkIndex(index);
        Node node = getNode(index);
        return node.element;
    }

    @Override
    public int size() {
        return size;
    }
}
