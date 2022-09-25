public class Main {

    public static void main(String[] args) {
        //overloading: ikisininde ismi topla ama sikinti cikarmiyor
        //ve birinde 2 digerinde 3 elemani kullanabiliyoruz.
        DortIslem dortIslem = new DortIslem();
        System.out.println(dortIslem.topla(2,3));
        System.out.println(dortIslem.topla(2,3,4));
    }


}