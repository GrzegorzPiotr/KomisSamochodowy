package komis;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filtrowanie {

    public static void filtrowanie(List<Samochod> auta3) {
        int action2 = 0;
        Scanner in = new Scanner (System.in);

        while (action2 != 5) {
            System.out.println ("wybierz rodzaj filtrowania");
            System.out.println ("1. według ceny większej niż ...");
            System.out.println ("2. według ceny mniejszej niż ...");
            System.out.println ("3. według przebiegu większego niż ... ");
            System.out.println ("4. według przebiegu większego niż ... ");
            System.out.println ("5. zakończ sortowanie");

            action2 = in.nextInt ();


            switch (action2) {
                case 1: {


                    Stream<Samochod> samochodStream = auta3.stream ();
                    System.out.println ("według ceny większa niż.." + "wprowadź wartość");
                    double b = in.nextDouble ();
                    auta3.stream ()
                            .filter (a -> a.getCena () > b)
                    .forEach (System.out::println);

                }
                case 2: {
                    Stream<Samochod> samochodStream = auta3.stream ();
                    System.out.println ("według ceny mniejsza od.." + "wprowadź wartość");
                    double c = in.nextDouble ();
                    auta3.stream ()
                            .filter (a -> a.getCena () < c)
                            .forEach (System.out::println);

                    break;
                }
                case 3: {
                    System.out.println (" według przebiegu większego od ..." + "wprowadź wartość");
                    double d = in.nextDouble ();
                    auta3.stream ()
                            .filter (a -> a.getPrzebieg () > d)
                            .forEach (System.out::println);
                    break;
                }
                case 4: {
                    System.out.println (" według przebiegu mniejszego od ..." + "wprowadź wartość");
                    double e = in.nextDouble ();
                    auta3.stream ()
                            .filter (a -> a.getPrzebieg () > e)
                            .forEach (System.out::println);
                    break;
                }
                case 5:
                default:

            }
        }


    }


}
