/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Package;

/**
 *
 * @author Expression daffa is undefined on line 12, column 14 in Templates/Classes/Class.java.
 */
public class TblTransaksi {
    private String[] kolom;

    public TblTransaksi() {
        this.kolom = new String[]{
        "nama", "harga", "jumlah"
        };
    }
    
    public String[] getKolomNama(){
        return this.kolom;
    }
    
    
}
