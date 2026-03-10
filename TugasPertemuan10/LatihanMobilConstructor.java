package TugasPertemuan10;
//buat Class Mobil
class Mobil {
    //buat Atribut
    String merk = "Belum Diisi";
    String warna = "Belum Diisi";
    int tahun = 0; 
    //Membuat Method TampilkanSpesifikasi
    public void tampilkanSpesifikasi(){
        System.out.println("=== SPESIFIKASI MOBIL ===");
        System.out.println("Merk : " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun: " + tahun);
        System.out.println();
    }
    //Membuat Constructor tanpa Parameter
    public Mobil(){
        
    }
    //Membuat Constructor dengan 1 Parameter
    public Mobil(String merk){
        this.merk = merk;
    }
    //Membuat Constructor dengan 3 Parameter
    public Mobil(String merk, String warna, int tahun){
        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
    }
}
public class LatihanMobilConstructor {
     public static void main(String[] args) {
        //membuat object mobil1 dengan Constructor tanpa paramater
        Mobil mobil1 = new Mobil();
        //membuat object mobil1 dengan Constructor 1 paramater
        Mobil mobil2 = new Mobil("Toyota");
        //membuat object mobil1 dengan Constructor 3 paramater
        Mobil mobil3 = new Mobil("Honda Civic", "Merah", 2023);
        //Tampilkan mobil1
        mobil1.tampilkanSpesifikasi();
        //Tampilkan mobil2
        mobil2.tampilkanSpesifikasi();
        //Tampilkan mobil3
        mobil3.tampilkanSpesifikasi();
    }
}
