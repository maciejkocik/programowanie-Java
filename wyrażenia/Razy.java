package wyrażenia;

public class Razy extends Operator2Arg {
    public Razy(Wyrażenie lewy, Wyrażenie prawy){
        super(lewy, prawy);
    }
    @Override
    protected char znakOperatora(){
        return '*';
    }
    @Override
    public double policzWartość(double wartośćX) {
        return (lewy.policzWartość(wartośćX) * prawy.policzWartość(wartośćX));
    }

    @Override
    public Wyrażenie dajPochodną() {
        return new Plus(
                new Razy(lewy.dajPochodną(), prawy),
                new Razy(prawy.dajPochodną(), lewy));
    }
}
