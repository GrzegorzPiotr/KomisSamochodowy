package komis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarUtill {
    public static Scanner scanner = new Scanner (System.in);

    protected String omarka;
    protected String okolor;
    protected double ocena;
    protected int oiloscDrzwi;
    protected double oprzebieg;
    protected int orocznik;

    public static Samochod nowyPojazd() {


        System.out.println ("Podaj Markę");
        String omarka = scanner.nextLine ();
        scanner.nextLine ();
        System.out.println ("Podaj Kolor");
        String okolor = scanner.nextLine ();
        System.out.println ("Podaj Cene");
        double ocena = scanner.nextDouble ();
        scanner.nextLine ();
        System.out.println ("Podaj ilość drzwi");
        int oiloscDrzwi = scanner.nextInt ();
        scanner.nextLine ();
        System.out.println ("Podaj Przebieg");
        double oprzebieg = scanner.nextDouble ();
        scanner.nextLine ();
        System.out.println ("Podaj rocznik");
        int orocznik = scanner.nextInt ();
        scanner.nextLine ();
        Samochod autko = new Samochod (omarka, okolor, ocena, oiloscDrzwi, oprzebieg, orocznik);

        return autko;
    }
}




