public interface List61B<Item> {
//    public void addFirst(Item x);
 //   public void addLast(Item y);
//    public Item getFirst();
    public Item getLast();
//    public Item removeLast();
//    public Item get(int i);
 //   public void insert(Item x, int position);
    public int size();
    public  Item get(int i);

    // this is a overload method.
    public static void peek(List61B<String> list) {
        System.out.println(list.getLast());
    }

    //This is an implement inheritance
    default public void print(){
        for (int i= 0; i < size(); i ++){
            System.out.println(get(i) + " ");
        }
    }
}