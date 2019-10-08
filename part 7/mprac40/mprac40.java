import java.util.ArrayList;

class MyStack {
    ArrayList a = new ArrayList();
    private int size = 0;

    MyStack() {
    }

    MyStack(int a) {
        size = a;
    }

    boolean isEmpty() {
        return ((size == 0) ? true : false);
    }

    int getSize() {
        return size;
    }

    Object peek() {
        return a.get(size - 1);
    }

    Object pop() {
        Object x = a.get(size - 1);
        a.remove(size - 1);
        size--;
        return x;
    }

    void push(Object o) {
        a.add(o);
        size++;
    }
}

class mprac40 {
    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push("One");
        s.push("Two");
        s.push("Three");
        s.push("Four");
        s.push("Five");

        for (int i = 0; s.getSize() - 1 >= 0; i++) {
            System.out.println(s.pop());
        }

        System.out.println("\nNAME:MADHAV\nID:18DCS129\n");
    }
}
