package com.company;
import java.util.Scanner;
public class Main {
    public static final int EXIT_CODE = 0;
    public static final int ACTION_1=1;
    public static final int ACTION_2=2;
    public static final int ACTION_3=3;
    public static final int ACTION_4=4;
    public static final int ACTION_5=5;
    public static final int ACTION_6=6;
    public static final int ACTION_7=7;
    public static final int ACTION_8=8;
    public static final int ACTION_9=9;
    public static final int ACTION_10=10;
    public static final int ACTION_11=11;
    public static final int ACTION_12=12;
    public static void main(String[] args) {
        Main objektas = new Main();
        objektas.vykdykProgramaBeGalo();
    }
    private void rodykPasirinkimus(){
        System.out.println("=====================================");
        System.out.println("Koki veiksma norite atlikti?");
        System.out.println(EXIT_CODE + "Baigti darba");
        System.out.println(ACTION_1 + "Pirma uzduotis, lyginio skaiciaus paieska");
        System.out.println(ACTION_2 + "Pirma2 uzduotis, ar skaicius dalinasi is 7,5,3");
        System.out.println(ACTION_3 + "Antra uzduotis, veskite zodzius iki zodzio pabaiga");
        System.out.println(ACTION_4 + "Trecia uzduotis, skaicius iki 0 ir jų suma");
        System.out.println(ACTION_5 + "Ketvirta uzduotis, veskite tik skaicius");
        System.out.println(ACTION_6 + "Penkta uzduotis, veskite 5 skaicius, atvaizduojama jų suma");
        System.out.println(ACTION_7 + "Sesta uzduotis, veskite 5 zodzius, jie bus atvaizduojami");
        System.out.println(ACTION_8 + "Septinta uzduotis, nurodykite kiek skaiciu vesite, didesni nei 100 atvaizduojami");
        System.out.println(ACTION_9 + "Astunta uzduotis, nurodykite kiek skaiciu vesite, didesni nei 100 atvaizduojami tame paciame metode");
        System.out.println(ACTION_10 + "Devinta uzduotis, iveskite du skaicius ir pasirinkite operacija");
        System.out.println(ACTION_11 + "Desimta uzduotis, iveskite skaiciu ir parodysime suma");
        System.out.println(ACTION_12 + "Vienuolikta uzduotis, iveskite skaiciu ir pasirinkite suma arba sandauga");

    }
    public void vykdykProgramaBeGalo(){
        boolean arTesti = true;
        Scanner sc = new Scanner(System.in);
        while (arTesti == true){
            rodykPasirinkimus();
            int veiksmas = sc.nextInt();
            switch (veiksmas){
                case EXIT_CODE:
                    arTesti = false;
                    break;
                case ACTION_1:
                    new pirma.pirma();
                    break;
                case ACTION_2:
                    new pirma2.pirma2 ();
                    break;
                case ACTION_3:
                    new antra.antra();
                    break;
                case ACTION_4:
                    new trecia.trecia();
                    break;
                case ACTION_5:
                    new ketvirta.ketvirta();
                    break;
                case ACTION_6:
                    new penkta.penkta();
                    break;
                case ACTION_7:
                    new sesta.sesta();
                    break;
                case ACTION_8:
                    new septinta.septinta();
                    break;
                case ACTION_9:
                    new astunta.astunta();
                    break;
                case ACTION_10:
                    new devinta.devinta();
                    break;
                case ACTION_11:
                    new desimta.desimta();
                    break;
                case ACTION_12:
                    new vienuolikta.vienuolikta();
                    break;

            }
        }
    }

}
