import java.util.Scanner;
public class Latihan1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean berjalan = true;

        while (berjalan) {


            System.out.println("=== Calculator ===");
            System.out.println("1. Akar Kuadrat");
            System.out.println("2. Pangkat");
            System.out.println("3. Logaritma");
            System.out.println("4. Factorial");
            System.out.println("5. Keluar");
            System.out.print("Pilih Operasi (1/2/3/4/5): ");
            int pilihan = scanner.nextInt();
            System.out.print("Masukkan angka: ");
            double angka = scanner.nextDouble();

            switch (pilihan) {
                case 1 -> {
                    double akarKuadrat = Math.sqrt(angka);
                    System.out.println("Hasil kuadrat dari " + angka + " adalah: " + akarKuadrat);
                }
                case 2 -> {
                    System.out.print("Masukkan pangkat: ");
                    int pangkat = scanner.nextInt();
                    double hasilPangkat = Math.pow(angka, pangkat);
                    System.out.println(angka + " pangkat " + pangkat + " adalah: " + hasilPangkat);
                }
                case 3 -> {
                    double logNatural = Math.log(angka);
                    System.out.println("Logaritma natural dari " + angka + " adalah: " + logNatural);
                }
                case 4 -> {
                    int faktorial = 1;
                    for (int i = 1; i <= angka; i++) {
                        faktorial *= i;
                    }
                    System.out.println("Factorial dari " + angka + " adalah: " + faktorial);
                }
                case 5 -> {
                    berjalan = false;
                    System.out.println("Keluar dari kalkulator.");
                }
                default -> System.out.println("Pilihan tidak valid");
            }
        }

        scanner.close();
    }
}