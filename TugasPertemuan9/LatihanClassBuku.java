package TugasPertemuan9;
//buat Class buku
class Buku {
    //buat Atribut
    String judul;
    String pengarang;
    int harga;
    //Membuat Method TampilkanInfo
    public void tampilkanInfo(){
        System.out.println("=== INFORMASI BUKU ===");
        System.out.println();
        System.out.println("Judul : " + judul);
        System.out.println();
        System.out.println("Pengarang : " + pengarang);
        System.out.println();
        System.out.println("Harga : Rp " + harga);
        System.out.println();
    }
}
public class LatihanClassBuku {
     public static void main(String[] args) {
            //Membuat object Buku pertama
            Buku buku1 = new Buku();
            buku1.judul = "Pemrograman Java";
            buku1.pengarang = "Budi Raharjo";
            buku1.harga = 125000;
            //Membuat object Buku kedua
            Buku buku2 = new Buku();
            buku2.judul = "Algoritma dan Struktur Data";
            buku2.pengarang = "Rinaldi Munir";
            buku2.harga = 150000;
            //Menampilkan data Buku1
            buku1.tampilkanInfo();
            System.out.println();
            //Menampilkan data Buku2
            buku2.tampilkanInfo();
    }
}
