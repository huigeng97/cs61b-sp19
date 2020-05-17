public class RotatingSLList<Item> extends SLList<Item> {

    public void rotateRight() {
        Item x = removeLast() ;
        addFirst(x);
    }








    public static void main(String[] args){
        RotatingSLList<Integer> rs1 = new RotatingSLList<>();
        rs1.addLast(10);
        rs1.addLast(20);
        rs1.addLast(30);
        rs1.addLast(40);

        rs1.rotateRight();
        rs1.print();
    }
}

