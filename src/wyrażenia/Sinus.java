package wyrażenia;

public class Sinus extends Operator1Arg {
    public Sinus(Wyrażenie argument) {
        super(argument);
    }

    @Override
    protected String nazwaOperatora() {
        return "sin";
    }

    @Override
    public double policzWartość(double wartośćX) {
        return Math.sin(argument.policzWartość(wartośćX));
    }

    @Override
    public Wyrażenie dajPochodną() {
        return new Cosinus(argument);
    }
}
