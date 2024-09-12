import java.util.Scanner;

public class kafe06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        boolean keanggotaan;
        int jlmkopi,jmlTeh,jmlRoti;
        double hargaKopi = 12000.0,hargaTeh = 7000.0,hargaRoti =  20000.0,totalHarga,nominalBayar;
        float diskon = 10 / 100f;

        System.out.print("Masukkan keanggotaan (true/false): ");
        keanggotaan = input.nextBoolean();
        System.out.print("Masukkan jumlah pembelian kopi: ");
        jlmkopi = input.nextInt();
        System.out.print("Masukkan jumlah pembelian teh: ");
        jmlTeh = input.nextInt();
        System.out.print("Masukkan jumlah pembelian roti: ");
        jmlRoti = input.nextInt();

        totalHarga = (jlmkopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);
        nominalBayar = totalHarga - (diskon * totalHarga);

        System.out.println("keanggotaan pelanggan " + keanggotaan);
        System.out.println("Item pembelian " + jlmkopi + " kopi, " + jmlTeh + " teh, " + jmlRoti + " roti");
        System.out.println("Nominal bayar Rp " + nominalBayar);
    }
}
