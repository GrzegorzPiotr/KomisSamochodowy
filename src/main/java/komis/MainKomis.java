package komis;

import java.util.*;
import java.util.stream.Stream;

import static komis.CarUtill.nowyPojazd;

public class MainKomis {

    private static Scanner scanner = new Scanner (System.in);


    public static void main(String[] args) {

        List<Samochod> auta = new ArrayList<Samochod> ();


        int action = 0;
        Scanner in = new Scanner (System.in);
        while (action != 6) {
            System.out.println ("wybierz z menu");
            System.out.println ("1. dodaj nowy samochód");
            System.out.println ("2. lista samochodów");
            System.out.println ("3. sortowanie samochodów");
            System.out.println ("4. filtrowanie samochodów po jednej cesze");
            System.out.println ("5. usuwanie wprowadzonych samochodów");
            System.out.println ("6. koniec programu");
            action = in.nextInt ();


            switch (action) {
                case 1: {
                    auta.add (nowyPojazd ());
                    break;
                }
                case 2: {
                    for (int i = 0; i < auta.size (); i++) {
                        System.out.println (auta.get (i));

                    }
                }
                case 3: {
                    Stream<Samochod> samochodStream = auta.stream ();
                    System.out.println ("Posortuj samochody wg nazwy");
                    auta.stream ()
                            .sorted ((o1, o2) -> o1.getMarka ().compareTo (o2.getMarka ()))
                            .forEach (System.out::println);

                    System.out.println ("Posortuj samochody wg ceny");
                    auta.stream ()
                            .sorted (Comparator.comparingDouble (Samochod::getCena))
                            .forEach (System.out::println);


                }
                case 4: {
                }
                case 5: {
                }
                case 6:
                default:
            }
        }


    }
}

