public class LinkedListDeque<Item>{
    public class node {
        node Front;
        node Back;
        Item item;
        public node (Item i, node f, node b) {
            Front = f;
            Back = b;
            item = i;
        }
        public node () {
            Front = null;
            Back = null;
            item = null;
        }
    }
    int size;
    private node sentinalFront;
    private node sentinalBack;


    public int size() {
        return size;
    }
    public LinkedListDeque() {
        sentinalFront = new node(null,null,null);
        sentinalBack = new node(null,null,null);
        sentinalFront.Back = sentinalBack;
        sentinalBack.Front = sentinalFront;
        size = 0;
    }
    public LinkedListDeque(Item a) {
        sentinalFront = new node(null,null,null);
        sentinalBack = new node(null,null,null);
        node b = new node(a, sentinalFront,sentinalBack);
        sentinalFront.Back = b;
        sentinalBack.Front = b;
        size = 1;
    }

    public Item addLast(Item a) {
        node b = new node(a, sentinalBack.Front, sentinalBack);
        b.Front.Back = b;
        sentinalBack.Front = b;
        size += 1;
        return a;
    }

    public Item addFirst(Item a) {
        node b = new node(a, sentinalFront, sentinalFront.Back);
        b.Front.Back = b;
        sentinalFront.Back = b;
        size += 1;
        return a;
    }

    public Item removeLast() {
        node b = sentinalBack.Front;
        b.Back.Front = sentinalBack;
        sentinalBack.Front = b.Front;
        size -= 1;
        return b.item;
    }

    public Item removeFirst() {
        node b = sentinalFront.Back;
        b.Back.Front = sentinalFront;
        sentinalFront.Back = b.Back;
        size -= 1;
        return b.item;
    }

    public boolean isEmpty() {
        return (size != 0) ? false: true;
    }

    public void printDeque() {
        node n = sentinalFront;
        for (int i = 0; i < size; i++) {
            System.out.println(n.Back.item);
            n = n.Back;
        }
    }

    public Item get(int index) {
        node indexnode = sentinalFront;
        if (index >= size || index <0) {
            return null;
        }
        for(int i = 0; i<index; i++) {
            indexnode = indexnode.Back;
        }
        return indexnode.item;
    }

    public Item getRecursive(int index) {
        node indexnode = sentinalFront;
        if(index == 0) {
            return indexnode.Back.item;
        }
        return traverse(indexnode.Back,index);
    }

    public Item traverse(node n, int index) {
        if(index == 0) {
            return n.item;
        }
        else {
            return traverse(n.Back, index -1);
        }

    }



}

