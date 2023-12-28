import java.util.Scanner;

public class diskon {
    public static void main(String[] args) {

        int belanjaan, diskon, bayar;
        String kartu;
        Scanner Scan = new Scanner(System.in);
        System.out.println("apakah ada kartu member: ");
        kartu = Scan.nextLine();
        System.out.println("Total Belanjan: ");
        belanjaan = Scan.nextInt();
        //Diproses
        if (kartu.equalsIgnoreCase("ya/tidak")) {
            if (belanjaan > 500000) {
                diskon = 50000;
            } else if (belanjaan > 100000) {
                diskon = 15000;
            } else {
                diskon = 0 ;
            }
        } else {
            if (belanjaan > 100000) {
                diskon = 5000;
            } else {
                diskon = 0;
            }
    bayar =  belanjaan - diskon;
    System.out.println("Total belanjaan: Rp" + bayar);
    System.out.println("===Terima Kasih==="); }

    }

}
