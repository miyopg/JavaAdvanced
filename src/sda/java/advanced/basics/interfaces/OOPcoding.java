package sda.java.advanced.basics.interfaces;

/**
 * Jeden interfejs może dziedziczyć po drugim
 * Wtedy obiekt "implementujący" ten interfejs końcowy
 * musi obsłużyć wszystkie deklaracje metod z interfejsów z drzewa dziedziczenia
 */
public interface OOPcoding extends Coding{
    void codeOOP(String language);
}
