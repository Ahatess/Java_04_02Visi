package desimta;
import java.util.Scanner;
public class desimta {
    //Parašyti programą kuri paprašo vartotojo įvesti skaičių n ir suskaičiuoja sumą
    //visų skaičių nuo vieno iki n. Jeigu įvestas skaičius mažesnis nei vienas, programa turi
    //informuoti apie blogą įvestį. Padaryti su rekursija(bonus points)
    public static final int ACTION_SUMA =1;
    public desimta(){
        skaiciavimas();
    }
    public float skaiciavimas(){
        float skaicius=0;
        float suma=0;
        boolean arMazesnisUzV = false;
        while(arMazesnisUzV == false){
            Scanner sc = new Scanner(System.in);
            System.out.println("Iveskite skaiciu");
            skaicius =sc.nextFloat();
            if (skaicius>=1){
                arMazesnisUzV=true;
                for(int i=0;i<skaicius;i++){
                    System.out.println("Jusu suma: " + (suma+=i));}}
                else{
                arMazesnisUzV=false;
                System.out.println("Ivestas skaicius yra mazesnis nei 1");

                }        }return skaiciavimas();

    }
    }
