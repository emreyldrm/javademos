public class Main {

    public static void main(String[] args) {

        String ogrenci1 = "Engin";
        String ogrenci2 = "Veli";
        String ogrenci3 = "Emre";
        //ctrl+shift+alt+L ile kodu düzenleyebiliyorsun.
        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);

        System.out.println("-----------------------");

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Engin";
        ogrenciler[1] = "Veli";
        ogrenciler[2] = "Emre";
        ogrenciler[3] = "Ahmet";
        //ogrenciler[4] = "Ali"; bu kod hata veriyor. Vermemesi icin her seferinde new String' deki sayiyi da
        //arttirman lazim.

        for(int i=0;i<ogrenciler.length;i++) {
            System.out.println(ogrenciler[i]);
        }

        //for' un ikinci kullanimi
        System.out.println("-----------------------");
        for(String aaaaa:ogrenciler){ //aaaa kismina kodun okunabilirligi icin ogrenci yazman daha dogru olur!!
            System.out.println(aaaaa);
        }

    }
}