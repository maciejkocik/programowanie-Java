package wyrażenia;

public class Cosinus extends Operator1Arg {
    public Cosinus(Wyrażenie argument) {
        super(argument);
    }

    @Override
    protected String nazwaOperatora() {
        return "cos";
    }

    @Override
    public double policzWartość(double wartośćX) {
        return Math.cos(argument.policzWartość(wartośćX));
    }

    @Override
    public Wyrażenie dajPochodną() {
        return null;
    }
}
