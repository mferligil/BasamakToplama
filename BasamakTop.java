import java.util.Scanner;

public class BasamakTop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Sayı Giriniz :");

        int sayi = input.nextInt();
        int toplam = 0;

        while (sayi != 0) {
            toplam += sayi % 10;
            sayi=sayi/10;
        }
        System.out.println("Yazdığınız sayının basamakları toplamı="+toplam);
    }
}
