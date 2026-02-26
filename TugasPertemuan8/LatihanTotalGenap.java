public class LatihanTotalGenap {
    public static void main(String[] args) {
        //Tampilkan Total bilangan genap
        System.out.println("=== TOTAL BILANGAN GENAP 1-20 ===");
        //Deklarasi variabel total
        int total = 0;
        //looping sebanyak 20 kali
        for (int i = 1; i <= 20; i++) {
            //cek jika angka genap
            if (i % 2 == 0){
                //total bertambah sebanyak angka genap
                total += i;
                //Tampilkan angka yang ditambaha dan total pertambahan 
                System.out.println("Tambah: " + i + " -> Total: " + total);
            }
        }
        System.out.println("---");
        //Tampilkan Total akhir
        System.out.println("Total akhir: " + total);
    }
}
