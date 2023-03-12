import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        line();
        System.out.println(" >> APLIKASI PENGHITUNG LUAS BANGUN DATAR <<");
        line();

        String[] Menu = {"Hitung Luas Bangun Datar Persegi", "Hitung Luas Bangun Datar Persegi Panjang", "Hitung Luas Bangun Datar Jajar Genjang", "Hitung Luas Bangun Datar Segitiga", "Hitung Luas Bangun Datar Lingkaran", "Keluar"};

        int number = 1;

        for (String menu : Menu) {
            System.out.println("(" + number + ") " + menu);
            number++;
        }

        System.out.print(" >  Pilihan (n): ");
        int pilihan = input.nextInt() - 1;

        line();
        System.out.println("Pilihan anda : " + Menu[pilihan]);
        line();
    }

    public static void line() {
        System.out.println("--------------------------------------------");
    }
}