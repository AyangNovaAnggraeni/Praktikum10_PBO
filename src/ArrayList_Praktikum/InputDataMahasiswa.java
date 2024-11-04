
package ArrayList_Praktikum;

import java.util.ArrayList;

public class InputDataMahasiswa {
    ArrayList<Mahasiswa>listmahasiswa;
    
    public InputDataMahasiswa(){
        listmahasiswa = new ArrayList();
    }
    
    public void insertData(String NIM, String Nama, String Alamat, String MataKuliah, double Nilai1, double Nilai2, double Nilai3, double Nilai4, double Nilai5){
     Mahasiswa mhs = new Mahasiswa(NIM, Nama, Alamat, MataKuliah, Nilai1, Nilai2, Nilai3, Nilai4, Nilai5);
    listmahasiswa.add(mhs);
    }
    
    public ArrayList<Mahasiswa>getALL(){
        return listmahasiswa;
    }
    
    public void deleteData(int index){
        if (index >= 0 && index < listmahasiswa.size()) {
            listmahasiswa.remove(index);
        } else {
            System.out.println("Invalid index. Data not deleted.");
        }
    }
}

