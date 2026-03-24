package wyrażenia;

public abstract class Operator1Arg extends Wyrażenie{
    protected Wyrażenie argument;

    public Operator1Arg(Wyrażenie argument){
        this.argument = argument;
    }
    protected abstract String nazwaOperatora();
    @Override
    public String toString() {
        return nazwaOperatora() + "(" + argument + ")";
    }
}
