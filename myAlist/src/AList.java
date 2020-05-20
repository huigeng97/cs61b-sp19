package src;

public class AList<Item> implements List61B<Item> {
    /** Creates an empty list. */
    public Item[] item;
    int size;

    public AList() {
        item =  (Item[]) new Object[100];
        size = 0;


    }

    /** Inserts X into the back of the list. */
    public void addLast(Item x) {

        item[size] = x;
        size += 1;



    }




    /** Returns the item from the back of the list. */
    public Item getLast() {
        return item[size];
    }
    /** Gets the ith item in the list (0 is the front). */
    public Item get(int i) {
        return item[i];
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size+1;
    }

    /** Deletes item from back of the list and
     * returns deleted item. */
    public Item removeLast() {
        Item a = getLast();
        item[size] = null;
        size -= 1;
        return a;
    }
} 