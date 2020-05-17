public class SLList<Item> implements List61B<Item> {
    public class Node {
        public Item item;
        public Node next;
        public Node sentinel;
        public Node(Item i, Node n) {
            item = i;
            next = n;
        }
    }

    //private Node first;
    private int size;
    /*If the first item exist, it would be the sentinel node.*/
    private  Node sentinel;

    public  Item get(int position){
        //

       if (position == 0){
           return getFirst();
       }
        Node currentNode = sentinel.next.next;
       while (position >1 && currentNode.next != null){
           position -= 1;
           currentNode = currentNode.next;
        }

        return currentNode.item;
    }

    private Node getLastNode(){
        Node p = sentinel;

        while(p.next != null){
            p = p.next;
        }
        return p;
    }

    public Item removeLast(){
        Node back = getLastNode();
        if (back == sentinel){
            return null;
        }

        size = size -1;
        Node p = sentinel;

        while(p.next != back){
            p = p.next;
        }
        p.next = null;
        return back.item;
    }


    public SLList() {
        sentinel = new Node( null , null);
        size = 0;
    }

    public SLList(Item x) {
        sentinel = new Node( null , null);
        sentinel.item = x;
        size = 1;
    }

    /** Adds an item to the front of the list. */

    public void addFirst(Item x) {
        sentinel.next = new Node(x, sentinel.next);
        size += 1;
    }

    /** Retrieves the front item from the list. */

    public Item getFirst() {
        return sentinel.next.item;
    }
    @Override
    public Item getLast() {
         Node back = getLastNode();
         return back.item;
    }
    /** Returns the number of items in the list. */

    @Override
    public int size() {
        return size;
    }

    /** Adds an item to the end of the list. */
    public void addLast(Item x) {
        size += 1;
        Node p = sentinel;
        while (p.next != null) {
            p = p.next;
        }

        p.next = new Node(x, null);
    }

    @Override
    public void print() {
        for (Node p = sentinel; p != null; p = p.next ){
            System.out.println(p.item + " ");
        }
    }
    /** Crashes when you call addLast on an empty SLList. Fix it. */
    public static void main(String[] args) {
        SLList x = new SLList();
        x.addLast(5);
        System.out.println(x.get(0));
    }
}