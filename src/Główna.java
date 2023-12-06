import kalendarze.Data;

public class Główna {

    public void testuj(){
        // Test klasy kalendarze.Data
        Data pocz = new Data();
        Data dziś = new Data(21, 11, 2023);
        System.out.println("Start = " + pocz);
        System.out.println("Dziś = " + dziś);
        System.out.println("Już minęło " + pocz.ileDniPrzed(dziś) + " dni od początku naszego PiPO");
        Data choinka = new Data(24, 12, 2023);
        System.out.println("Do prezentów zostało " + dziś.ileDniPrzed(choinka) + " dni");

        Data pom = new Data();
        int n = 1000;
        pom.dodajDni(n);
        System.out.println("Po " + n + " dniach od początku naszego PiPO będzie " + pom);

        // A tu dodatkowo testy z assert
//        assert false: "Tę linijkę - jeśli padnie - należy wykomentować";

        assert pocz.ileDniPrzed(pom) == n : "Błąd w metodzie ileDniPrzed: " + pocz.ileDniPrzed(pom) + " != " + n;
        assert pom.ileDniPrzed(pocz) == -n : "Błąd w metodzie ileDniPrzed: " + pom.ileDniPrzed(pocz) + " != " + -n;
        assert pom.równa(pom) : "Błąd w metodzie równa dla " + pom;
        assert pocz.przed(dziś) : "Błąd w metodzie przed dla " + pocz + " i " + dziś;
        Data pom2 = new Data(pocz);
        Data pom3 = new Data(pom2.dzień()+1, pom2.miesiąc(), pom2.rok()); // Tu zakładamy, że pom2 to nie jest ostatni dzień miesiąca
        pom2.kolejnyDzień();
        assert pom2.równa(pom3) : "Błąd przy porównaniu " + pom2 + " i " + pom3;

        int rok = 2000;
        assert Data.przestępny(rok) : "Błąd w metodzie przestępny dla " + rok;
        rok = 2100;
        assert !Data.przestępny(rok) : "Błąd w metodzie przestępny dla " + rok;
        rok = 2020;
        assert Data.przestępny(rok) : "Błąd w metodzie przestępny dla " + rok;
        rok = 2023;
        assert !Data.przestępny(rok) : "Błąd w metodzie przestępny dla " + rok;

        int miesiąc = 2;
        rok = 2000;
        assert Data.ileDni(rok) == 366 : "Błąd w metodzie ileDni dla " + rok;
        assert Data.ileDni(miesiąc, rok) == 29 : "Błąd w metodzie ileDni dla " + miesiąc + " i " + rok;
        rok = 2100;
        assert Data.ileDni(rok) == 365 : "Błąd w metodzie ileDni dla " + rok;
        assert Data.ileDni(miesiąc, rok) == 28 : "Błąd w metodzie ileDni dla " + miesiąc + " i " + rok;
        miesiąc = 6;
        assert Data.ileDni(miesiąc, rok) == 30 : "Błąd w metodzie ileDni dla " + miesiąc + " i " + rok;
        miesiąc = 7;
        assert Data.ileDni(miesiąc, rok) == 31 : "Błąd w metodzie ileDni dla " + miesiąc + " i " + rok;

    }

    public static void main(String[] args) {
        System.out.println("Start!");

        Główna o = new Główna();
        o.testuj();


        System.out.println("Stop!");
    }
}