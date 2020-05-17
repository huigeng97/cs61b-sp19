

import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestMap {


    public static<K,V> V get(Map61B<K , V> map, K key){
        if (map.containsKey(key)) {
            return map.get(key);
        }
        return null;
    }
    public static <K extends Comparable<K>,V> K maxkey(Map61B<K,V> map){
        List<K> keylist = map.keys();
        K largest = keylist.get(0);
        for(int i = 0; i<map.size(); i+=1){
            K k = keylist.get(i);
            if (k.compareTo(largest) >0){
                largest = k;
            }

        }
        return largest;
    }
    public static void main(String[] arg){
        ArrayMap<Integer, String> isMap = new ArrayMap<Integer, String>();
        isMap.put(5,"3");
        isMap.put(100,"4");
        isMap.put(100,"8");
        System.out.println(TestMap.get(isMap, 100));
        System.out.println(TestMap.maxkey(isMap));
    }
}
