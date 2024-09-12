    import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        
         double BONUS_PERSENTASE = 0.10;
         double PAJAK_PERSENTASE = 0.05;
   
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah jam kerja: ");
        double jamKerja = scanner.nextDouble();
        
        System.out.print("Masukkan upah per jam: ");
        double upahPerJam = scanner.nextDouble();
        
        double gajiSebelumPajak = jamKerja * upahPerJam;
        
        double bonus = gajiSebelumPajak * BONUS_PERSENTASE;
     
        double totalGajiDanBonusSebelumPajak = gajiSebelumPajak + bonus;

        double pajak = totalGajiDanBonusSebelumPajak * PAJAK_PERSENTASE;

        double gajiAkhir = totalGajiDanBonusSebelumPajak - pajak;
   
        System.out.printf("Gaji sebelum pajak: Rp %.2f\n", gajiSebelumPajak);
        System.out.printf("Bonus: Rp %.2f\n", bonus);
        System.out.printf("Total gaji dan bonus sebelum pajak: Rp %.2f\n", totalGajiDanBonusSebelumPajak);
        System.out.printf("Pajak: Rp %.2f\n", pajak);
        System.out.printf("Gaji akhir setelah pajak: Rp %.2f\n", gajiAkhir);
 
        scanner.close();
    }
}


