public class LatihanProduk {
    //Deklarasi Konstanta PAJAK
    public static final double PAJAK = 0.11;
    public static void main(String[] args) {
        //Deklrasi Variabel
        String productName = "Laptop Asus Gaming TUF";
        int productPrice = 9400000;
        int productStock = 10;
        boolean isAvailable = true;
        //Kalikan Harga produk dengan jumlah stok
        int stockPrice = productPrice * productStock;
        //Kalikan harga stok produk
        double priceTax = stockPrice * PAJAK;
        //Tampilkan Informasi Produk
        System.out.println("=== INFORMASI PRODUK ===");
        System.out.println("Nama Produk         : " + productName);
        System.out.println("Harga Satuan        : Rp " + productPrice);
        System.out.println("Jumlah Stok         : " + productStock);
        System.out.println("Status Tersedia     : " + isAvailable);
        System.out.println("---");
        System.out.println("Total Nilai Stok    : Rp " + stockPrice);
        /*
        Gunakan String.format untuk mencetak angka 
        dalam bentuk bilangan bulat (tanpa desimal) 
        agar tidak tampil dalam notasi ilmiah (E) dan tanpa tanda koma/titik
        */
        System.out.println("Pajak (11%)         : Rp " + String.format("%.0f", priceTax));

    }
}
