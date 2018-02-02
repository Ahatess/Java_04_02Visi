package astunta;
import java.util.Scanner;
public class astunta {
    //Paprašyti vartotojo nurodyti kiek skaičių jis ketina įvesti, tuomet duoti jam įvesti tiek
    //skaičių, kiek jis pasirinko. Po įvedimo atvaizduoti tik tuos skaičius kurie buvo didesni
    //nei 100.
    // Realizuoti 1.7. užduotį panaudojant metodą kurio parametras būtų vartotojo įvestų
    //skaičių masyvas ir skaičių didesnių nei 100 atvaizdavimas vyktų pačiame metode.
    public astunta(){
        System.out.println("Nurodykite kiek skaiciu ketinate ivesti");
        Scanner sc = new Scanner(System.in);
        int dydis = sc.nextInt();
        int mas[]= new int[dydis];
        System.out.println("Iveskite skaicius");
        for (int i =0;i<mas.length; i++){
        mas[i]=sc.nextInt();
    }
    skaiciavimas(mas);
}
public static void skaiciavimas(int[] array){
        for (int i = 0; i< array.length; i++){
            if(array[i]>100){
                System.out.println(array[i]);
            }
        }
}
}
