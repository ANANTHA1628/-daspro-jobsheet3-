import java.util.Scanner;

public class siakad06 {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        
        String nama, nim;
        String kelas; 
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUTS,nilaiUAS,nilaiAkhir;

        System.out.print("masukkan nama: ");
        nama = input.nextLine();
        System.out.print("masukkan NIM: ");
        nim = input.nextLine();
        System.out.print("masukkan kelas: ");
        kelas = input.nextLine();
        System.out.print("Masukkan nomor absen: ");
        absen = input.nextByte();

        System.out.print("masukkan nilai kuis: ");
        nilaiKuis = input.nextDouble();
        System.out.print("masukkan nilai tugas: ");
        nilaiTugas = input.nextDouble();
        System.out.print("masukkan nilai uts: ");
        nilaiUTS = input.nextDouble();
        System.out.print("masukkan nilai UAS: ");
        nilaiUAS = input.nextDouble();

        nilaiAkhir = ((nilaiKuis * 0.2) + (nilaiTugas * 0.15) + (nilaiUTS * 0.3) + (nilaiUAS * 0.35)) / 4;
        
        System.out.println("Nama: " + nama + " NIM: " + nim);
        System.out.println("Kelas: " + kelas + " Absen: " +absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        input.close();
    }
}