package Projects.Projects_01;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberBetweenTwoNumbers {


    /*
    Given two positive integer numbers

     integer 1 is min
     integer 2 is max

    create a random number between min and max

    output should be int

     */

    /*
    İki tane pozitif integer sayısı verildiğinde

    sayı 1 min degerinde

    sayı 2 max degerinde

    min ve max arasinda random sayi elde et(olustur)

    output veri tipi int olmali
     */

    public static void main(String[] args) {
        //  code Start here don't change before this line
       // kodu burdan başlatın ve bu satırdan önceki kodlari değiştirmeyin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Min degeri girin");
        int minSayi= scan.nextInt();
        System.out.println("Lütfen Max degeri girin");
        int maxSayi= scan.nextInt();

        int fark=maxSayi-minSayi;
        Random rdm=new Random();

        int sonuc=rdm.nextInt(fark)+1;
        System.out.println(sonuc+minSayi);

    }
}
