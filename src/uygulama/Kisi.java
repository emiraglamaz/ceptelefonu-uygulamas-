package uygulama;

public class Kisi {
  private   String isim;
    private  String telno;

    public Kisi(String isim,String telno){
        this.isim=isim;
        this.telno=telno;

    }
    public String getIsim() {
        return isim;
    }

    public String getTelno() {
        return telno;
    }
    public static Kisi olustur(String isim,String telno){
        return new Kisi(isim,telno);
    }

}
