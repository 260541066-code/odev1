import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogru = 0;

        System.out.print("1. sorunun cevabını giriniz: ");
        String cevap1 = scanner.next();
        if (cevap1.equals("B")) {
            dogru++;
        }

        System.out.print("2. sorunun cevabını giriniz: ");
        String cevap2 = scanner.next();
        if (cevap2.equals("D")) {
            dogru++;
        }

        System.out.print("3. sorunun cevabını giriniz: ");
        String cevap3 = scanner.next();
        if (cevap3.equals("A")) {
            dogru++;
        }

        System.out.println("Dogru: " + dogru + " / 3");

        scanner.close();
    }
}