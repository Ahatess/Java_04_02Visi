package trecia;

import java.util.Scanner;

public class trecia {
    public trecia() {
        //Parašyti programą, kuri paprašytų vesti skaičius tol, kol bus įvestas skaičius 0. Pabaigoje
        //turi būti atvaizduojama įvestų skaičių suma.
        float suma = 0;
        float skaicius = 0;
        do {
            System.out.println("iveskite skaiciu");
            Scanner sc = new Scanner(System.in);
            skaicius=sc.nextInt();
            suma += skaicius;
        } while (skaicius != 0);
        System.out.println("Suma: " + suma + skaicius);
    }
}
