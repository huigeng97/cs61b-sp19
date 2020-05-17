
import javax.swing.event.SwingPropertyChangeSupport;
import java.util.Iterator;
import java.util.SplittableRandom;
import java.util.function.IntToDoubleFunction;

public class ArraySet<T>  implements Iterable<T>  {
    private T[] items;
    int size;

    public ArraySet() {
        items = (T[]) new Object[100];
        size = 0;
    }

    /* Returns true if this map contains a mapping for the specified key.
     */
    public boolean contains(T x) {
        for (int i = 0; i < size; i += 1) {
            if(items[i] == null){
                if(x== null){
                    //throw new IllegalArgumentException("Key" + x + "doesn't exist");
                    return true;
                }
                return false;
            }
            if (items[i].equals(x)) {
                return true;
            }
        }
        return false;
    }
    public Iterator<T> iterator() {
        return new ArraySetIterator();
    }




    private class ArraySetIterator implements Iterator<T>  {
        private int wizPos;

        public ArraySetIterator() {
            wizPos = 0;
        }

        public boolean hasNext() {
            return wizPos < size;
        }

        public T next() {
            T returnItem = items[wizPos];
            wizPos += 1;
            return returnItem;
        }
    }


    @Override
    public String toString() {
        StringBuilder returnSB = new StringBuilder("{");
        for (int i = 0; i < size - 1; i += 1) {
            returnSB.append(items[i].toString());
            returnSB.append(", ");
        }
        returnSB.append(items[size - 1]);
        returnSB.append("}");
        return returnSB.toString();
    }

    @Override
    public boolean equals(Object other){
        if(this == other){
            return true;
        }
        if(other == null) {
            return false;
        }
        if (other.getClass() != this.getClass()) {
            return false;
        }
        ArraySet<T> o = (ArraySet<T>) other;
        if (o.size() != this.size()) {
            return false;
        }
        for (T item : this){
            if(!o.contains(item)){
                return false;
            }

        }
        return true;

    }
    public static <Glerp> ArraySet<Glerp> of(Glerp ... items){
        ArraySet<Glerp> returnSet = new ArraySet<Glerp>();
        for(Glerp x: items) {
            returnSet.add(x);
        }
        return returnSet;

    }

    /* Associates the specified value with the specified key in this map.
       Throws an IllegalArgumentException if the key is null. */
    public void add(T x) {
    //   if (x == null){
     //       throw new IllegalArgumentException("Can't add null");
     //  }
        if (contains(x)){
            return;
        }
        items[size] = x;
        size += 1;
    }

    /* Returns the number of key-value mappings in this map. */
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        ArraySet<String> s = new ArraySet<>();
        s.add(null);
        s.add("horse");
        s.add("fish");
        s.add("house");
        s.add("fish");
        System.out.println(s.contains("horse"));
        System.out.println(s.size());
        System.out.println(s.contains(null));


        ArraySet<Integer> aset = new ArraySet<>();
        aset.add(5);
        aset.add(34);
        aset.add(35);


        for (int i : aset){
            System.out.println(i);
        }
        System.out.println(aset);

        ArraySet<String> asetOfStrings = ArraySet.of("hi", "I'm", "here");
        System.out.println(asetOfStrings);
    }


    /* Also to do:
    1. Make ArraySet implement the Iterable<T> interface.
    2. Implement a toString method.
    3. Implement an equals() method.
    */
}