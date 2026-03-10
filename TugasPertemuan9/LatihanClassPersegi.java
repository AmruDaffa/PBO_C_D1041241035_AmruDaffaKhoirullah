package TugasPertemuan9;
//buat Class Persegi
class Persegi {
    //buat Atribut
    int sisi;
    int luas;
    int keliling;
    //Membuat Method HitungLuas
    public void hitungLuas(){
        luas = sisi * sisi;
    }
    //Membuat Method HitungKeliling
    public void hitungKeliling(){
        keliling = sisi * 4;
    }
    //Membuat Method TampilkanHasil
    public void tampilkanHasil(){
        System.out.println("=== PERSEGI ===");
        System.out.println();
        System.out.println("Sisi    : " + sisi + " cm");
        System.out.println();
        System.out.println("Luas    : " + luas + " cm²");
        System.out.println();
        System.out.println("Keliling: " + keliling + " cm");
        System.out.println();
    }
}
public class LatihanClassPersegi {
     public static void main(String[] args) {
        //Membuat Object Persegi
        Persegi persegi1 = new Persegi();
        persegi1.sisi = 5;
        //Panggil Method HitungLuas
        persegi1.hitungLuas();
        //Panggil Method HitungKeliling
        persegi1.hitungKeliling();
        //Panggil Method TampilkanHasil
        persegi1.tampilkanHasil();
    }
}
