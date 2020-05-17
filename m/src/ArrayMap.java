import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayMap<K,V> implements Map61B<K,V> , Iterable<K> {
    private K[] keys;
    private V[] values;
    int size;

    public List<V> values(){
        List<V> newreturn = new ArrayList<V>();
         for( int i = 0; i<size; i+=1){
             newreturn.add(values[i]);
         }
    return newreturn;
    }

    public ArrayMap(){
        keys = (K[]) new Object[100];
        values = (V[]) new Object[100];
        size = 0;
    }
    public Iterator<K> iterator(){
        List<K> keylist = keys();
        return keylist.iterator();
    }

    private int keyIndex(K key){
        for (int i = 0; i< size; i +=1){
            if (keys[i].equals(key)){
                return i;
            }
        }
        return -1;
    }

    public boolean containsKey(K key){
        int index = keyIndex(key);
        return  index > -1;
    }

    public  void  put(K key, V value){
        int index = keyIndex(key);
        if (index == -1){
            keys[size] = key;
            values[size] = value;
            size += 1;
            return;
        }
        values[index] = value;
    }

    public V get(K key){
        int index = keyIndex(key);
        if(index < 0) {
            throw new IllegalArgumentException("Key " + key + " does not exist in map.");
        }

        return  values[index];

    }

    public int size() {
        return size;
    }

    public List<K> keys() {
        List<K> keyList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            keyList.add(keys[i]);
        }
        return keyList;
    }

    @Test
    public void test() {
        ArrayMap<Integer, Integer> am = new ArrayMap<Integer, Integer>();
        am.put(2, 5);
        am.put(3, 6);

        int expected = 5;

        for(Integer i : am){
            System.out.println(i);
        }
     //   assertEquals(Integer.valueOf(expected), am.get(2));
        assertEquals( expected , am.get(2).intValue());
    }

}
