package główny;

import kompresja.NS;

public class MainKompresyjny {
    public static void main(String[] args){
        NS ns = new NS("aaaaabbbbbbcccccccaa");
        System.out.println("Długość to " + ns.długość());
        System.out.println("Treść to " + ns);
        System.out.println("Dany znak to "+ ns.dajZnak(8));
        System.out.println("Litera a wystepuje " + ns.ile('a') + " razy.");
        System.out.println("Litera s wystepuje " + ns.ile('s') + " razy.");
    }
}
