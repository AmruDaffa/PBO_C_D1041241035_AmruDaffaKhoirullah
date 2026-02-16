public class LatihPerhitungan {
    public static void main(String[] args) {
        //Deklarasi Saldo Awal
        int saldoAwal = 1000000;
        System.out.println("=== SIMULASI TRANSAKSI BANK ===");
        System.out.println("Saldo Awal              : " + saldoAwal);
        //Deklarasi Setoran
        int setoranSaldo = 500000;
        System.out.println("Setoran                 : " + setoranSaldo);
        //Tambahkan Saldo Awal dengan Setoran
        saldoAwal += setoranSaldo;
        System.out.println("Saldo Setelah Setor     : " + saldoAwal);
        //Deklarasi Penarikan
        int penarikanSaldo = 250000;
        System.out.println("Penarikan               : " + penarikanSaldo);
        //Kurangi Saldo Awal dengan Penarikan
        saldoAwal -= penarikanSaldo;
        //Tampilkan Saldo Akhir
        System.out.println("Saldo Akhir             : " + saldoAwal);
    }
}
