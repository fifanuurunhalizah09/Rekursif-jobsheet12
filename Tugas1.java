import java.util.Scanner;

public class Tugas1 {
    static void deretRekursif(int n) {
        if (n < 0) {
            return; 
        }
        System.out.print(n + " "); 
        deretRekursif(n - 1); 
    }
    static void deretIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " "); 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        System.out.println("\nDeret Descending menggunakan Rekursif:");
        deretRekursif(n);

        System.out.println("\n\nDeret Descending menggunakan Iteratif:");
        deretIteratif(n);
    }
}
