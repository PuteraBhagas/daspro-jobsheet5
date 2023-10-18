import java.util.Scanner;

/**
 * PemilihanPercobaan125
 */
public class PemilihanPercobaan125 {

    public static void main(String[] args) {
        Scanner input25= new Scanner(System.in);
        System.out.print("Masukan angka:  ");
        int angka = input25.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Angka "+angka+" bilangan genap");
            
        } else {
            System.out.println("Angka "+angka+" bilangan ganjil");
            
        }
    }
}