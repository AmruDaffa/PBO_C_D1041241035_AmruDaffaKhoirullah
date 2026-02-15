public class LatihanCounter {
    public static void main(String[] args) {
        //Deklarasi Counter
        int counter = 10;
        //Tampilkan Counter
        System.out.println("=== COUNTER ===");
        System.out.println("Nilai awal          : " + counter);
        //Increment 2x
        counter++;
        counter++;
        //Tampilkan Hasil setelah Increment 2x
        System.out.println("Setelah ++  (2x)    : " + counter);
        //Decrement 1x
        counter--; 
        //Tampilkan Hasil setelah Decrement 1x
        System.out.println("Setelah --          : " + counter);
        //Coumpund Assignment +5
        counter += 5;
        //Tampilkan Hasil setelah +5
        System.out.println("Setelah += 5        : " + counter);
        //Coumpund Assignment -3
        counter -= 3;
        //Tampilkan Hasil setelah -3
        System.out.println("Setelah -= 3        : " + counter);
        //Coumpund Assignment *2
        counter *= 2;
        //Tampilkan Hasil setelah *2
        System.out.println("Setelah *= 2        : " + counter);
    }
}
