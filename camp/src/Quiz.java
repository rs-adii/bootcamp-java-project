import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai Ujian Anda: ");
        int nilai = input.nextInt();
        System.out.println("Nilai Anda adalah" + nilai);
        if (nilai > 70) {
            System.out.println("Selamat, Anda Lulus Ujian");
        } else {
            System.out.println("Maaf, Anda Tidak Lulus Ujian");
        }
    }
}