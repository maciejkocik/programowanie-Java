package kompresja;

public class NS {

    private OpisSegmentu[] tab;

    public NS(String s){
        int ileSegmentow = 1;
        for (int i = 0; i < s.length()-1; i++){
            if (s.charAt(i) !=  s.charAt(i+1))
                ileSegmentow++;
        }
        this.tab = new OpisSegmentu[ileSegmentow];
        int indeksSegmentu = 0;
        int poczatekSegmentu = 0;
        for (int i = 0; i < s.length()-1; i++){
            if (s.charAt(i) !=  s.charAt(i+1)){
                int dlugoscSegmentu = i + 1 - poczatekSegmentu;
                this.tab[indeksSegmentu] = new OpisSegmentu(s.charAt(i), dlugoscSegmentu);
                poczatekSegmentu = i + 1;
                indeksSegmentu++;
            }

        }
        this.tab[indeksSegmentu] = new OpisSegmentu(s.charAt(s.length() - 1), s.length() - poczatekSegmentu);

    }

    public int długość(){
        int wynik = 0;
        for (int i = 0; i < tab.length; i++)
            wynik += tab[i].ileRazy();
        return wynik;
    }

    public char dajZnak(int indeksZnaku){
        int ile = indeksZnaku;
        for (int i  = 0; i < tab.length; i++)
            if (ile < tab[i].ileRazy()){
                ile -= tab[i].ileRazy();
            } else {
                return tab[i].znak();
            }
        return tab[tab.length - 1].znak();
    }

    public int ile(char c){
        int wynik = 0;
        for (int i = 0; i < tab.length; i++)
            if (tab[i].znak() == c)
                wynik += tab[i].ileRazy();
        return wynik;
    }

    @Override
    public String toString() {
        String wynik = "";
        for (int i = 0; i < tab.length; i++){
            for (int j = 0; j < tab[i].ileRazy(); j++) {
                wynik += tab[i].znak();
            }
        }
        return wynik;
    }
}
