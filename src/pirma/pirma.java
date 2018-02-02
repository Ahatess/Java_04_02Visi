package pirma;
import java.util.Scanner;
public class pirma {
    public pirma(){
        //Parašyti programą, kuri leistų vartotojui įvesti norimą skaičių ir po to parašytų ar šis
        //skaičius yra lyginis ar ne lyginis. Užuomina panaudokite % operatoriu.
        System.out.println("Iveskite skaiciu");
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        if (a%2==0){
            System.out.println("Jusu ivestas skaicus yra lyginis");
        }else{
            System.out.println("Jusu ivestas skaicius yra nelyginis");
        }
    }
}
