package komis;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.Scanner;

public class Samochod {

    private static Scanner scanner = new Scanner(System.in);

    private String marka;
    private String kolor;
    private Double cena;
    private int iloscDrzwi;
    private double przebieg;
    private int rocznik;


    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int getIloscDrzwi() {
        return iloscDrzwi;
    }

    public void setIloscDrzwi(int iloscDrzwi) {
        this.iloscDrzwi = iloscDrzwi;
    }

    public double getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(double przebieg) {
        this.przebieg = przebieg;
    }

    public int getRocznik() {
        return rocznik;
    }

    public void setRocznik(int rocznik) {
        this.rocznik = rocznik;
    }

    public Samochod(String marka, String kolor, double cena, int iloscDrzwi, double przebieg, int rocznik) {
        this.marka = marka;
        this.kolor = kolor;
        this.cena = cena;
        this.iloscDrzwi = iloscDrzwi;
        this.przebieg = przebieg;
        this.rocznik = rocznik;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        Samochod samochod = (Samochod) o;
        return Double.compare (samochod.cena, cena) == 0 &&
                iloscDrzwi == samochod.iloscDrzwi &&
                Double.compare (samochod.przebieg, przebieg) == 0 &&
                rocznik == samochod.rocznik &&
                Objects.equals (marka, samochod.marka) &&
                Objects.equals (kolor, samochod.kolor);
    }

    @Override
    public int hashCode() {
        return Objects.hash (marka, kolor, cena, iloscDrzwi, przebieg, rocznik);
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "marka='" + marka + '\'' +
                ", kolor='" + kolor + '\'' +
                ", cena=" + cena +
                ", iloscDrzwi=" + iloscDrzwi +
                ", przebieg=" + przebieg +
                ", rocznik=" + rocznik +
                '}';
    }
}