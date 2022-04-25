package _15_Exceptions;

import java.util.Scanner;

public class Task1 {
    static int vize = 0;
    static int fnal = 0;
    static int kontrol = 0;
    static Scanner scan = new Scanner(System.in);
    static double ortalama;

    public static void main(String[] args) {

        vize=vizeAl(vize);

        fnal=fnalAl(fnal);
        }

    private static int vizeAl(int vize) {
        while (true) {
            try {System.out.println("Lutfen vize notunu giriniz");
                vize = Integer.parseInt(scan.next());
                break;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        vizeKontrol(vize);
        return vize;
    }


    private static int vizeKontrol(int vize) {

        if (vize < 0 || vize > 100) {
            System.out.println("Not 0-100 arasinda olmalidir.");
            vizeAl(vize);
        } else {
            System.out.println("Vize notunuz kabul edildi");
        }
        return vize;
    }


     private static int fnalAl(int fnal) {
         while (true) {
             try {
                 System.out.println("Final notunuzu giriniz");
                 fnal = Integer.parseInt(scan.next());
                 break;
             } catch (NumberFormatException e) {
                 e.printStackTrace();
             }
         } fnalKon(fnal);
         return fnal;
     }

    private static void fnalKon(int fnal) {

        if (fnal < 0 || fnal > 100) {
            System.out.println("Not 0-100 arasinda olmalidir.");
            fnalAl(vize);
        } else {
            System.out.println("Final notunuz kabul edildi");
        }
       ortalama = ((vize * 40) / 100) + ((fnal * 60) / 100);
        System.out.println("ortalama: " + ortalama);
    }
   /* private static double ortalama(int a,int b) {
        double ortalama=0;



        return ortalama;
    }*/

}
