package pertemuan3;

import javax.swing.JOptionPane;

public class Pertemuan3 {

    public static void main(String[] args) {
        int naw = 0;
        naw = Integer.parseInt(JOptionPane.showInputDialog("Input Nilai Awal"));        
        int awal = naw;
        int akhir = 10;
        akhir = Integer.parseInt(JOptionPane.showInputDialog("Input Nilai Akhir"));  

        System.out.println("Perulangan While");
        while (awal < akhir) {
            System.out.println("Perulangan ke-" + awal);
            awal++;
        }

        System.out.println("Perulangan Do While");
        awal = naw;
        do {
            System.out.println("Perulangan ke-" + awal);
            awal++;
        } while (awal < akhir);

        System.out.println("Perulangan For");
        for (awal = naw; awal < akhir; awal++) {
            System.out.println("Perulangan ke-" + awal);
        }
    }
}
