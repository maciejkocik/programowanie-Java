package szyfrowanie;

public interface Szyfr {
    String szyfruj(String tekst);
    String odszyfruj(String tekst);
    String złam(String tekst, String[] wskazówki);
}