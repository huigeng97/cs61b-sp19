public interface Deque<T> {
    public void addFirst(T item);
    void addLast(T item);
    T removeLast();
    T removeFirst();
    boolean isEmpty();
    int size();
    T get(int index);
    void printDeque();

}
