public class LatihDataMahasiswa {
    public static void main(String[] args) {
        //Deklarasi NIM dengan long 
        long nimMahasiswa = 1041241035;
        //Deklarasi Nama dengan String 
        String namaMahasiswa = "Amru Daffa Khoirulllah";
        //Deklarasi Nama dengan String 
        char kelasMahasiswa = 'A';
        //Deklarasi Kelas dengan Char 
        boolean isActive = true;
        //Deklarasi IPK dengan Double 
        double ipkMahasiswa = 3.94;
        //Deklarasi SKS dengan int 
        int sksMahasiswa = 66;
        // Menampilkan Data Mahasiswa
        System.out.println("=== DATA MAHASISWA ===");
        System.out.println("NIM             : D" + nimMahasiswa);
        System.out.println("Nama            : " + namaMahasiswa);
        System.out.println("Kelas           : " + kelasMahasiswa);
        System.out.println("Status Aktif    : " + isActive);
        System.out.println("IPK Semester    : " + ipkMahasiswa );
        System.out.println("Total SKS       : " + sksMahasiswa );
    }
}
