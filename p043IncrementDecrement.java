public class p043IncrementDecrement {
    public static void main(String[] args) {
        //Deklarasikan Nilai Awal
        int x = 5;
        //Tampilkan Nilai Awal
        System.out.println("Nilai awal x: " + x);
        //Increment nilai x
        x++;
        //Tampilkan Nilai setelah di Increment
        System.out.println("Setelah x++: " + x);
        //Decrement nilai x
        x--;
        //Tampilkan Nilai setelah di Decrement
        System.out.println("Setelah x--: " + x);
        //Compound Assignment += / -=
        x += 10;
        //Tampilkan Nilai x setelah Coumpund Assignment
        System.out.println("Setelah x += 10: " + x);
    }
}
