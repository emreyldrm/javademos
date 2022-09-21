public class Main {

    public static void main(String[] args) {

        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 5;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }
        if (varMi) { //boolean oldugu icin operatorlere gerek yok true/false geliyor zaten.
            System.out.println("Sayi mevcuttur.");
        } else {
            System.out.println("Sayi mevcut degildir.");
        }


    }
}