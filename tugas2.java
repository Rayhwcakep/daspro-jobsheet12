import java.util.Scanner;

public class tugas2 {
    
    static int penjumlahanRekursi(int n) {
        if (n == 0) {
            return 0;
        }else {
            return n + penjumlahanRekursi(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan angka: ");
        int angka = input.nextInt();

        System.out.println(penjumlahanRekursi(angka));
    }
}
