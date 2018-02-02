package devinta;
import java.util.Scanner;
public class devinta {
    //Sukurti supaprastintą skaičiuoklės programą kuri paprašytų įvesti du skaičius ir
    //operacijos tarp jų skaičių (1 – suma, 2 – skirtumas, 3 – sandauga). Gautą rezultatą
    //programa pavaizduotų ekrane ir paklaustų ar norėsime kartoti. Įvedus skaičių 5,
    //programa turėtų kartoti darbą iš naujo, priešingu atveju programa baigtų darbą.
    public static final int ACTION_SUM = 1;
    public static final int ACTION_SUBTRACTION = 2;
    public static final int ACTION_MULTIPLICATION = 3;
    public static final int ACTION_REPEAT = 5;
    public devinta(){
    skaiciuok();
    }
    public void skaiciuok(){
        boolean arTesti = true;
        while(arTesti==true){
        Scanner sc=new Scanner(System.in);
        System.out.println("Iveskite du skaicius");
        float a=sc.nextFloat();
        float b=sc.nextFloat();

        System.out.println("Iveskite norima veiksma");
        System.out.println("Suma - 1");
        System.out.println("Skirtumas - 2");
        System.out.println("Sandauga - 3");
        int veiksmas=sc.nextInt();

        switch (veiksmas){
            case ACTION_SUM:
                System.out.println(a+b);
                break;
            case ACTION_SUBTRACTION:
                System.out.println(a-b);
                break;
            case ACTION_MULTIPLICATION:
                System.out.println(a*b);
                break;
        }
        System.out.println("Iveskite ar norite kartoti");
        System.out.println("Paspauskite 5 kartojimui");
        int c=sc.nextInt();
        if(c!=ACTION_REPEAT){
            arTesti=false;
        }

        }


    }
}
