import java.util.Scanner;

public class percobaan3 {
    
    static double hitungLaba(double saldo, int tahun) {
        if (tahun ==0) {
            return (saldo);
        }else {
            return (1.11 * hitungLaba(saldo, tahun-1));
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int saldoAwal, tahun;
        System.out.println("JUmlah saldo awal: ");
        saldoAwal = input.nextInt();
        System.out.println("lamanya investasi (tahun):  ");
        tahun = input.nextInt();

        System.out.println("jumlah saldo setelah " + tahun + " tahun: ");
        System.out.println(hitungLaba(saldoAwal, tahun));
    }
}
