/*
 * Ad Soyad: Yiğit Alper Ayhan
 * Öğrenci No: 250542014
 * Tarih: 06.11.2025
 * Açıklama: Maaş Hesaplayıcı
 */
import java.util.Scanner;

public class MaasHesap {
public static void main(String[] args) {

    final double SGK_ORANI = 0.14;
    final double GELIR_VERGISI_ORANI = 0.15;
    final double DAMGA_VERGISI_ORANI = 0.00759;

    Scanner input = new Scanner(System.in);

    // Kullanıcıdan verileri alma
    System.out.print("Çalışan adı soyadı: ");
    String adSoyad = input.nextLine();

    System.out.print("Aylık brüt maaş (TL): ");
    double brutMaas = input.nextDouble();

    System.out.print("Haftalık çalışma saati: ");
    int haftalikSaat = input.nextInt();

    System.out.print("Mesai saati sayısı: ");
    int mesaiSaati = input.nextInt();

    // Gelirler
    double mesaiUcreti = (brutMaas / 160) * mesaiSaati * 1.5;
    double toplamGelir = brutMaas + mesaiUcreti;

    // Kesintiler
    double sgk = toplamGelir * SGK_ORANI;
    double gelirVergisi = toplamGelir * GELIR_VERGISI_ORANI;
    double damgaVergisi = toplamGelir * DAMGA_VERGISI_ORANI;
    double toplamKesinti = sgk + gelirVergisi + damgaVergisi;

    // Net Maaş
    double netMaas = toplamGelir - toplamKesinti;

    // İstatistikler
    double kesintiOrani = (toplamKesinti / toplamGelir) * 100;
    double saatlikNetKazanc = netMaas / 176;
    double gunlukNetKazanc = netMaas / 22;

    // Profesyonel bordro çıktısı
    System.out.println("\n================= MAAŞ BORDROSU =================");
    System.out.println("Çalışan: " + adSoyad);
    System.out.println("------------------------------------------------");
    System.out.println("Brüt Maaş:              " + brutMaas + " TL");
    System.out.println("Mesai Ücreti:           " + mesaiUcreti + " TL");
    System.out.println("------------------------------------------------");
    System.out.println("Toplam Gelir:           " + toplamGelir + " TL");
    System.out.println("------------------------------------------------");
    System.out.println("SGK (%14):              " + sgk + " TL");
    System.out.println("Gelir Vergisi (%15):    " + gelirVergisi + " TL");
    System.out.println("Damga Vergisi (%0.759): " + damgaVergisi + " TL");
    System.out.println("------------------------------------------------");
    System.out.println("Toplam Kesinti:         " + toplamKesinti + " TL");
    System.out.println("================================================");
    System.out.println("Net Maaş:               " + netMaas + " TL");
    System.out.println("------------------------------------------------");
    System.out.println("Kesinti Oranı:          " + kesintiOrani + " %");
    System.out.println("Saatlik Net Kazanç:     " + saatlikNetKazanc + " TL/saat");
    System.out.println("Günlük Net Kazanç:      " + gunlukNetKazanc + " TL/gün");
    System.out.println("================================================");

    input.close();
  }
}

