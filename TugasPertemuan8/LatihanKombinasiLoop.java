public class LatihanKombinasiLoop {
    public static void main(String[] args) {
        boolean isfound = false;
        System.out.println("=== PENCARIAN KOORDINAT [2,3] ===");
        for (int i = 1; i<= 3; i++){
            for (int j = 1; j <= 5; j++){
                System.out.println("Cek: [" + i + "," + j + "]");
                if (i == 2 && j == 3){
                    System.out.println("Koordinat ditemukan!");
                    isfound = true;
                    break;
                }
            }
            if(isfound){
                break;
            }
        }
        System.out.println("Pencarian selesai");
    }
}
