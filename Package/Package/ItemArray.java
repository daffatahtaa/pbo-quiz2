/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Package;

import java.util.ArrayList;
import java.util.List;
import Package.Home;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 *
 * @author Expression daffa is undefined on line 12, column 14 in Templates/Classes/Class.java.
 */
public class ItemArray{

    
    
    //ArrayList<String> item = new ArrayList<String>();
    
    private String nama;
    private float jumlah;
    private float harga;
    
    static void add(String item) {
        
    }

    public ItemArray(String nama, float jumlah, float harga) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJumlah() {
        return (int) jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public float getHarga() {
        return harga;
    }

    public void setHarga(float harga) {
        this.harga = harga;
    }
    
    public float total(){
        return this.harga * this.jumlah;
    }
    
    public String toString(){
        return this.nama;
    }

    
    
    
}
