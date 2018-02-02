package vienuolikta;

import java.util.Scanner;

public class vienuolikta {
    //Parašyti programą kuri paprašo vartotojo įvesti skaičių n, tuomet leidžia
    //pasirinkti ką suskaičiuoti, skaičių nuo 1 iki n sumą arba sandaugą (1 - suma, 2 -
    //sandauga). Jeigu įvestas skaičius mažesnis nei vienas, programa turi informuoti apie
    //blogą įvestį.
    public static final int ACTION_SUMA = 1;
    public static final int ACTION_SANDAUGA = 2;

    public vienuolikta(){
        float skaicius = 0;
        int veiksmas = 0;
        float suma = 0;
        float sandauga = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite skaiciu");
        skaicius = sc.nextFloat();
        System.out.println("Pasirinkite veiksma");
        System.out.println("1 - suma");
        System.out.println("2 - sandauga");
        veiksmas = sc.nextInt();
        if (skaicius >= 1) {
            switch (veiksmas) {
                case ACTION_SUMA:
                    for (int i = 1; i < skaicius; i++) {
                        suma = (skaicius + i);
                        System.out.println("Jusu suma: " + (suma));
                    }
                    break;
                case ACTION_SANDAUGA:
                    for (int i = 1; i < skaicius; i++) {
                        sandauga = (skaicius * i);
                        System.out.println("Jusu sandauga: " + (sandauga));

                    }
                    break;
            }

        } else {
            System.out.println("Ivestas skaicius yra mazesnis nei 1");

        }
    }
}

