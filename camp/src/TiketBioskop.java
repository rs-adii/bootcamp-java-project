import java.util.Scanner;

public class TiketBioskop {
    public static void main(String[] args) {
        Scanner weekEnd = new Scanner(System.in);
        System.out.println("Apakah hari ini weekend? (true/false)");
        boolean isWeekend = weekEnd.nextBoolean();
        Scanner inputUsia = new Scanner(System.in);
        int usia = inputUsia.nextInt();
        if (usia < 13) {
          if (isWeekend) {
System.out.println("Harga tiket Rp.25.000");
          } else {
            System.out.println();
          }
        }

    }
}
