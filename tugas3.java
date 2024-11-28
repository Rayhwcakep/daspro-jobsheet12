import java.util.Scanner;
public class tugas3 {
    static int fibonacci (int bulan) {
        if (bulan == 1 || bulan == 2) {
            return 1;
        }else{
            return fibonacci(bulan - 1) + fibonacci(bulan - 2);
        }
    }
    public static void main(String[] args) {
    int bulan = 12;
    int pasanganMarmur = fibonacci(bulan);
    System.out.println("jumlah pasangan marmut pada bulan ke- " + bulan + " adalah " + pasanganMarmur);
    }
}
