import java.util.Scanner;
public class Taksi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Km girin: ");
        double km = scanner.nextDouble();
         System.out.print("Saat girin: ");
        int saat = scanner.nextInt();
       
        double ucret = (km * 20)+30;

        if (saat <= 5) {
            ucret= ucret * 1.5; 
        }

        System.out.printf("Ucret: %.2f", ucret);
    }
}
