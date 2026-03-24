package napisy;

public abstract class Operator2Arg extends WyrNapisowe{
    protected WyrNapisowe lewy;
    protected WyrNapisowe prawy;
    public Operator2Arg(WyrNapisowe lewy, WyrNapisowe prawy){
        this.lewy = lewy;
        this.prawy = prawy;
    }
}
