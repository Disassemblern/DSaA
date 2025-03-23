import java.util.ArrayList;

public class T3_Q3<T> {
    private ArrayList<T> items; // actual stack data
    private int cursor;

    public T3_Q3() {
        items = new ArrayList<>();
        cursor = 0; // At the very top
    }

    public void push(T item) {
        items.add(item);
        cursor = 0;
    }

    public T pop() {
        if (items.isEmpty()) {
            return null;
        }
        T item = items.remove(items.size() - 1);
        cursor = 0;
        return item;
    }

    public T peek() {
        if (items.isEmpty() || cursor >= items.size()) {
            return null;
        }
        return items.get(items.size() - 1 - cursor);
    }

    public void top() {
        cursor = 0;
    }

    public void down() {
        if (cursor < items.size() - 1) {
            cursor++;
        } else {
            System.out.println("reached at the very bottom");
        }
    }
}
