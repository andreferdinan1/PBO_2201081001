/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AndreFerdinan050523;


/**
 *
 * @author andreferdinan
 */
public class BukuAlamatExample {
     public static void main(String[]args){
        BukuAlamat annaRecord = new BukuAlamat();
        annaRecord.setNama("Andre");
        annaRecord.setAlamat("Padang");
        annaRecord.setNohp("082286514855");
        annaRecord.setEmail("andreferdinand26@gmail.com");
        
        System.out.println("Nama                :"+annaRecord.getNama());
        System.out.println("Alamat              :"+annaRecord.getAlamat());
        System.out.println("Nomor Telephone     :"+annaRecord.getNohp());
        System.out.println("Email               :"+annaRecord.getEmail());
}
}
