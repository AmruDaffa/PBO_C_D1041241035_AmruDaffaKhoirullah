public class LatihPerhitungan {
    public static void main(String[] args) {
        int Saldo_Awal = 1000000;
        int Setoran = 500000;
        int Penarikan = 250000;
        int Saldo_Setelah_Setor = Saldo_Awal + Setoran;
        int saldo_akhir = Saldo_Setelah_Setor - Penarikan;
        System.out.println("=== SIMULASI TRANSAKSI BANK ===");
        System.out.println("Saldo Awal              : " + Saldo_Awal);
        System.out.println("Setoran                 : " + Setoran);
        System.out.println("Saldo Setelah Setor     : " + Saldo_Setelah_Setor);
        System.out.println("Penarikan               : " + Penarikan);
        System.out.println("Saldo Akhir             : " + saldo_akhir);


    }
}
