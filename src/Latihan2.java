import java.util.Scanner;
public class Latihan2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = "";

        while (true) {
            System.out.println("=== MENU TEKS ANALYZER ===");
            System.out.println("1. Masukkan Teks");
            System.out.println("2. Hitung Jumlah Karakter");
            System.out.println("3. Hitung Jumlah Kata");
            System.out.println("4. Cari Kata dalam Teks");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Masukkan teks: ");
                    text = scanner.nextLine();
                }
                case 2 -> System.out.println("Jumlah karakter: " + text.length());
                case 3 -> {
                    String[] words = text.split("\\s+");
                    System.out.println("Jumlah kata: " + words.length);
                }
                case 4 -> {
                    System.out.print("Masukkan kata yang ingin dicari: ");
                    String searchWord = scanner.nextLine();
                    if (text.isEmpty()) {
                        System.out.println("Teks belum dimasukkan.");
                    } else {
                        String[] textWords = text.split("\\s+");
                        int count = 0;
                        for (String word : textWords) {
                            if (word.equalsIgnoreCase(searchWord)) {
                                count++;
                            }
                        }
                        if (count > 0) {
                            System.out.println("Kata \"" + searchWord + "\" ditemukan sebanyak " + count + " kali dalam teks.");
                        } else {
                            System.out.println("Kata \"" + searchWord + "\" tidak ditemukan dalam teks.");
                        }
                    }
                }
                case 5 -> {
                    System.out.println("Terima kasih telah menggunakan kalkulator ini");
                    scanner.close();
                    System.exit(0);
                }
                default -> System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
