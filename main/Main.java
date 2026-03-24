package main;

import napisy.*;

public class Main {
    private void test(WyrNapisowe w, Wartościowanie zmienne){
        System.out.println("test dla " + w + " z wartościowaniem " + zmienne);
        System.out.print(" - wynik z wartościowaniem: \"");
        try {
            System.out.println(w.oblicz(zmienne) + "\"");
        }
        catch (BrakZmiennej e){
            System.out.println("Test się nie powiódł ze względu na odwołanie do nieistniejącej zmiennej: " + e);
        } catch (ZłaNazwaZmiennej e){
            System.out.println("Test się nie powiódł ze względu na niepoprawną nazwę zmiennej w wyrażeniu: " + e);
        }

        String pom = w.obliczBezZmiennych();
        System.out.println(" - wynik bez wartościowania: " + (pom == null ? "<brak wyniku> " : "\"" + pom + "\""));
    }

    private void test1(){
        System.out.println("\ntest1");

        Wartościowanie zmienne = new Wartościowanie();
        WyrNapisowe w1 = new Stały("Ala");

        test(w1, zmienne);
    }

    private void test2() throws ZłaNazwaZmiennej {
        System.out.println("\ntest2");

        Wartościowanie zmienne = new Wartościowanie();
        zmienne.ustaw('a', "Ala");
        WyrNapisowe w1 = new Zmienna('a');

        test(w1, zmienne);
    }

    private void test3() throws ZłaNazwaZmiennej{
        System.out.println("\ntest3");
        String napis  = "Es#JrtapCPvyR+thY&+a*o@en";
        String maska  = "012*45*789*12345678*01234";
        String maska2 = "012345678*0*23**67890*23*";

        Wartościowanie zmienne = new Wartościowanie();
        WyrNapisowe w = new Maska(new Stały(napis), new Stały(maska));
        test(w, zmienne);

        // Z inną maską ten sam napis daje zupełnie inny wynik
        w = new Maska(new Stały(napis),
                new Stały(maska2));
        test(w, zmienne);

        // Maska trzymana w zmiennej
        zmienne.ustaw('v', maska);
        w = new Maska(new Stały(napis),
                new Zmienna('v'));
        test(w, zmienne);

        // Dla szczególnych masek (bez '*') da się policzyć nawet z nieznanym pierwszym parametrem.
        zmienne.ustaw('n', napis);
        w = new Maska(new Zmienna('n'),
                new Stały("0123456789"));
        test(w, zmienne);

        // Błędna zmienna (użyto x, a zdefiniowana jest tylko v)
        zmienne.ustaw('v', "");
        w = new Maska(new Stały(napis),
                new Zmienna('x'));
        test(w, zmienne);
    }

    private void test4() throws ZłaNazwaZmiennej {
        // Proste testy poszczególnych operacji
        System.out.println("\ntest4");

        Wartościowanie zmienne = new Wartościowanie();
        zmienne.ustaw('b', "Jv rPto?Ti steqeto!");
        zmienne.ustaw('x', "aao yhn hsi h usin");

        WyrNapisowe w1, w2, w3, w4;

        w1 = new Przepl(new Zmienna('b'), new Zmienna('x'));
        test(w1, zmienne);

        w2 = new Maska(w1, new Stały("****                                    "));
        test(w2, zmienne);

        w3 = new Maska(w1, new Stały("........******               "));
        test(w3, zmienne);

        w4 = new Dod(new Dod(new Małe(w3), new Dł(new Stały(".."))), new Wielkie(w2));
        test(w4, zmienne);
    }

    private void test5() throws ZłaNazwaZmiennej {
        // test wyjątków związanych z niepoprawną nazwą zmiennej
        System.out.println("\ntest5");

        Wartościowanie zmienne = new Wartościowanie();
        try {
            zmienne.ustaw('$', "");
        } catch (ZłaNazwaZmiennej e) {
            System.out.println("Test wykrył niepoprawną nazwę zmiennej w wartościowaniu: " + e);;
        }

        try {
            WyrNapisowe w = new Zmienna('$');
        } catch (ZłaNazwaZmiennej e) {
            System.out.println("Test wykrył niepoprawną nazwę zmiennej przy próbie utworzenia wyrażenia");;
        }
    }

    public static void main(String[] args){
        System.out.println("Start programu");
        // assert false: "Jak zadziała wykomentować";

        Main m = new Main();

        try {
            m.test1();
            m.test2();
            m.test3();
            m.test4();
            m.test5();
        } catch (ZłaNazwaZmiennej e) {
            System.out.println("Nie udało się przeprowadzić wszystkich testów: " + e);;
        }

        System.out.println("Koniec programu");
    }
}