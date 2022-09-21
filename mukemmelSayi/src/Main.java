public class Main {

    public static void main(String[] args) {
    //mukemmel sayi otomasyonu
    //6 ---> 1,2,3
    //28 --> 1,2,4,7,14
    int number = 500;
    if(number<1){
        System.out.println("Gecersiz sayi girdiniz.");
        return;
    }
    int i,j,total=0;
    for (i=1;i<=number;i++){
        for(j=1;j<i;j++){
            if((i%j)==0){
                total+=j;
            }

        }
        if(i==total){
            System.out.println(i+ " mukemmel bir sayidir.");
        }/*else {
            System.out.println(i+ " mukemmel bir sayi degildir.");
        }*/

        total=0;
    }


    }
}