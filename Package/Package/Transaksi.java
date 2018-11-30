/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Package;

import java.util.ArrayList;

/**
 *
 * @author Expression daffa is undefined on line 12, column 14 in Templates/Classes/Class.java.
 */
public class Transaksi {
    private String kode;
    private ArrayList<ItemArray> item = new ArrayList();
    
    private float total;
    
    public Transaksi(){
        this.kode = null;
    }

    public Transaksi(String kode, float total) {
        this.kode = kode;
        this.total = total;
    }

    Transaksi(String kode, ArrayList<ItemArray> pembelian) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void hitungTotal(){
        float total = 0;
        for (ItemArray item : this.item) {
            total += item.total();
        }
        this.total = total;
    }
    
    public String Pembayaran(){
        hitungTotal();
        String ss = "";
        ss += "Kode\t\t : " + this.kode + "\n";
        ss += "Daftar belanja : \n";
        for (ItemArray item : this.item) {
            ss += "\t" + item.getNama()+ "(" + item.getJumlah() + ")" + item.getJumlah() + "\n";
        }
        ss += "Total \t\t : " + this.total;
        return ss;
    }
}
