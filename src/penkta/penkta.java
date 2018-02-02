package penkta;
import java.util.Scanner;
public class penkta {
    //Parašyti programą, kuri paprašytų įvesti 5 skaičius. Baigus skaičių įvedimą, turi būti
    //atvaizduojama įvestų skaičių suma ir visi įvesti skaičiai.
    public penkta() {
        int[] mas = new int[5];
        int suma = 0;
        System.out.println("Iveskite 5 skaicius");
        for (int i = 0; i < mas.length; i++) {
            Scanner sc = new Scanner(System.in);
            mas[i] = sc.nextInt();
            suma += mas[i];
        }
    }
}