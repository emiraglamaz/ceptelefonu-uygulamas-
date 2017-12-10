package uygulama;
import java.util.Scanner;
public class Main {
   private static Scanner ara=new Scanner(System.in);
    private  static  cepTelefonu cep=new cepTelefonu("2015141026");

    public static void main(String[] args){



        telefonuBaslat();
        boolean cikis=false;
        while (!cikis){
            System.out.println("menuyu görmek için 6 yı tuslayiniz");
            int secim=ara.nextInt();
            switch (secim){
                case 0:
                    System.out.println("cıkış yapılıyor");
                    cikis=true;
                    break;
                case 1:
                    cep.tumRehber();
                    break;
                case 2:
                    yenikisieklemetodu();
                    break;
                case 3:
                    kisiSorgulametodu();
                    break;
                case 4:
                    kisiSilmetodu();
                    break;
                case 5:
                    kisiGuncellemeMetodu();
                    break;
                case 6:
                    menuyuGoster();
                    break;
                default:
                    System.out.println("lutfen 0 ile 6 arasında bir deger giriniz");

            }
        }
    }

    private static void kisiGuncellemeMetodu() {
        System.out.println("gunecellenecek kişinin adi : ");
        String isim=ara.next();
        Kisi bulunanKisi=cep.kisisorgula(isim);
        if (bulunanKisi==null){
            System.out.println("kayıt bulunamadı");
            return;
        }
        System.out.println("yeni isim degeri");
        String yeniisim=ara.next();
        System.out.println("yenin telefon no : ");
        String yenitel=ara.next();
        cep.kisiguncelle(bulunanKisi,Kisi.olustur(yeniisim,yenitel));



    }

    private static void kisiSilmetodu() {
        System.out.println("silinecek kişinin adi : ");
        String isim=ara.next();
        Kisi bulunanKisi=cep.kisisorgula(isim);
        if (cep.kisisil(bulunanKisi)){
            System.out.println("silme işlemi başarılı");
        }

    }

    private static void kisiSorgulametodu() {
        System.out.println("aranacak kişi adını giriniz");
        String isim=ara.next();
        Kisi bulunanKisi=cep.kisisorgula(isim);
        if (bulunanKisi==null){
            System.out.println(isim+" isminde bir kayıt bulunsmsdı\n");
            return;
        }
        System.out.println("bulunan kişi ismi : "+bulunanKisi.getIsim()+"->"+bulunanKisi.getTelno());
    }

    private static void yenikisieklemetodu() {
        System.out.println("yeni kişinin adı:");
        String isim=ara.next();
        System.out.println("kisinin telefon numarası : ");
        String telno=ara.next();
        cep.ekleyenikisi(Kisi.olustur(isim,telno));
    }

    private static void telefonuBaslat() {
        System.out.println("telefon başlatılıyor....");
    }

    private static void menuyuGoster() {
        System.out.println("0--Cıkış\n" +
                "1--Tüm Kişileri listele\n" +
                "2--Yeni kişi ekle\n" +
                "3--Kişi Sorgula\n" +
                "4--Kisi Sil\n" +
                "5--Kişi Guncelle\n" +
                "6--Menuyu Goster");
    }

}
