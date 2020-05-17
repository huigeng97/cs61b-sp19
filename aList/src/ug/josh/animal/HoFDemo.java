package ug.josh.animal;

public class HoFDemo {
    public static int do_twice(IntUnitFunction g, int x){
        return g.apply(g.apply(x));
    }
    public static  void main(String[] args){
        IntUnitFunction tenX = new TenX();
        System.out.println(do_twice(tenX,2));
    }
}


