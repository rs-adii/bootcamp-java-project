import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        Scanner inputUsia = new Scanner(System.in);
        System.out.println("berapa usia anda?: ");
        int Usia = inputUsia.nextInt();
        // Scanner elseNumber = new Scanner(System.in);
        // String selainNomer =elseNumber.next("data tidak valid: ");
        if (Usia <= 12) {
            System.out.println("Rekomendasi buku: Buku cerita");
        } else if (Usia >= 13 && Usia <= 17) {
            System.out.println("Rekomendasi buku: Buku petualangan");
        } else if(Usia >=18) {
            System.out.println("Rekomendasi buku: Buku non fiksi");
        } else {
            System.out.println("data tidak valid");
        }

        }
    }
