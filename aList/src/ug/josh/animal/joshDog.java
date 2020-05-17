package ug.josh.animal;


import java.util.Comparator;
import java.util.Collection;



    public class joshDog implements Comparable<joshDog> {

        public int size;
        public String name;

        public joshDog(){
            this.size = 0;
            this.name = null;
        }

        public int compareTo(joshDog o){
            return this.size - o.size;
        }



//    public static Dog max(Collection <? extends Dog> coll, Comparator<? super Dog> comp){
//        return a.name.compareTo(b.name)
//    }



        private static class NameComparator implements Comparator<joshDog> {
            public int compare(joshDog a, joshDog b) {
                return a.name.compareTo(b.name);
            }
        }

        public static Comparator<joshDog> getNameComparator() {
            return new NameComparator();
        }



        public joshDog( String b,int a ){
            this.size = a;
            this.name = b;
        }

        public void bark(){
            System.out.println(this.name + "is barking");
        }

    }
