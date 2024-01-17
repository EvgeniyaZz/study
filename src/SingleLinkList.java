import java.util.Iterator;

public class SingleLinkList<T> implements Iterable<T> {

    ElementList<T> first;
    ElementList<T> last;

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            ElementList<T> current = first;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                T data = current.data;
                current = current.next;
                return data;
            }
        };
    }

    public void addElement(T element) {
        ElementList<T> newElement = new ElementList<>();
        newElement.data = element;
        if (first == null) {
            first = newElement;
            last = newElement;
        } else {
            last.next = newElement;
            last = newElement;
        }
    }

    public void reverse() {
        if (first != null && first.next != null) {
            last = first;
            ElementList<T> current = first.next;
            first.next = null;
            while (current != null) {
                ElementList<T> next = current.next;
                current.next = first;
                first = current;
                current = next;
            }
        }
    }

    public static class ElementList<T> {
        T data;
        ElementList<T> next;
    }
}