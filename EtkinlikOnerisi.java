import java.util.Scanner;

public class EtkinlikOnerisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen sıcaklığı girin (°C): ");
        int sicaklik = scanner.nextInt();

        if (sicaklik < 5) {
            System.out.println("Etkinlik Önerisi: Kayak yapabilirsiniz.");
        } else if (sicaklik >= 5 && sicaklik < 15) {
            System.out.println("Etkinlik Önerisi: Sinemaya gidebilirsiniz.");
        } else if (sicaklik >= 15 && sicaklik < 25) {
            System.out.println("Etkinlik Önerisi: Piknik yapabilirsiniz.");
        } else { // sicaklik >= 25
            System.out.println("Etkinlik Önerisi: Yüzmeye gidebilirsiniz.");
        }

        scanner.close();
    }
}
