public class ArrayDeque<Item> {
    Item[] item;
    int size;
    int front;
    int back;
    static double factor = 0.25;
    float usage;

    public int size() {
        return size;
    }

    public ArrayDeque() {
        item = (Item[]) new Object[8];
        size = 0;
        usage = 0;
        front = 2;
        back = 2;

    }

    public ArrayDeque(Item a) {
        item = (Item[]) new Object[8];
        int size = 1;
        usage = (float) size / (float) item.length;
        front = 2;
        back = 3;
        item[front] = a;
    }

    public void resize() {
        if(usage < factor) {
            return;
        }
        else {
            Item[] newitem = (Item[]) new Object[(int) (size/factor)];
            for(int i = 0; i<size; i++) {
                newitem[i] = this.get(i);
            }
            front = 0;
            back = size -1;
            item = newitem;
        }
    }

    public Item addLast(Item a) {
        item[back] = a;
        back = addpointerLast(back);
        size += 1;
        usage = (float) size / (float) item.length;
        resize();
        return a;
    }

    public Item addFirst(Item a) {
        front = addpointerFirst(front);
        item[front] = a;
        size += 1;
        usage = (float) size / (float) item.length;
        resize();
        return a;
    }

    public Item removeLast() {
        Item a = item[back - 1];
        back = back - 1;
        item[back] = null;
        size = size - 1;
        usage = (float) size / (float) item.length;
        resize();
        return a;
    }

    public Item removeFirst() {
        Item a = item[front];
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
            System.out.println(item[i]);
        }
    }

    public Item get(int index) {
        if (index < back - front)
            return this.item[index + front];
        else return null;
    }

}
