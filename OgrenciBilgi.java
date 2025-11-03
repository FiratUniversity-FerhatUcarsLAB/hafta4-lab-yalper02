/*
 * Ad Soyad: Yiğit Alper Ayhan
 * Öğrenci No: 250542014
 * Tarih: 03.11.2025
 * Açıklama: Öğrenci Bilgi Sistemi
 */
import java.util.Locale;
import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Bilgileri al
        System.out.print("Adınızı girin: ");
        String ad = input.next();

        System.out.print("Soyadınızı girin: ");
        String soyad = input.next();

        System.out.print("Öğrenci Numaranızı girin: ");
        int numara = input.nextInt();

        System.out.print("Yaşınızı girin: ");
        int yas = input.nextInt();
        input.nextLine();

        System.out.print("GPA (0.00 - 4.00): ");
        String gpaStr = input.nextLine();
        double gpa = Double.parseDouble(gpaStr);

        // Bilgileri düzenli şekilde yazdır
        System.out.println("\n--- Öğrenci Bilgileri ---");
        System.out.println("Ad: " + ad);
        System.out.println("Soyad: " + soyad);
        System.out.println("Öğrenci No: " + numara);
        System.out.println("Yaş: " + yas);
        System.out.printf(Locale.US,"GPA: %.2f\n", gpa);

        input.close();
    }
}
