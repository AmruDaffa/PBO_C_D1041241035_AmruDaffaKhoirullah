public class p042OperatorAritmatika {
    public static void main(String[] args) {
        //Deklarasikan variabel a dan b
        int a = 10;
        int b = 3;
        //Tampilkan nilai A dan b Awal
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        //Beri Spasi
        System.out.println();
        //Tampilkan penambahan A dan B
        System.out.println("a + b = " + (a + b));
        //Tampilkan pengurangan A dan B
        System.out.println("a - b = " + (a - b));
        //Tampilkan Perkalian A dan B
        System.out.println("a * b = " + (a * b));
        //Tampilkan Pembagian A dan B
        System.out.println("a / b = " + (a / b));
        //Tampilkan A Modulus B
        System.out.println("a % b = " + (a % b));
        // Pembagian dengan desimal
        double hasil = (double) a / b;
        // Tampilkan Pembagian a dan b dengan nilai desimal
        System.out.println("a / b (desimal) = " + hasil);
    }
}
