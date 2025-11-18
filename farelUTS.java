import java.util.Scanner;
public class farelUTS {
    public static void main(String[] args) {

        double gajiPokok;
        double tunjanganTP;
        double tunjanganMK;
        double gajiKaryawan;

        Scanner fs = new Scanner(System.in);

        System.out.print("Masukkan Gaji Pokok :");
        gajiPokok = fs.nextDouble();

        System.out.print("Masukkan Tunjangan Transportasi :");
        tunjanganTP = fs.nextDouble();

        System.out.print("Masukkan Tunjangan Makan :");
        tunjanganMK = fs.nextDouble();

        gajiKaryawan = gajiPokok*0.9+tunjanganTP+tunjanganMK;
        System.out.println("Gaji Karyawan :" + gajiKaryawan);
        fs.close();
        
    }
}