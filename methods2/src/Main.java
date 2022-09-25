public class Main {

    public static void main(String[] args) {
        String mesaj = "Bugun hava cok guzel";
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        int sayi = topla(5,7);
        System.out.println(sayi);
        int toplam = topla2(2,3,4,8,8,7);
        System.out.println(toplam);
    }
    public static void ekle(){
        System.out.println("Eklendi");
    }
    public static void sil(){
        System.out.println("Silindi");
    }
    public static void guncelle(){
        System.out.println("Guncellendi");
    }
    public static int topla(int sayi1, int sayi2){
        return sayi1+sayi2;
    }
    public static String sehirVer(){
        return "Ankara";
    }
    //variable arguments 3 nokta ile yapiliyor
    //ornegin hesap makinesinde istedigin kadar sayi girebiliyorsun
    //bu ise yarıyor.
    public static int topla2(int... sayilar){
        int toplam=0;
        for(int sayi: sayilar){
            toplam+=sayi;
        }
        return toplam;
    }
}