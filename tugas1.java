import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
       
        int TARIF_PER_KWH = 1500;
        int BATAS_PENGGUNAAN = 500;
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Masukkan jumlah penggunaan listrik (kWh): ");
        int penggunaanListrik = scanner.nextInt();
        
      
        int totalTagihan = penggunaanListrik * TARIF_PER_KWH;
        
        
        boolean melebihiBatas = penggunaanListrik > BATAS_PENGGUNAAN;
        
        System.out.println("Total tagihan listrik: Rp " + totalTagihan);
        if (melebihiBatas) {
            System.out.println("Penggunaan listrik melebihi 500 kWh.");
        } else {
            System.out.println("Penggunaan listrik tidak melebihi 500 kWh.");
        }
        
        // Tutup scanner
        scanner.close();
    }
}




        
