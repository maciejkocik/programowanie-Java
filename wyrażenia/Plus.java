package wyrażenia;

public class Plus extends Operator2Arg {
    public Plus(Wyrażenie lewy, Wyrażenie prawy){
        super(lewy, prawy);
    }
    @Override
    protected char znakOperatora(){
        return '+';
    }
    @Override
    public double policzWartość(double wartośćX) {
        return (lewy.policzWartość(wartośćX) + prawy.policzWartość(wartośćX));
    }

    @Override
    public Wyrażenie dajPochodną() {
        return new Plus(lewy.dajPochodną(), prawy.dajPochodną());
    }
}
