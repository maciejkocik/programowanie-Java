package wyrażenia;

public abstract class Operator2Arg extends Wyrażenie{

    protected Wyrażenie lewy;
    protected Wyrażenie prawy;

    public Operator2Arg(Wyrażenie lewy, Wyrażenie prawy)
    {
        this.lewy = lewy;
        this.prawy = prawy;
    }

    protected abstract char znakOperatora();
    @Override
    public String toString() {
        return "(" + lewy + znakOperatora() + prawy + ")";
    }
}
