package napisy;

public class Wielkie extends Operator1Arg {
    public Wielkie(WyrNapisowe argument){
        super(argument);
    }
    @Override
    protected String nazwaOperatora() {
        return "^";
    }
}
