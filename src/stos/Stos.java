package stos;

public class Stos {
    private char[] tab;
    private int czubek;

    public Stos(int rozmiar){
        this.tab = new char[rozmiar];
        this.czubek = 0;
    }
    public void wrzuc(char c){
        tab[czubek] = c;
        czubek++;
    }

    public char zdejmij(){
        throw ZdejmowanieZPustegoStosu{
            if (czyPusty)
                throw new ZdejmowanieZPustegoStosu();
            char wynik = tab[czubek - 1];
            czubek--;
            return wynik;
        }

    }

    public boolean czyPusty(){
        return czubek == 0;
    }
}
