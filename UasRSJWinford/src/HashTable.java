/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maghfira
 */
public class HashTable {
    public Dokter[] hashArray;
    public int size;

    public HashTable(int size) { 
        this.size = size;
        hashArray = new Dokter[size];
    }

    public Dokter displayTable() { 
        System.out.println("Table: ");
        for (int j = 1; j < size; j++) {
            if (hashArray[j] != null) { 
                System.out.println(" | "+j+"\t | Kamar : " +hashArray[j].getNoKamar()+ " , "+hashArray[j].getNmPasien() + " , "+hashArray[j].getNmDokter()+" |");
                // return hashArray[j];+hashArray[j].getIdPasien() + " , "+
            } else {
                System.out.println(" | "+j+"\t | -- |");
            }
        }
        System.out.println("");
        return null;
    }

    
    public Dokter getAll(int id_pasien){
        return hashArray[id_pasien];
    }
    
    public int hashFunc(int key) {
        return key % size;
    }

    public void insert(int no_kamar,String nama_pasien, String nmdokter) { 
        Dokter item= new Dokter(no_kamar,nama_pasien,nmdokter); 
        int key = item.getNoKamar();
        int hashVal = hashFunc(key);
        while (hashArray[hashVal] != null) {
            ++hashVal; 
            hashVal %= size;
        }
        hashArray[hashVal] = item;
    }

    public Dokter delete(int key) { 
        int hashVal = hashFunc(key);
        while (hashArray[hashVal] != null) { 
            if (hashArray[hashVal].getNoKamar() == key) {
                Dokter temp = hashArray[hashVal];
                hashArray[hashVal] = null;
                return temp;
            }
            ++hashVal; 
            hashVal %= size;
        }
        return null;
    }

    public Dokter find(int key) {
        int hashVal = hashFunc(key);

        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].getNoKamar()== key) { 
                return hashArray[hashVal];
            }
            ++hashVal; 
            hashVal %= size;
        }
        
        return null;
    }
    
    public String getnmDokter(int key){
        int hashVal = hashFunc(key);
         while (hashArray != null) {
            if (hashArray[hashVal].getNoKamar()== key) { 
                return hashArray[hashVal].getNmDokter();
            }
            ++hashVal; 
            hashVal %= size;
        }
         return null;
    }

    
}
