public class p053TernaryOperator {
    public static void main(String[] args) {
        //Contoh 1: Status kelulusan
        //Deklarasi Skor
        int score = 75;
        //TernaryOperator jika skor diatas 60
        String status = (score >= 60) ? "Lulus" : "Tidak Lulus";
        //Tampilkan Status Kelulusan
        System.out.println("=== Status Kelulusan ===");
        System.out.println("Nilai: " + score);
        System.out.println("Status: " + status);
        System.out.println();

        //Contoh 2: Bilangan genap/ganjil
        //Deklarasi Angka
        int number = 8;
        //TernaryOperator jika angka ganjil atau genap
        String parity = (number % 2 == 0) ? "Genap" : "Ganjil";
        //Tampilkan Pemeriksanaan bilangan
        System.out.println("=== Pemeriksaan Bilangan ===");
        System.out.println("Bilangan: " + number);
        System.out.println("Jenis: " + parity);
        System.out.println();

        //Contoh 3: Nilai maksimum
        //Deklarasikan angka a dan b
        int a = 15;
        int b = 20;
        //TernaryOperator untuk angka lebih besar
        int max = (a > b) ? a : b;
        //Tampilkan Nilai Maksimum
        System.out.println("=== Nilai Maksimum ===");
        System.out.println("Bilangan a: " + a);
        System.out.println("Bilangan b: " + b);
        System.out.println("Nilai maksimum: " + max);
        System.out.println();

        //Contoh 4: Inline dalam println
        //Deklarasi umur
        int age = 17;
        //Tampilkan Status Usia
        System.out.println("=== Status Usia ===");
        System.out.println("Usia: " + age);
        //TernaryOperator jika usia lebih dari 18
        System.out.println("Status: " + ((age >= 18) ? "Dewasa" : "Belum Dewasa"));
        }
}
