package DataStrues.ListTable;

public interface ListMethods<T> {
    void clear();
    boolean isEmpty();
    int length();
    T get(int i);
    void insert(T t);
    void insert(int i, T t);
    T remove(int i);
    int indexOf(T t);
}
