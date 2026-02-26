public class LatihanCariKelipatan {
    public static void main(String[] args) {
        //Tampilkan Cari Kelipatan
        System.out.println("=== CARI KELIPATAN 7 ===");
        //for looping sebanyak 50 kali
        for (int i = 1; i <= 50; i++){
            System.out.println("Cek : " + i);
            //cek jika angka merupakan keliapatan 7
            if (i % 7 == 0){
                System.out.println("Kelipatan 7 pertama: " + i);
                //hentikan looping
                break;
            }
        }
        System.out.println("Pencarian selesai.");
    }
}
