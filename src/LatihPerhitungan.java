public class LatihPerhitungan {
    public static void main(String[] args) {
        //Deklarasi Saldo Awal
        int saldoAwal = 1000000;
        System.out.println("=== SIMULASI TRANSAKSI BANK ===");
        System.out.println("Saldo Awal              : " + saldoAwal);
        //Deklarasi Setoran
        int setoran = 500000;
        System.out.println("Setoran                 : " + setoran);
        saldoAwal += setoran;
        System.out.println("Saldo Setelah Setor     : " + saldoAwal);
        //Deklarasi Penarikan
        int penarikan = 250000;
        System.out.println("Penarikan               : " + penarikan);
        saldoAwal -= penarikan;
        System.out.println("Saldo Akhir             : " + saldoAwal);
    }
}
