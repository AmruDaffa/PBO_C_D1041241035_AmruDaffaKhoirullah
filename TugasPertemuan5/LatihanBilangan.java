public class LatihanBilangan {
    public static void main(String[] args) {
        //Deklarasi angka
        int number = 12; //int number = -7;
        //Tampilkan Pemeriksaan Bilangan
        System.out.println("=== PEMERIKSAAN BILANGAN ===");
        System.out.println("Bilangan: " + number);
        //Cek jika angka positif atau negatif atau nol
        if (number > 0){
            //jika angka positif
            System.out.println("Jenis: Bilangan Positif");
            //Cek genap ganjil
            if (number % 2 == 0){
                System.out.println("Tipe: Genap");
            } else {
                System.out.println("Tipe: Ganjil");
            }
        } else if (number < 0){
            // jika angka negatif
            System.out.println("Jenis: Bilangan Negatif");
            //Cek genap ganjil
            if (number % 2 == 0){
                System.out.println("Tipe: Genap");
            } else {
                System.out.println("Tipe: Ganjil");
            }
        } else {
            //Jika angka 0
            System.out.println("Jenis: Bilangan Nol");
        }
    }
}
