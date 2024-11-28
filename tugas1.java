import java.util.Scanner;

tugas1c int deretDescendingRekursif (int n) {
    if (n == 0) {
        return 0;    

    } else {
        System.out.println(n + " ");
        return deretDescendingRekursif(n - 1);
    }
}
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("Masukkan angka: ");
int angka = input.nextInt();

System.out.println(deretDescendingRekursif(angka));
}