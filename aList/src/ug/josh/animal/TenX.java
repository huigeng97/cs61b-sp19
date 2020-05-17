package ug.josh.animal;
public class TenX implements IntUnitFunction{
    @Override
    public int apply(int x) {
        return 10*x;
    }

        public static void main(String[] args) {
            int big = 1234567890;
            double approx = big;
            System.out.println(big - (int)approx);
        }

}
