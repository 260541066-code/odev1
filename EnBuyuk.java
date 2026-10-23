import java.util.Scanner;
public class EnBuyuk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("İlk sayıyı girin: ");
        int sayi1 = scanner.nextInt();
        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = scanner.nextInt();
        System.out.print("Üçüncü sayıyı girin: ");
        int sayi3 = scanner.nextInt();

        if (sayi1 >= sayi2 && sayi1 >= sayi3) {
            System.out.println("En büyük : " + sayi1);
        } else if (sayi2 >= sayi1 && sayi2 >= sayi3) {
            System.out.println("En büyük : " + sayi2);
        } else {
            System.out.println("En büyük : " + sayi3);
        }
    }
}
