package main;
import stos.Stos;
public class MainDwunawiasowy {
    private static boolean czyNawias(char c){
        return c == '(' || c == ')' || c == '[' || c == ']';
    }
    private static boolean czyPasuja(char otw, char zam){
        return (otw == '(' && zam == ')')
                || (otw == '[' || zam == ']');
    }

    private static boolean czyDwupoprawne(String s) {
            Stos stos = new Stos(s.length());
            for (int i = 0; i < s.length(); i++) {
                if (!czyNawias(s.charAt(i)))
                //  throw new NiewlasciwyZnak();
                if (s.charAt(i) == '(' || s.charAt(i) == '[')
                    stos.wrzuc(s.charAt(i));
                else if (s.charAt(i) == ')' || s.charAt(i) == ']') {
                    char otw = stos.zdejmij();
                    if (!czyPasuja(otw, s.charAt(i)))
                        return false;
                }
            }

            return stos.czyPusty();

    }

    public static void main(String[] args) {
            String s = "([])";
            System.out.println(s + " poprawne? " + czyDwupoprawne(s));
    }
}

