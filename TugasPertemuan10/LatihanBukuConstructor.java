package TugasPertemuan10;
//buat Class buku
class Buku {
    //buat Atribut
    String judul;
    String pengarang;
    int harga;
    //Membuat Method TampilkanInfo
    public void tampilkanInfo(){
        System.out.println("=== INFORMASI BUKU ===");
        System.out.println("Judul    : " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Harga    : Rp " + harga);
        System.out.println();
    }
    //Membuat Constructor tanpa parameter
    public Buku(){
        judul = "Belum Diisi";
        pengarang = "Belum Diisi";
        harga = 0;
    }
    //Membuat Constructor dengan parameter
    public Buku(String judul, String pengarang, int harga){
        this.judul = judul;
        this.pengarang = pengarang;
        this.harga = harga;
    }
}
public class LatihanBukuConstructor {
     public static void main(String[] args) {
            //Membuat object Buku pertama dengan constructor tanpa parameter
            Buku buku1 = new Buku();
            //Membuat buku kedua dan ketiga dengan Constructor paramater
            Buku buku2 = new Buku("Pemrograman Java","Budi Raharjo",125000);
            Buku buku3 = new Buku("Algoritma dan Struktur Data","Rinaldi Munir",150000);
            //Tampilkan Info buku1
            buku1.tampilkanInfo();
            //Tampilkan Info buku2
            buku2.tampilkanInfo();
            //Tampilkan Info buku3
            buku3.tampilkanInfo();
    }
}
