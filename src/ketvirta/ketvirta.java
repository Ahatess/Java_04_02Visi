package ketvirta;

import java.util.Scanner;

public class ketvirta {
    public static final int EXIT_CODES = 0;

    public ketvirta() {
        //Papildykite 1.3. programą kuri neleistu įvesti ne skaičius, jei vartotojas įveda ne skaičių
        //programa prašo pakartoti tol kol bus įvestas skaičius.

        float suma = 0;
        float skaicius = 0;

        do {
            Scanner sc = new Scanner(System.in);
            skaicius = tikSkaiciai();
            suma += skaicius;
        } while (skaicius != 0);
        System.out.println("Suma: " + suma);

    }

    public float tikSkaiciai() {
        float rezultatas = 0;
        boolean arSkaicius = false;
        while (arSkaicius == false) {
            try {
                System.out.println("Iveskite skaiciu kol bus 0");
                Scanner sc = new Scanner(System.in);
                rezultatas = sc.nextFloat();
                arSkaicius = true;
            } catch (Exception klaida) {
                System.out.println("Ivestas tekstas nera skaicius");
            }

        }return rezultatas;
    }
}