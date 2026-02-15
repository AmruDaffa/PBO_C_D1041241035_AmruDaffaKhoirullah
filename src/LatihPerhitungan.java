public class LatihPerhitungan {
    public static void main(String[] args) {
        //Deklarasi Saldo Awal
        int Saldo_Awal = 1000000;
        //Deklarasi Setoran
        int Setoran = 500000;
        //Deklarasi Penarikan
        int Penarikan = 250000;
        //Deklarasi Saldo Setelah Setor dengan Menambahkan Saldo Awala dengan Setoran
        int Saldo_Setelah_Setor = Saldo_Awal + Setoran;
        //Deklarsi Saldo Akhir dengan Mengurangkan Saldo Setelah Setor dengan Penarikan
        int saldo_akhir = Saldo_Setelah_Setor - Penarikan;
        //Menampilkan Transaksi Bank
        System.out.println("=== SIMULASI TRANSAKSI BANK ===");
        System.out.println("Saldo Awal              : " + Saldo_Awal);
        System.out.println("Setoran                 : " + Setoran);
        System.out.println("Saldo Setelah Setor     : " + Saldo_Setelah_Setor);
        System.out.println("Penarikan               : " + Penarikan);
        System.out.println("Saldo Akhir             : " + saldo_akhir);
    }
}
