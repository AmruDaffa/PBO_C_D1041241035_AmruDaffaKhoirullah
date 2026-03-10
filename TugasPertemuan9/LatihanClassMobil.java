package TugasPertemuan9;
//buat Class Mobil
class Mobil {
    //buat Atribut
    String merk;
    String warna;
    int tahun;
    int kecepatan;
    //Membuat Method TampilkanSpesifikasi
    public void tampilkanSpesifikasi(){
        System.out.println("=== SPESIFIKASI MOBIL ===");
        System.out.println();
        System.out.println("Merk : " + merk);
        System.out.println();
        System.out.println("Warna: " + warna);
        System.out.println();
        System.out.println("Tahun: " + tahun);
        System.out.println();
    }
    //Membuat Method Percepat
    public void percepat(){
        kecepatan += 20;
        System.out.println("Mobil dipercepat...");
        System.out.println();
    }
    //Membuat Method TampilkanKecepatan
    public void tampilkanKecepatan(){
        System.out.println("Kecepatan saat ini: " + kecepatan +" km/jam");
        System.out.println();
    }
}
public class LatihanClassMobil {
     public static void main(String[] args) {
        //membuat object mobil
        Mobil mobil1 = new Mobil();
        mobil1.merk = "Toyota Avanza";
        mobil1.warna = "Silver";
        mobil1.tahun = 2020;
        mobil1.kecepatan = 0;
        //Panggil method TampilkanSpesifikasi
        mobil1.tampilkanSpesifikasi();
        System.out.println();
        System.out.println();
        //Percepat mobil 2x
        mobil1.percepat();
        mobil1.percepat();
        //Tampilkan kecepatan mobil
        mobil1.tampilkanKecepatan();
    }
}
