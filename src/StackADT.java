public interface StackADT<T> {
    boolean push(T elemento);
    T pop();
    T peek();
    boolean isEmpty();
    int size();
    void clear();
    int search(T item);
    String toString();
}
