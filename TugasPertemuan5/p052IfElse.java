public class p052IfElse {
    public static void main(String[] args) {
        //Contoh 1: If-Else sederhana
        //Deklarasikan Skor 
        int score = 55;
        //Tampilkan Status Kelulusan
        System.out.println("=== Status Kelulusan ===");
        System.out.println("Nilai: " + score);
        //if else statement jika score diatas 60
        if (score >= 60) {
            System.out.println("Status: LULUS");
        } else {
            System.out.println("Status: TIDAK LULUS");
        }
        System.out.println();
        //Contoh 2: If-Else-If Ladder (Grading)
        //Deklarasikan Skor Angka dan Huruf
        int examScore = 78;
        char grade;
        //Tampilkan Sistem Penilaian 
        System.out.println("=== Sistem Penilaian ===");
        System.out.println("Nilai Ujian: " + examScore);
        //if else statement bercabang untuk skor lebih dari 85, 75, 65, 55, dan dibawahnya
        if (examScore >= 85) {
            grade = 'A';
            System.out.print("Grade: " + grade );
            System.out.println(" - Excellent!");
        } else if (examScore >= 75) {
            grade = 'B';
            System.out.print("Grade: " + grade );
            System.out.println(" - Very Good");
        } else if (examScore >= 65) {
            grade = 'C';
            System.out.print("Grade: " + grade );
            System.out.println(" - Good");
        } else if (examScore >= 55) {
            grade = 'D';
            System.out.print("Grade: " + grade );
            System.out.println(" - Satisfactory");
        } else {
            grade = 'E';
            System.out.print("Grade: " + grade );
            System.out.println(" - Needs Improvement");
        }
        System.out.println();
        //Contoh 3: Pemeriksaan bilangan
        //Deklarasi bilangan
        int number = 7;
        //Tampilkan Pemeriksaan Bilangan
        System.out.println("=== Pemeriksaan Bilangan ===");
        System.out.println("Bilangan: " + number);
        //if else statement apakah angka bilangan positif, negatif, atau nol
        if (number > 0) {
            System.out.println("Bilangan positif");
        } else if (number < 0) {
            System.out.println("Bilangan negatif");
        } else {
            System.out.println("Bilangan nol");
        }
    }
}
