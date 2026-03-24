package kompresja;

public class OpisSegmentu {
    private char znak;
    private int ileRazy;

    public OpisSegmentu(char znak, int ileRazy){
        this.znak = znak;
        this.ileRazy = ileRazy;
    }

    public char znak(){
        return znak;
    }

    public int ileRazy(){
        return ileRazy;
    }

}

