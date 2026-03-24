package wyrażenia;

public class Zmienna extends Wyrażenie {
    @Override
    public double policzWartość(double wartośćX) {
        return wartośćX;
    }

    @Override
    public Wyrażenie dajPochodną() {
        return new Stała(1.);
    }

    @Override
    public String toString() {
        return "X";
    }
}
