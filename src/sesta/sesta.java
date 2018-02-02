package sesta;
import java.util.Scanner;
public class sesta {
    //Parašyti programą kuri paprašytų vartotojo įvesti 5 žodžius. Po to kai bus įvesti visi
    //žodžiai, jie turi būti atvaizduojami.
    public sesta(){
        String[]mas=new String[5];
        System.out.println("Iveskite 5 zodzius");
        for(int i=0;i<mas.length; i++){
        Scanner sc =new Scanner(System.in);
        mas[i]=sc.nextLine();
    }for(int i=0;i<mas.length; i++){
           System.out.println("Jusu zodziai: "+ mas[i]);

        }
}}
