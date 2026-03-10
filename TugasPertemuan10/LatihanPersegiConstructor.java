package TugasPertemuan10;
//buat Class Persegi
class Persegi {
    //buat Atribut
    int sisi;
    int luas;
    int keliling;
    //Membuat Method TampilkanHasil
    public void tampilkanHasil(){
        System.out.println("=== PERSEGI ===");
        System.out.println("Sisi    : " + sisi + " cm");
        System.out.println("Luas    : " + luas + " cm²");
        System.out.println("Keliling: " + keliling + " cm");
        System.out.println();
    }
    //Membuat Constructor dengan validasi
    public Persegi(int sisi){
        //jika sisi kurang dari 1 maka otomatis set ke 1
        if (sisi <= 0){
            System.out.println("ERROR: Sisi tidak boleh <= 0. Diset ke default (1).");
            this.sisi = 1;
        } else {
            this.sisi = sisi;
        }
        luas = this.sisi * this.sisi;
        keliling = this.sisi * 4;
    }
}
public class LatihanPersegiConstructor {
     public static void main(String[] args) {
        //Membuat Persegi yang valid menggunakan Constructor yang divalidasi
        Persegi persegi1 = new Persegi(5);
        //Tampilkan Hasil persegi1
        persegi1.tampilkanHasil();
        //Membuat Persegi yang tidak valid menggunakan Constructor yang divalidasi
        Persegi persegi2 = new Persegi(-3);
        //Tampilkan Hasil persegi2
        persegi2.tampilkanHasil();
    }
}
