public class Main {

    public static void main(String[] args) {

        String mesaj = "Bugün hava çok güzel.";

        System.out.println(mesaj);

/*
        System.out.println("Eleman sayısı: " + mesaj.length());
        System.out.println("5. Eleman: " + mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın!")); //concat sadece birlestiriyo mesaj degiskenine kaydetmiyor.
        System.out.println(mesaj);
        System.out.println(mesaj.startsWith("b"));//ne ile basladigini kontrol ediyor. true/false donduruyor.
        System.out.println(mesaj.endsWith("."));//ne ile bittigini kontrol ediyor. true/false donduruyor.

        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("av"));
        System.out.println(mesaj.lastIndexOf('e'));
        System.out.println(mesaj.lastIndexOf('a'));*/
        String yeniMesaj = mesaj.replace(' ','-');
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2,5));

        for(String kelime : mesaj.split(" ")){
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());

        String mesaj2 = "        Bugün hava çok güzel.     ";

        System.out.println(mesaj2);

        System.out.println(mesaj2.trim());
    }
}