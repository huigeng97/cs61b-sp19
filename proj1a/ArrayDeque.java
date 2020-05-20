public class ArrayDeque<T> implements Deque<T> {
    T[] item;
    private int size;
    private int front;
    private int back;
    private static double factor = 0.25;
    private float usage;

    public int size() {
        return size;
    }



    public ArrayDeque() {
        item = (T[]) new Object[8];
        size = 0;
        usage = 0;
        front = 2;
        back = 2;

    }

//    public ArrayDeque(T a) {
//        item = (T[]) new Object[8];
//        int size = 1;
//        usage = (float) size / (float) item.length;
//        front = 2;
//        back = 3;
//        item[front] = a;
//    }

    public void resize() {
        if(usage <= factor) {
            return;
        }
        else {
            T[] newitem = (T[]) new Object[(int) (size/factor)];
            for(int i = 0; i<=size; i++) {
                newitem[i] = get(i);
            }
            front = 0;
            back = size;
            item = newitem;
        }
    }

    public void addLast(T a) {

        item[back] = a;
        back = addpointerLast(back);
        size += 1;
        usage = (float) size / (float) item.length;
        resize();
        return;
    }



    public void addFirst(T a) {
        front = addpointerFirst(front);
        item[front] = a;
        size += 1;
        usage = (float) size / (float) item.length;
        resize();
        return;
    }

    public T removeLast() {
        if (size == 0) {
            return null;
        }
        T a = item[back - 1];
        back = back - 1;
        item[back] = null;
        size = size - 1;
        usage = (float) size / (float) item.length;
        resize();
        return a;
    }

    public T removeFirst() {
        if (size == 0) {
            return null;
        }
        T a = item[front];
        item[front] = null;
        front = front + 1;
        size = size - 1;
        usage = (float) size / (float) item.length;
        resize();
        return a;
    }

    private int addpointerFirst(int nextFirst) {
        if (nextFirst != 0) {
            // move First pointer backward
            nextFirst -= 1;
        } else {
            // move First pointer to the end of Array.
            nextFirst = item.length - 1;
        }
        return nextFirst;
    }

    private int addpointerLast(int nextLast) {
        if (nextLast != item.length - 1) {
            // move Last pointer forward
            nextLast += 1;
        } else {
            // move First pointer to the end of Array.
            nextLast = 0;
        }
        return nextLast;
    }




    public boolean isEmpty() {
        return (size == 0);
    }

    public void printDeque() {
        for (int i = 0; i < size; i++) {
            System.out.println(get(i));
        }
    }

    public T get(int index) {
        if (index < (back - front)) {
            return this.item[index + front];
        } else {
            if (front + index <item.length){
                return item[front + index];
            } else {
                return item[index - item.length + front];
            }
        }

    }

}
