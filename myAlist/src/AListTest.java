package src;

import org.junit.Test;
import static org.junit.Assert.*;

/** Tests the AList class.
 *  @author Josh Hug
 */

public class AListTest {
    @Test
    public void testEmptySize() {
        AList L = new AList();
        assertEquals(0, L.size());
    }

    @Test
    public void testAddAndSize() {
        AList L = new AList();
        L.addLast(99);
        L.addLast(99);
        assertEquals(2, L.size());
    }


    @Test
    public void testAddAndGetLast() {
        AList L = new AList();
        L.addLast(99);
        assertEquals(99, L.getLast());
        L.addLast(36);
        assertEquals(36, L.getLast());
    }


    @Test
    public void testGet() {
        AList L = new AList();
        L.addLast(99);
        assertEquals(99, L.get(0));
        L.addLast(36);
        assertEquals(99, L.get(0));
        assertEquals(36, L.get(1));
    }


    @Test
    public void testRemove() {
        AList L = new AList();
        L.addLast(99);
        assertEquals(99, L.get(0));
        L.addLast(36);
        assertEquals(99, L.get(0));
        L.removeLast();
        assertEquals(99, L.getLast());
        L.addLast(100);
        assertEquals(100, L.getLast());
        assertEquals(2, L.size());
    }

    /**
     * Tests insertion of a large number of items.
     */
    @Test
    public void testMegaInsert() {
        AList L = new AList();
        int N = 1000000;
        for (int i = 0; i < N; i += 1) {
            L.addLast(i);
        }

        for (int i = 0; i < N; i += 1) {
            L.addLast(L.get(i));
        }
    }

    public static class VengefulSLList<Item> extends SLList<Item>
    {
        SLList<Item> deleteItem;


        public VengefulSLList(){
            deleteItem = new SLList<Item>();
        }

        public VengefulSLList(Item x){
            super(x);
            deleteItem = new SLList<Item>();
        }
        public void printLostItem(){

            deleteItem.print();
        }

        @Override
        public Item removeLast(){
            Item x = super.removeLast();
            deleteItem.addLast(x);
            return x;
        }

        public static void main(String[] args){
            VengefulSLList<Integer> rs1 = new VengefulSLList<>(10);
            rs1.addLast(10);
            rs1.addLast(20);
            rs1.addLast(30);
            rs1.addLast(40);

            rs1.removeLast();
            rs1.removeLast();

            System.out.println("The fallen are : ");
       //     rs1.printLostItem();
            rs1.print();
        }
    }
}

