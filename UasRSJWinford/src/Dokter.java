/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maghfira
 */
public class Dokter {
    private int no_kamar;
    private String nmdokter,nama_pasien;
    
    public Dokter(int no_kamar,String nama_pasien, String nmdokter){
        
        this.no_kamar= no_kamar;
        this.nama_pasien= nama_pasien;
        this.nmdokter= nmdokter;
    }
    

    public int getNoKamar() {
        return no_kamar;
    }

    public String getNmPasien() {
        return nama_pasien;
    }
    
//    public String read1(){
//        return "|  "+id_dokter+ "|\n";  
//    }

    public String getNmDokter() {
        return nmdokter;
    }
    
    
}
