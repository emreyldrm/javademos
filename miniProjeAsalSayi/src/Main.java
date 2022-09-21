public class Main {

    public static void main(String[] args) {
        // girilen sayiya kadar olan bütün sayilarin asallik durumunu belirten program.
        int number = 25;
        int remainder = number % 2;
        //System.out.println(remainder);

        if(number == 1){
            System.out.println(number +" Asal sayi değildir.");
            return;
        }
        if(number<1){
            System.out.println("Gecersiz sayi");
            return;
        }
        int i,j;
        boolean isPrime = false;
        for(i=2;i<=number;i++){
            for(j=2;j<i;j++){
                if(i%j==0){
                    System.out.println(i+" Asal sayi değildir.");
                    isPrime= true;
                    break;
                }

            }
            if(isPrime==false){
                System.out.println(i+" Asal sayidir");
            }
            isPrime=false;
        }



    }
}