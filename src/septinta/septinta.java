package septinta;
import java.util.Scanner;
public class septinta {
    //Paprašyti vartotojo nurodyti kiek skaičių jis ketina įvesti, tuomet duoti jam įvesti tiek
    //skaičių, kiek jis pasirinko. Po įvedimo atvaizduoti tik tuos skaičius kurie buvo didesni
    //nei 100.
    public septinta (){
        System.out.println("Iveskite kiek skaiciu ketinate irasyti");
        Scanner sc=new Scanner(System.in);
        int dydis=sc.nextInt();
        float []mas = new float[dydis];
        System.out.println("Iveskite skaicius");
        for (int i=0; i <mas.length; i++){
            mas [i]= sc.nextFloat();
        }for (int i=0; i<mas.length; i++){
        if (mas[i]> 100){
        System.out.println(mas[i] +"Skaiciai didesni uz 100");
    }
}}}
