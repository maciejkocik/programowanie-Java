package główny;

import wyrażenia.*;

public class MainWyrażeniowy {
    private static void pokaż(Wyrażenie w, int wartośćX){
        System.out.println("Wyrażenie " + w);
        System.out.println("\twartość dla x = " + (wartośćX + " to " + w.policzWartość(wartośćX)));
        System.out.println("\tcałka od 0 do 1 to " + w.policzCałkę(0., 1., 10));
        System.out.println("\tpochodna to " + w.dajPochodną());
    }
    public static void main(String[] args) {
        Wyrażenie w42 = new Stała(42.);
        Wyrażenie wx = new Zmienna();
        pokaż(w42, 1);
        pokaż(wx, 1);
        pokaż(new Plus(wx, w42), 1);
        pokaż(new Sinus(new Stała(Math.PI)), 2);

        Wyrażenie wielomian =
                new Plus(
                        new Razy(
                                new Zmienna(),
                                new Zmienna()),
                        new Stała(1));
        pokaż(wielomian, 1);

        // w1 = x + x * 2
        Wyrażenie w1 = new Plus(new Zmienna(),
                new Razy(new Zmienna(), new Stała(2)));

        // w2 = (x+x) * 2
        Wyrażenie w2 = new Razy(
                new Plus(new Zmienna(), new Zmienna()),
                        new Stała(2));

        pokaż(w1, 1);
        pokaż(w2, 1);
    }
}
