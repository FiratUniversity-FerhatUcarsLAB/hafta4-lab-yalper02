/*
 * Ad Soyad: Yiğit Alper Ayhan
 * Öğrenci No: 250542014
 * Tarih: 04.11.2025
 * Açıklama: Geometrik Hesaplayıcı 
 */
import java.util.Scanner;

public class GeometrikHesap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.14159;

        System.out.println("===GEOMETRİK HESAPLAYICI===");
        System.out.print("Yarıçapı girin: ");
        double r = scanner.nextDouble();

        // Hesaplamalar
        double DaireAlanı = PI * r * r;
        double DaireCevresi = 2 * PI * r ;
        double DaireCap = 2 * r;
        double KüreHacmi = (4.0/3.0) * PI * Math.pow(r, 3);
        double KüreYüzeyAlanı = 4 * PI * r * r;

        // Düzenli hizalanmış çıktı
        System.out.println("SONUCLAR:");
        System.out.println("----------");
        System.out.println("Daire Alanı: " + DaireAlanı);
        System.out.println("Daire Alanı: " + DaireAlanı);
        System.out.println("Daire Çevresi: " + DaireCevresi);
        System.out.println("Daire Çapı: " + DaireCap);
        System.out.println("Küre Hacmi: " + KüreHacmi);
        System.out.printf("Kürenin Yüzey Alanı: " + KüreYüzeyAlanı);

        scanner.close();
    }
}

