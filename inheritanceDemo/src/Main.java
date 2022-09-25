public class Main {
    public static void main(String[] args) {

        KrediUI krediUI = new KrediUI();

        //3 'unu de kullanabiliyoruz anne'yi verip cocuklara ulasabiliyoruz yani.
        krediUI.KrediHesapla(new OgretmenKrediManager());
        krediUI.KrediHesapla(new AskerKrediManager());
        krediUI.KrediHesapla(new TarimKrediManager());
    }
}