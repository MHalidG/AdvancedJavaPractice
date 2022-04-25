package _15_Exceptions;

import java.util.ArrayList;
import java.util.List;

public class PojoSc {
    /* 2- fieldları okulAd, maxOgrenciSayisi,
    ArrayList cinsinden Öğrencileri olan bir Okul pojo class create ediniz,*/
    private String okulAd;
    private int maxOgrenciSayi;
    List<PojoOgr> ogr;

    public static List<PojoSc> okulList=new ArrayList<PojoSc>();

    @Override
    public String toString() {
        return "PojoSc{" +
                "okulAd='" + okulAd + '\'' +
                ", maxOgrenciSayi=" + maxOgrenciSayi +
                ", ogr=" + ogr +
                '}';
    }

    PojoSc(String okulAd, int maxOgrenciSayi, List<PojoOgr> ogr){
        this.okulAd=okulAd;
        this.maxOgrenciSayi=maxOgrenciSayi;
        this.ogr=ogr;
    }

    PojoSc(){

    }


    public String getOkulAd() {
        return okulAd;
    }

    public void setOkulAd(String okulAd) {
        this.okulAd = okulAd;
    }

    public int getMaxOgrenciSayi() {
        return maxOgrenciSayi;
    }

    public void setMaxOgrenciSayi(int maxOgrenciSayi) {
        this.maxOgrenciSayi = maxOgrenciSayi;
    }

    public List<PojoOgr> getOgr() {
        return ogr;

    }

    public void setOgr(List<PojoOgr> ogr) {
        this.ogr = ogr;
    }





}
