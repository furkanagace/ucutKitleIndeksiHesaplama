import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.printf("***** Vücut Kitle İndeksi Hesaplama *****\n\n");

        double kilo,boy,index;

        Scanner input = new Scanner(System.in);

        System.out.printf(" Lütfen boyunuzu (metre cinsinde) giriniz : : ");
        boy=input.nextDouble();

        System.out.println(" Lütfen Kilonuzu Giriniz : ");
        kilo=input.nextDouble();

        index =kilo/(boy*boy);
        System.out.println("Kitle İndeks Sonucu : " + index);


    }
}