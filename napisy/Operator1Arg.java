package napisy;

public abstract class Operator1Arg extends WyrNapisowe {
    protected WyrNapisowe argument;

    public Operator1Arg(WyrNapisowe argument){
        this.argument = argument;
    }

    protected abstract String nazwaOperatora();

    @Override
    public String toString() {
        return nazwaOperatora() +
    }
}
