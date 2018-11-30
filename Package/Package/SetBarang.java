/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Package;
import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author Expression daffa is undefined on line 12, column 14 in Templates/Classes/Class.java.
 */
public class SetBarang {
    private HashMap<String, Float> item = new HashMap<>();

    public SetBarang() {
        this.item.put("gula", new Float (20000));
        this.item.put("kopi", new Float (5000));
        this.item.put("susu", new Float (10000));
        
    }
    
    public ArrayList<String> getNamaItem(){
        ArrayList<String> aa = new ArrayList<>();
        for (String item : this.item.keySet()) {
            aa.add(item);
        }
        return aa;
    }
    
    public ArrayList <Float> getHargaBarang(){
        ArrayList<Float> bb = new ArrayList<>();
        for (Float item : this.item.values()) {
            bb.add(item);
        }
        return bb;
    }
    
    public void addItem(String nama, float harga){
        this.item.put(nama, harga);
    }
}
