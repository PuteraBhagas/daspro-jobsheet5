import java.util.Scanner;

/**
 * PemilihanPeercobaan225
 */
public class PemilihanPeercobaan225 {

    public static void main(String[] args) {
        Scanner input25 = new Scanner(System.in);
        System.out.println("Nilai uas   : ");
        float uas = input25.nextFloat();
        System.out.println("Nilai uts   : ");
        float uts = input25.nextFloat();
        System.out.println("Nilai kuis  : ");
        float kuis = input25.nextFloat();
        System.out.println("Nilai tugas : ");
        float tugas = input25.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        String message = total < 65 ? "Remidi" : "Tidak remidi";

        System.out.println("Nilai akhir = " + total + " sehingga " + message);

        if (total > 80) {
            System.out.println("A \n sangat baik");
        } else if (total >= 80){
            System.out.println("B+ \n Lebih dari baik");
        } else if (total >=73 ) {
            System.out.println("B \n Baik");
        } else if (total >=65 ) {
            System.out.println("C= \n Lebih dari cukup");
        } else if (total >=60 ) {
            System.out.println("C \n Cukup");
        } else if (total >=50 ) {
            System.out.println("D \n Kurang");
        } else if (total >=39 ) {
            System.out.println("E \n Gagal"); 
        }

    }
}