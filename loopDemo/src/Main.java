public class Main {

        public static void main (String[] args) {

        //For

        for(int i =1;i<=10;i++) {
            System.out.println(i);


        }
        System.out.println("For Döngüsü Bitti");
        //While

        int i=1;// For döngüsünde tanimladigimiz i sadece for blogunda gecerli
                // oldugundan burada tekrardan i tanimlamak zorundayiz.
        while(i<10){
            System.out.println(i);
            i+=2;
        }

        System.out.println("While Döngüsü Bitti");




        //Do-While
        int j=100;
        do { // do-while da ilk önce içindekini döndürür daha sonra şartı kontrol eder
             // bu yüzden bir kere yazdiriyor. While da ise ilk önce şartı kontrol eder
             // daha sonra içindekini çalıştırır.
            System.out.println(j);
            j+=2;

        }while(j<10);

        System.out.println("Do-While Döngüsü Bitti");

        }
}

