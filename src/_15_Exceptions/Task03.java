package _15_Exceptions;

import java.util.Random;

public class Task03 {
    /*
    randomSayi isminde static void bir method create ediniz.
    Bu method içerisinde iki int random sayı oluştursun. (0'dan 10 a kadar)
    Bu iki random sayının toplamını yazdırın.
    Eğer bu iki random sayının toplamı 12 den küçükse "Exception" versin ve mesaj olarak
            ("Sayı 12'den küçük ise hata verir") print edin.
*/
    public static void main(String[] args)  {
        randomTopla();

    }

    private static void randomTopla()  {
        Random rnd=new Random();
        int a= rnd.nextInt(10);
        System.out.println(a);
        int b= rnd.nextInt(10);
        System.out.println(b);

        if (a+b<12) {
            System.out.println("Sayı 12'den küçük ise hata verir");
       throw new IllegalArgumentException();

        }else{
            System.out.println(a+b);
        }
    }
}