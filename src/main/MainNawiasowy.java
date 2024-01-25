package main;

public class MainNawiasowy {
    //private static class NiewlasciwyZnak extends Exception{}
    private static boolean czyPoprawne(String s) {
        int licznik = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) != '(' && s.charAt(i) != ')')
                //throw new NiewlasciwyZnak();
            if (s.charAt(i) == '(')
                licznik++;
            else if (s.charAt(i) == ')') {
                licznik--;
                if (licznik < 0)
                    return false;
            }
        }

        return licznik == 0;
    }

    public static void main(String[] args) {
        String s = "((())())";
        System.out.println(s + " poprawne? " + czyPoprawne(s));
    }
}
