import java.util.Scanner;
public class farelUTS2 {
    public static void main(String[] args) {

        double gajiPokok;
        double tunjanganTP;
        double tunjanganMK;
        double gajiTahunan;
        double potonganKS;

        Scanner fs = new Scanner(System.in);

        System.out.println("Menu :");
        System.out.println("1. Hitung Gaji Perbulan.");
        System.out.println("2. Hitung Gaji Pertahun.");
        System.out.println("3. Hitung Potongan Kesehatan.");
        System.out.println("4. Keluar.");
        System.out.print("Masukkan Pilihan Anda :");
        int pilihan = fs.nextInt();


        switch (pilihan) {
            case 1 :

                System.out.print("Masukkan Gaji Pokok :");
                gajiPokok = fs.nextDouble();

                System.out.print("Masukkan Tunjangan Transportasi :");
                tunjanganTP = fs.nextDouble();

                System.out.print("Masukkan Tunjangan Makan :");
                tunjanganMK = fs.nextDouble();

                double gajiKaryawan;
                gajiKaryawan = (gajiPokok*0.9)+tunjanganTP+tunjanganMK;
                System.out.println("Gaji Karyawan :" + gajiKaryawan);

                if (gajiKaryawan < 5000000) {
                    System.out.println("Pendapatan Rendah.");
                } else if (gajiKaryawan <= 10000000) {
                    System.out.println ("Pendapatan Sedang.");
                } else if (gajiKaryawan > 10000000) {
                    System.out.println("Pendapatan Besar.");
                } else {
                    System.out.println("Input Tidak Valid.");
                }

                break;

            case 2 :

                System.out.println("Hitung Gaji Tahunan");
                gajiTahunan = gajiKaryawan*12;
                if (gajiKaryawan > 0) {
                    System.out.println("Total Gaji Tahunan : " + gajiTahunan);
                } else {
                    System.out.println("Data Gaji Belum Tersedia.");
                }

                
                break;
            
            case 3 :

                System.out.println("Masukkan Gaji Pokok : ");
                gajiPokok = fs.nextDouble();
                potonganKS = gajiPokok*0.1*12;
                System.out.println("Total Potongan Kesehatan Setahun : " + potonganKS);


            case 4 :

                System.out.println("Anda Keluar.");
                
                break;

            default:
                System.out.println("Input Tidak Valid");
                System.out.print("Ingin Mengulang Program?");
                String confirm = fs.nextLine();
                if (confirm.toLowerCase().equals("ya")) {
                    break;
                } else {
                    System.out.println("Program Telah Berakhir.");
                }
}
}
}