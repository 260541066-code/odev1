import java.util.Scanner;
public class NotHarfi2 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Notunuzu girin: ");
     int not = scanner.nextInt();
     if (not<=100) {
         if (not>=90) {
             System.out.println("Harf: A");
         }
         else if (not>=80) {
             System.out.println("Harf: B");  
         }
          else if (not>=70) {
             System.out.println("Harf: C");  
         }
          else if (not>=60) {
             System.out.println("Harf: D");  
         }
         else if (not>0){
             System.out.println("Harf: F");
         }
         else{
            System.out.println("Gecersiz puan"); 
         }
     }
     else{
        System.out.println("Gecersiz puan");
     }
 }
}