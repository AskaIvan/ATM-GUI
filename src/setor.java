
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MSI CORE I7-PC
 */
class setor {
    private int saldo;
    public void setoran(int bal, int s){
        if (s%100!=0)
            JOptionPane.showMessageDialog(null, "Maaf, tidak bisa menerima koin\nSilahkan ulangi kembali", "Transaksi Gagal",0);
        else if (s<50000)
            JOptionPane.showMessageDialog(null, "Besaran minimal setor tunai adalah Rp. 50.000","ERROR",0);
        else if (s>=50000){
            saldo = bal+s;
            JOptionPane.showMessageDialog(null, "Saldo Anda saat ini sebesar "+saldo);
                    }
    }
    public int getsaldo(){
        return saldo;
    }
}
