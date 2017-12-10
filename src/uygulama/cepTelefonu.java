package uygulama;

import java.util.ArrayList;

public class cepTelefonu {
    private ArrayList<Kisi> rehber;
    private String kendinumaram;

    public cepTelefonu(String kendinumaram) {
        this.kendinumaram = kendinumaram;
        this.rehber = new ArrayList<>();

    }

    public boolean ekleyenikisi(Kisi yenikisi) {
        if (kisiBul(yenikisi.getIsim()) >= 0) {
            System.out.println(yenikisi.getIsim() + "bu kişi zaten var ");
            return false;
        }
        this.rehber.add(yenikisi);
        return true;
    }

    public int kisiBul(Kisi aranacakKisi) {

        return this.rehber.indexOf(aranacakKisi);
    }

    public int kisiBul(String isim) {
        for (int i = 0; i < rehber.size(); i++) {
            Kisi oankikisi = this.rehber.get(i);
            if (oankikisi.getIsim().equals(isim)) {
                return i;
            }
        }
        return -1;
    }

    public void tumRehber() {
        System.out.println("\n*********tum rehber********\n");
        if (rehber.size() == 0) {
            System.out.println("rehber boş");
        }
        for (int i = 0; i < this.rehber.size(); i++) {

            System.out.println((i + 1) + "- " + rehber.get(i).getIsim() + "->" + rehber.get(i).getTelno());
        }
    }
    public  boolean kisisil(Kisi silinecekKisi){
       int pozition= kisiBul(silinecekKisi);
       if (pozition<0){
           System.out.println("boyle bir kisiyok");
           return  false;
       }
       this.rehber.remove(silinecekKisi);
       return  true;
    }
    public boolean kisiguncelle(Kisi eskiKisi,Kisi yeniKisi){
        int bulnunanPozition=kisiBul(eskiKisi);
        if (bulnunanPozition<0){
            System.out.println("böyle bir kayıt yok");
            return  false;
        }
        rehber.set(bulnunanPozition,yeniKisi);
        System.out.println(eskiKisi.getIsim()+"  degeri "+yeniKisi.getIsim()+"   ile guncellendi");
        return true;
    }
    public Kisi kisisorgula(String isim){
        int pozisyo=kisiBul(isim);
        if (pozisyo>=0){
            return rehber.get(pozisyo);
        }
        return  null;
    }
}


