/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maghfira
 */
public class Pasien {
    private int id_pasien;
    private String nama;
    private String asal;
    private String penyakit;
    Pasien next;
    Pasien prev;
    
    public Pasien(int id_pasien, String nama, String asal, String penyakit){
        this.id_pasien = id_pasien;
        this.nama = nama;
        this.asal = asal;
        this.penyakit=penyakit;
    }
    
    public Pasien(){
        this.id_pasien = id_pasien;
        this.nama = nama;
        this.asal = asal;
        this.penyakit=penyakit;
    }  

    public int getIdPasien(){
        return id_pasien;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getAsal() {
        return asal;
    }

    public String getPenyakit() {
        return penyakit;
    }

    public String read(){
        return "|  "+id_pasien+"\t| "+nama+"\t| "+asal+"\t| "+penyakit+"\t|" + "\n";  
    }
}
