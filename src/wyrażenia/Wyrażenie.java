package wyrażenia;

public abstract class Wyrażenie {
    public static final double EPSILON = .000001;
    public abstract double policzWartość(double wartośćX);

    public abstract Wyrażenie dajPochodną();

    public double policzCałkę(double a, double b, int ilePrzedziałów){
        double wynik = 0;
        double d = (b - a) / ilePrzedziałów;
        double x = a;
        while (x + EPSILON < b){
            wynik += d * (policzWartość(x) + policzWartość(x+d)) / 2;
            x += d;
        }

        return wynik;
    }
}
