import java.util.Scanner;
public class Main
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        //Конвертация евро в выбрнную валюту.
        System.out.println("Unesite vrijednost: ");
        int vrijednost = sc.nextInt();
        
        if(vrijednost<0){
            System.out.println("Pogresna vrijednost");
            return;
        }

        System.out.println("Izaberite valutu: ");
        System.out.println("1 za USD (američki dolar - kurs 1.13)\n2 za CAD (kanadski dolar - kurs 1.47)\n3 za RSD (srpski dinar - kurs 120)\n4 za HRK (hrvatska kuna – kurs 7.63)");
        int valuta = sc.nextInt();
        double iznos = 1;
        switch(valuta){
            case 1: 
                iznos = (vrijednost * 1.13);
                System.out.println(vrijednost + " EUR = " + iznos + " USD");
                break;
            case 2:
                iznos = (vrijednost * 1.47);
                System.out.println(vrijednost + " EUR = " + iznos + " CAD");
                break;
            case 3:
                iznos = (vrijednost * 120);
                System.out.println(vrijednost + " EUR = " + iznos + " RSD");
                break;
            case 4:
                iznos = (vrijednost * 7.63);
                System.out.println(vrijednost + " EUR = " + iznos + " HRK");
                break;
            default: 
                System.out.println("Pogresan broj");
        }
    }    
}


