public class Main {
    public static void main(String[] args) {

        //Deklarasi objek 1
        Persegi prsg = new Persegi();
        Persegi kllg = new Persegi();

        //Deklarasi objek 2
        Angka luas = new Angka();
        Angka keliling = new Angka();

        //Deklarasi objek 3
        Saudara sdr = new Saudara();

        //Deklarasi dari class Angka
        System.out.println("==========");
        System.out.println(luas.persegipanjang(20,10));
        System.out.println(keliling.persegipanjang(20.0, 10.0));
        System.out.println("========== \n");

        //Deklarasi dari class Persegi
        System.out.println("==========");
        System.out.println(prsg.persegi(10));
        System.out.println(kllg.persegi(10.0));
        System.out.println("========== \n");

        //Deklarasi dari class saudara
        System.out.println("==========");
        System.out.println(sdr.saudara("Nama adik saya Rakha, "+"Nama saudara saya Leni, "+"Nama kakak saya Reni"));
    }
}
