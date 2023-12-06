package kalendarze;

public class Data {
    int dzień;
    int miesiąc;
    int rok;

    private static int[] liczbaDniMiesięcy = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // 0 zostało dodane, żeby pozycje w tablicy odpowiadały numerom miesięcy, tj. 1-12, a nie 0-11

    public int dzień() { return dzień; }
    public int miesiąc() { return miesiąc; }
    public int rok() { return rok;}

    public Data() {
        this.dzień = 5;
        this.miesiąc = 10;
        this.rok = 2023;
    }
    public Data(Data x){
        this.dzień = x.dzień;
        this.miesiąc = x.miesiąc;
        this.rok = x.rok;
    }
    public Data(int dzień, int miesiąc, int rok) {
        this.dzień = dzień;
        this.miesiąc = miesiąc;
        this.rok = rok;
    }

    public static boolean przestępny(int rok){
        return (rok % 4 == 0) && (rok % 100 != 0 || rok % 400 == 0);
    }

    public boolean równa(Data x){
        return ((this.rok == x.rok) && (this.miesiąc == x.miesiąc) && (this.dzień == x.dzień));
    }

    public boolean przed(Data x){
        boolean czyPrzed = false;
        if (!równa(x)) {
            if (this.rok == x.rok) {
                if (this.miesiąc == x.miesiąc) {
                    if (this.dzień < x.dzień)
                        return true;
                } else if (this.miesiąc < x.miesiąc)
                    return true;
            } else if (this.rok < x.rok)
                return true;
        }
        return false;
    }

    public static int ileDni(int miesiąc, int rok) {
        if ((przestępny(rok)) && (miesiąc == 2))
            return 29;
        else
            return liczbaDniMiesięcy[miesiąc];

    }

    public static int ileDni(int rok){
        return przestępny(rok) ? 366 : 365;
    }
    public void kolejnyDzień(){
        this.dzień = this.dzień + 1;
        int liczbaDniMiesiąca = liczbaDniMiesięcy[this.miesiąc];

        if ((this.miesiąc == 2) && (przestępny(this.rok)))
            liczbaDniMiesiąca = 29;

        if (this.dzień > liczbaDniMiesiąca) {
            this.dzień = 1;
            this.miesiąc += 1;
            if (this.miesiąc > 12){
                this.miesiąc = 1;
                this.rok += 1;
            }
        }

    }

    public void dodajDni(int ile){
        for (int i=0; i<ile; i++)
            this.kolejnyDzień();
    }

    public int ileDniPrzed(Data x) {
        // liczymy liczbę dni dla pierwszej daty
        int d1 = this.rok * 365 + this.dzień;
        for (int i = 1; i < this.miesiąc; i++)
            d1 += liczbaDniMiesięcy[i];

        // dodajemy dzień dla każdego roku przestępnego
        for (int i = 0; i < this.rok; i++)
            if (przestępny(i))
                d1++;

        // analogicznie dla drugiej daty
        int d2 = x.rok * 365 + x.dzień;
        for (int i = 1; i < x.miesiąc; i++)
            d2 += liczbaDniMiesięcy[i];

        for (int i = 0; i < x.rok; i++)
            if (przestępny(i))
                d2++;

        return (d2-d1);
    }

    public String toString() {
        return dzień + "/" + miesiąc + "/" + rok;
    }

}