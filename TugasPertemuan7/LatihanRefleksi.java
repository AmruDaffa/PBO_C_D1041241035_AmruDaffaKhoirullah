public class LatihanRefleksi {
    public static void main(String[] args) {
        //Deklarasi Angka
        int angka = 1;
        //Looping dengan while
        System.out.println("=== MENGGUNAKAN WHILE ===");
        while (angka <= 5){
            System.out.print(angka + " ");
            //tambah angka sehingga iterasi bertambah
            angka++;
        }
        angka = 1;
        System.out.println();
        //Looping Denge Do While
        System.out.println("=== MENGGUNAKAN DO-WHILE ===");
        do { 
            System.out.print(angka + " ");
            //iterasi
            angka++;
        } while (angka <= 5); //kondisi
        System.out.println();
        //Looping dengan for
        System.out.println("=== MENGGUNAKAN FOR ===");
        //Inisiasi kondisi dan iterasi 
        for (int i = 1; i <= 5; i++){
            System.out.print(i + " ");
        }
    }
}
