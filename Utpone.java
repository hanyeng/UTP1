import java.util.*;

public class Utpone {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        //masukkan jumlah orangnya
        int jumlahsiswa = input.nextInt();
        input.nextLine();
        String[] nama = new String [jumlahsiswa];
        int [] totalhuruf = new int [jumlahsiswa];
        String [] bagian = new String [jumlahsiswa];
        String [] inisial = new String [jumlahsiswa];
        String [] awalan = new String [jumlahsiswa];
        String [] buildernamepaper = new String [jumlahsiswa];
        String [] namaFinal = new String [jumlahsiswa];
        
        for (int i = 0; i < jumlahsiswa; i++) {
            System.out.print("Nama ke-" + (i + 1) + ": ");
            // read full line so names with spaces (e.g. "Budi Santoso") are accepted
            String line = input.nextLine().trim();
            if (line.isEmpty()) {
                // repeat this index if user entered an empty name
                System.out.println("Nama tidak boleh kosong. Silakan masukkan lagi.");
                i--; 
                continue;
            }
            nama[i] = line;
        }
        

        
       System.out.println("Inisial dari setiap nama");
       for (int i = 0; i < jumlahsiswa; i++) {
           if (nama[i] != null && nama[i].length() > 0) {
               inisial[i] = String.valueOf(nama[i].charAt(0));
           } else {
               inisial[i] = ""; // empty initial for missing name
           }
           System.out.println("Nama ke-" + (i + 1) + " (" + nama[i] + "): " + inisial[i]);
       }
      //maaf saya tidak kuat,tidak dapat mencernaa..
    }
}

