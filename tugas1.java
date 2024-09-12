import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
       
        int TARIF_PER_KWH = 1500;
        int BATAS_PENGGUNAAN = 500;
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Masukkan jumlah penggunaan listrik (kWh): ");
        int penggunaanListrik = input.nextInt();
        
      
        int totalTagihan = penggunaanListrik * TARIF_PER_KWH;
        
        
        boolean melebihiBatas = penggunaanListrik > BATAS_PENGGUNAAN;
        
        System.out.println("Total tagihan listrik: Rp " + totalTagihan);
        System.out.println("melebihiBatas (true/false) " + melebihiBatas);
        
        }
        
        
    }





        
