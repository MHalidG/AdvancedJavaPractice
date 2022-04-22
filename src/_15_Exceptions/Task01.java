package _15_Exceptions;


import java.util.Scanner;

public class Task01 {
    static int v;
    static int f ;
    static double ortalama;
   /* 'ortalama' isminde bir method create ediniz ve int v  - int f  isminde 2 adet parametresi olsun.
    int v = vize
    int f = final

    Eğer  vize 100 den büyük, veya final 100'den büyük, veya vize 0'dan küçük, veya final 0'dan küçük ise,
    Sistem ArithmeticException hatası versin ve "Notlar 0-100 arasında olmalı" mesajını döndürsün.
    Diğer durumlarda ise,
    vizenin yüzde 40 ını, finalin yüzde 60 ını alsın ve toplasın.(ortalama =)
    vizeye 120, finale 80 girin.

    Programın çalışmasını sağlayın. (handle edin)*/
   public static void main(String[] args) throws Exception {
        notGirdi(v,f);
       System.out.println(ortalama);
   }

   private static double notGirdi(int v, int f) throws Exception {
       Scanner scan = new Scanner(System.in);
       while (true) {
           System.out.println("Lutfen vize notunu giriniz");
           try {
               if (v < 0 || v > 100) {
                   System.out.println("Not 0-100 arasinda olmalidir.");}
               v = Integer.parseInt(scan.next());
               break;

           } catch (Exception e) {
               System.out.println("Not tam sayi olmalidir.");

           }
       }

        while (true) {

                try  {
                    if (v < 0 || v > 100) {
                    System.out.println("Not 0-100 arasinda olmalidir.");
                    v = Integer.parseInt(scan.next());

                    break;}
                } catch (Exception e) {
                    throw new ArithmeticException();
                }
            }

        while (true) {
            System.out.println("Lutfen final notunu giriniz");

            try {
                f = Integer.parseInt(scan.next());
                break;
            } catch (Exception e) {
                System.out.println("Not tam sayi olmalidir.");
            }
        }
        while (true){

                try {
                    if (f < 0 || f > 100) {
                    System.out.println("Not 0-100 arasinda olmalidir.");
                    f = Integer.parseInt(scan.next());}
                    break;
                } catch (Exception e) {
                    throw new ArithmeticException();
                }
            }ortalama = ((v * 40) / 100) + ((f * 60) / 100);


       return ortalama;
    }
    }