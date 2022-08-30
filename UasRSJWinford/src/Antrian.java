/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maghfira & Firyal
 */
public class Antrian {
    Pasien head;
    Pasien tail;
    private int nElemen ;
    private Pasien[] psn;
    
    public Antrian(){
        head = tail = null;
    }
    
    public void enqueue(int id_pasien, String nama, String asal, String penyakit) {
        Pasien pasien = new Pasien(id_pasien, nama, asal, penyakit);
        //pasien.input();
        if (head == null & tail == null) {
            head = tail = pasien;
        } else {
            tail.next = pasien;
            pasien.prev = tail;
            tail = pasien;
        }
    }
    
    public String dequeue() {
        if (head == null) {
            return "- Kosong -";
        } else {
            String isiHead = "Keluar Data Dengan Id Pasien: " + head.getIdPasien();
            if (head.next != null) {
                head = head.next;
                System.out.println("");
            } else {
                head = null;
            }
            return isiHead;
        }
    }
     
//    public void insert(int id_pasien, String nama, String asal, String penyakit){
//        psn[nElemen] = new Pasien(id_pasien,nama, asal, penyakit);
//        nElemen++;
//    }


    public void deleteAll(){
        head=null;
    }
    
    public String view(){
        String isiTextArea;
        if(head!=null){
            isiTextArea = "\t\t===== Tabel Kamar Pasien =====\n" + 
                        "+-------------------+--------------------+-------------------+-------------------------------------+\n"
                        + "| ID Pasien\t| Nama Pasien | Alamat \t| Penyakit\t\t|\n" + 
                        "+-------------------+--------------------+-------------------+-------------------------------------+\n";
            for (Pasien a = head; a != null; a = a.next) {
                System.out.println("");
                isiTextArea = isiTextArea + a.read();
            }
        } else {
            isiTextArea = "- Kosong -";
        }
        return isiTextArea;
    }
}
