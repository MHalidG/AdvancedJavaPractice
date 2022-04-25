package _15_Exceptions;

import java.util.Scanner;

import static _15_Exceptions.PojoOgr.ogrList;
import static _15_Exceptions.PojoSc.okulList;

public class OkulMain {
//public static List<PojoOgr> ogrList=new ArrayList<>();
    /*1- fieldları ad, soyad, yas olan bir Ogrenci pojo class'ı create ediniz.

            2- fieldları okulAd, maxOgrenciSayisi,
    ArrayList cinsinden Öğrencileri olan bir Okul pojo class create ediniz,

     3- main metodunun olduğu OkulMain isimli bir class create ediniz.

            4- bir okul obj create edip, bu okula max öğrenci miktarına ulaşana kadar öğrenci
    ekleyiniz.Fakat oluşturacağınız öğrencilerin yaşı 15 i geçmemeli.
    bu yaşı geçen bir öğrenci eklenmek istenir ise yerine başka öğrenci isteyiniz.*/
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        PojoSc okul=new PojoSc();
        PojoOgr ogr=new PojoOgr();

        System.out.println("Lutfen okul ismini giriniz");
        okul.setOkulAd(scan.next());
        System.out.println("Lutfen okul kapasitesini giriniz");
        okul.setMaxOgrenciSayi(scan.nextInt());
        System.out.println("Lutfen ogrenci kaydi olusturunuz");



        for (int i = 0; i < okul.getMaxOgrenciSayi() ; i++) {
            scan.nextLine();
            System.out.println("Ogrenci adini giriniz");

            ogr.setAd(scan.nextLine());
            System.out.println("Ogrenci Soyadini giriniz");

            ogr.setSoyAd(scan.nextLine());

           while (true){
            try {
                System.out.println("Ogrenci yasini giriniz");
                ogr.setYas(scan.nextInt());
                if (ogr.getYas()>15||ogr.getYas()<7){
                    throw new Exception();
                }else break;
            } catch (Exception e) {
                System.out.println("Ogrenci Yasi 7-15 arasinda olmalidir");
                break;
            }
        }
            ogrList.add(ogr);
            System.out.println(ogrList);

        }

        PojoSc okul1=new PojoSc(okul.getOkulAd(),okul.getMaxOgrenciSayi(), ogrList);

        okulList.add(okul1);

        System.out.println(okulList);

    }
}
