

public class Sort {
    public int size;


    public static void Swap(String[] x, int a , int b){
        String temp = x[a];
        x[a] = x[b];
        x[b] = temp;

    }


    private static void  sort(String[] x, int a ){
        if (a == x.length ){
            return;
        }
        int smallestIndex = findSmallest(x , a);
        Swap(x, a, smallestIndex);
        sort(x, a+1);
    }

    public static void sort(String[] x){
        //Find the smallest item
        //Move it to the front
        //Selection sort the rest (using recursion??)
        int b;
        b = findSmallest(x, 0);
        Swap(x, b, 0);
        sort(x , 0 );
    }
    public static int findSmallest(String[] x, int a){

        int smallestIndex = a;
         for (int i = a; i <x.length; i +=1){
             int cmp = x[i].compareTo( x[smallestIndex]);


             if (cmp < 0){
                 smallestIndex = i;
             }
         }
         return smallestIndex;
    }




}
