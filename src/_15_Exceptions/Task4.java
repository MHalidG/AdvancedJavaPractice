package _15_Exceptions;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        /*6- eğer password 6 dan küçük olursa yeniden userı girsin.passwordun
        6 karakterden küçük olup olmadığını classın içinde kontrol ediniz.*/
        String pass = "";
        Scanner scan = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Lutfen sifrenizi giriniz");
                pass = scan.nextLine();
                if (pass.length() < 6) {
                    throw new Exception();
                } else break;

            } catch (Exception e) {
                System.out.println("Sifre 6 karakterden kisa olamaz");

    } finally {
        System.out.println("Finaly Is basinda");
    }
            }
        }
    }
