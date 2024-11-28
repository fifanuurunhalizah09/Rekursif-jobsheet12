import java.util.Scanner;

public class Tugas3 {
    static int hitungPasangan(int bulan) {
        if (bulan == 1 || bulan == 2) {
            return 1;  
        } else {
            return hitungPasangan(bulan - 1) + hitungPasangan(bulan - 2);  
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bulan ke-: ");
        int bulan = sc.nextInt();
        
        int totalPasangan = hitungPasangan(bulan);
        System.out.println("Jumlah total pasangan marmut pada bulan ke-" + bulan + " adalah: " + totalPasangan);
    }
}
