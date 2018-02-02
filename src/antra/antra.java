package antra;

import java.util.Scanner;

public class antra {
    public antra() {
        //Parašyti programą kuri paprašytų vartotojo įvesti žodį ir jį iš karto atvaizduotų, tada vėl
        //paprašytų įvesti kitą žodį, jį atvaizduotų, ir procesą kartotų tol, kol nebus įvestas žodis
        //„pabaiga“.
        System.out.println("Iveskite zodi");
        Scanner sc = new Scanner(System.in);
        String zodis = sc.nextLine();
        while (!zodis.equals("pabaiga")) {
            zodis = sc.nextLine();
            System.out.println(zodis);


        }
    }}