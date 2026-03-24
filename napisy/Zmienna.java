package napisy;

public class Zmienna extends WyrNapisowe {
    public char znak;

    public Zmienna(char znak){
        this.znak = znak;
    }
    @Override
    public String obliczBezZmiennych() {
        return null;
    }

    @Override
    public String oblicz(Wartościowanie zmienne) {
        return null;
    }

    @Override
    public String toString() {
        return "X";
    }
}
