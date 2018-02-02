package pirma2;

import java.util.Scanner;

public class pirma2 {
    public pirma2 (){
        //Parašyti programą kuri paprašytų sveiko skaičiaus ir pasakytų ar tas skaičius dalinasi iš
        //3 arba 5 arba 7
        System.out.println("Iveskite sveika skaiciu");
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        if (a%7==0){
            System.out.println("Skaicius dalinasi is 7");
        }if (a%5==0){
            System.out.println("Skaicius dalinasi is 5");
        }if (a%3==0){
            System.out.println("Skaicius dalinasi is 3");
        }
    }
}
