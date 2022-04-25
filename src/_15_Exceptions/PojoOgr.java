package _15_Exceptions;

import java.util.ArrayList;
import java.util.List;

public class PojoOgr {
      /*1- fieldları ad, soyad, yas olan bir Ogrenci pojo class'ı create ediniz.

       */
    public static List<PojoOgr> ogrList=new ArrayList<>();

    @Override
    public String toString() {
        return "PojoOgr{" +
                "ad='" + ad + '\'' +
                ", soyAd='" + soyAd + '\'' +
                ", yas=" + yas +
                '}';
    }

    public PojoOgr(String ad, String soyAd, int yas){
        this.ad=ad;
        this.soyAd=soyAd;
        this.yas=yas;
    }
    public PojoOgr(){

    }
    private String ad;
    private String soyAd;
    private int yas;


    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}
