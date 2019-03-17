package komis;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Metodasort {

    public static void sortowanie(List<Samochod> auta2) {



        int action2 = 0;
        Scanner in = new Scanner (System.in);

        while (action2 != 6) {
            System.out.println ("wybierz rodzaj sortowania");
            System.out.println ("1. według marki");
            System.out.println ("2. według ceny");
            System.out.println ("3. według przebiegu ");
            System.out.println ("4. według rocznika");
            System.out.println ("5. według koloru");
            System.out.println ("6. zakończ sortowanie");

            action2 = in.nextInt ();


        switch (action2) {
            case 1: {
                Stream<Samochod> samochodStream = auta2.stream ();
                System.out.println ("Posortuj samochody wg nazwy");
                auta2.stream ()
                        .sorted (Comparator.comparing (Samochod::getMarka))
                        .forEach (System.out::println);
                break;
            }
            case 2: {
                System.out.println ("Posortuj samochody wg ceny");
                auta2.stream ()
                        .sorted (Comparator.comparingDouble (Samochod::getCena))
                        .forEach (System.out::println);
                break;
            }
            case 3: {
                System.out.println ("Posortuj samochody wg przebiegu");
                auta2.stream ()
                        .sorted (Comparator.comparingDouble (Samochod::getPrzebieg))
                        .forEach (System.out::println);
                break;
            }
            case 4: {
                System.out.println ("Posortuj samochody wg rocznika");
                auta2.stream ()
                        .sorted (Comparator.comparingInt (Samochod::getRocznik))
                        .forEach (System.out::println);
                break;
            }

            case 5:{
                System.out.println ("Posortuj samochody wg koloru");
                auta2.stream ()
                        .sorted (Comparator.comparing (Samochod::getKolor))
                        .forEach (System.out::println);
                break;
            }
            case 6:
            default:

        }
        }
    }
}

