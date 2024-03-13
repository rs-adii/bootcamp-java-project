import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Massukan Nilai Ujian");
        int nilai = input.nextInt();
        System.out.println("Nilai Anda adalah" + nilai);
       if (nilai > 100) {
        System.out.println("Nilai tidak valid!");
       }
        else if (nilai == 100) {
            System.out.println("Nilai A+");
        } else if (nilai >= 90) {
       } else if (nilai >= 80) {
            System.out.println("Nilai B");
        } else if (nilai >= 60) {
            System.out.println("Nilai C");
        } else if (nilai <= 50) {
            System.out.println("Nilai D");
        } else if (nilai < 50) {
            System.out.println("Nilai E");
        } else {
            System.out.println("Nilai tidak valid!")
        }
    }
}
