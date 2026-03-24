package wyrażenia;

public class Stała extends Wyrażenie {
    public double wartość;
    public Stała(double x){
       this.wartość = x;
    }
    public double policzWartość(double wartośćX) {
        return wartość;
    }

    @Override
    public Wyrażenie dajPochodną() {
        return new Stała(0.);
    }

    @Override
    public String toString() {
        if (Math.abs(wartość - Math.PI) < .000001)
            return "PI";
        return "" + wartość;
    }
}
