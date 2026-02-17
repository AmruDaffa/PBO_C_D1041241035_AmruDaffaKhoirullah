public class p041NamingConvention {
    //Deklarasi nilai PI yg tidak berubah-ubah  
    public static final double PI = 3.14;
    //Dideklarasikan di class 
    //Menggunakan Huruf Besar 
    public static void main(String[] args) {
        //contoh variabel camelcase 
        int studentAge = 20;
        String studentName = "Budi";
        boolean isStudentActive = true;
        //Keluarkan variabel yang sudah dibuat
        System.out.println("Nama         : " + studentName);
        System.out.println("Umur         : " + studentAge);
        System.out.println("Status       : " + isStudentActive);
        System.out.println("Konstanta PI : " + PI);
    }
}
