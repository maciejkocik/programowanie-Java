public class Main {
    private static int silnia(int x){
        if (x >= 1){
            int wynik = 1;
            for (int i = 2; i <= x; ++i) {
                wynik *= i;
            }
            return wynik;
        } else return 1;
    }

    public static void main(String[] args) {

        int a = 6;
        System.out.println(silnia(a));
        /*

        for (int i = 0; i < 10; ++i){
            System.out.println(i);
        }

        int x = 5;

        System.out.println(x++);
        System.out.println(x);
        System.out.println();
        x = 5;
        System.out.println(++x);
        System.out.println(x);

        /*
        double d = 3.14;
        boolean b = true;

        Integer y = 42;
        Double dd = 4.15;
        Boolean bb = false;

        String s = "1138";
        int z = Integer.parseInt(s);

        System.out.println("The length of string s is " + s.length());
        System.out.println("Hello user number " + (z * 10));
        */

    }

}
