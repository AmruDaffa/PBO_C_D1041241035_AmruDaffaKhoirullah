public class LatihanDeretGanjil {
    public static void main(String[] args) {
        //Deklarasi Angka
        int angka = 1;
        //Tampilkan Bilangan Ganjil 1-15
        System.out.println("=== BILANGAN GANJIL 1-15 ===");
        //looping while sampai angka kurang dari sama dengan 15
        while (angka <= 15){
            System.out.print(angka + " ");
            //tambahkan angka dengan 2 sehingga hanya menampilkan angka ganjil
            angka += 2;
        }
    }
}
