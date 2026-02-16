public class LatihanProduk {
    //Deklarasi Konstanta PAJAK
    public static final double PAJAK = 0.11;
    public static void main(String[] args) {
        //Deklrasi Variabel
        String productName = "Laptop Asus";
        int productPrice = 7000000;
        int productStock = 15;
        boolean isStockProductAvailable = true;
        //Kalikan Harga produk dengan jumlah stok
        int stockPrice = productPrice * productStock;
        //Kalikan harga stok produk
        double stockPriceTax = stockPrice * PAJAK;
        //Tampilkan Informasi Produk
        System.out.println("=== INFORMASI PRODUK ===");
        System.out.println("Nama Produk         : " + productName);
        System.out.println("Harga Satuan        : Rp " + productPrice);
        System.out.println("Jumlah Stok         : " + productStock);
        System.out.println("Status Tersedia     : " + isStockProductAvailable);
        System.out.println("---");
        System.out.println("Total Nilai Stok    : Rp " + stockPrice);
        System.out.println("Pajak (11%)         : Rp " + (int) (stockPriceTax));

    }
}
