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
public class ItemArray {
    
    ArrayList<String> al = new ArrayList<>();
    private String nama;
    private int harga;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public ItemArray(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public ItemArray() {
    }
    
    @Override
    public String toString(){
        return nama;
    }
}
