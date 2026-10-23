import java.util.Scanner;

public class Bilet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Yaşınızı giriniz: ");
        int yas = scanner.nextInt();

        System.out.print("Öğrenci misiniz? (e/h): ");
        char ogrenci = scanner.next().charAt(0);

        int biletFiyati = 0;

        if (yas <= 6) {
            biletFiyati = 0;
        } 
        else if (yas >= 65) {
            biletFiyati = 60; 
        } 
        else if (yas <= 17) {
            biletFiyati = 80; 
        } 
        else {
            if (ogrenci == 'e' ) {
                biletFiyati = 80; 
            } else {
                biletFiyati = 150; 
            }
        }
        System.out.println("Bilet: " + biletFiyati + " TL");

        scanner.close();
    }
}