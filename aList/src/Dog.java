
import java.util.Comparator;
import java.util.Collection;

public class Dog implements Comparable<Dog> {

    public int size;
    public String name;

    public Dog(){
        this.size = 0;
        this.name = null;
    }

    public int compareTo(Dog o){
        return this.size - o.size;
        }



//    public static Dog max(Collection <? extends Dog> coll, Comparator<? super Dog> comp){
//        return a.name.compareTo(b.name)
//    }



    private static class NameComparator implements Comparator<Dog> {
        public int compare(Dog a, Dog b) {
            return a.name.compareTo(b.name);
        }
    }

    public static Comparator<Dog> getNameComparator() {
        return new NameComparator();
    }



    public Dog( String b,int a ){
        this.size = a;
        this.name = b;
    }

    public void bark(){
        System.out.println(this.name + "is barking");
    }

    }