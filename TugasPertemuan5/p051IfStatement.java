public class p051IfStatement {
    public static void main(String[] args) {
        //Contoh Pertama
        //Deklarasi Umur
        int age = 25;
        //Tampilkan Pemeriksaan Usia
        System.out.println("=== Pemeriksaan Usia ===");
        System.out.println("Usia: " + age);
        //If statement jika umur diatas 18
        if (age >= 18){
            System.out.println("Anda sudah dewasa");
            System.out.println("Anda dapat memilih dalam pemilu");
        }
        System.out.println();
        //Contoh Kedua
        //Deklarasi Skor
        int score = 75;
        //Tampilkan Pemeriksaan Nilai
        System.out.println("=== Pemeriksaan Nilai ===");
        System.out.println("Nilai: " + score);
        //if statement jika skor diatas 60
        if (score >= 60) {
            System.out.println("Selamat! Anda LULUS");
        }
        System.out.println();
        //Contoh Ketiga
        //Deklarasi Suhu
        int temperature = 35;
        //Tampilkan Pemeriksaan Suhu
        System.out.println("=== Pemeriksaan Suhu ===");
        System.out.println("Suhu: " + temperature + "°C");
        //if statement jika suhu diatas 30
        if (temperature > 30) {
            System.out.println("Cuaca panas");
            System.out.println("Disarankan gunakan AC");
        }
    }
}
