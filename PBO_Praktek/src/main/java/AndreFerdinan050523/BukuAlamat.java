/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AndreFerdinan050523;

/**
 *
 * @author andreferdinan
 */
public class BukuAlamat {
        private String nama;
        private String alamat;
        private String nohp;
        private String email;
        private static int studentCount;
    
    public BukuAlamat(){
        //area penulisan kode
        studentCount++;
    }
    
    public BukuAlamat(String temp){ 
    this.nama = temp; 
    studentCount++;
    } 
    
    public BukuAlamat(String nama, String alamat, String nohp, String email){ 
    this.nama = nama; 
    this.alamat = alamat;
    this.nohp = nohp; 
    this.email = email;
    studentCount++;
    } 
        
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public String getNohp(){
        return nohp;
    }
    
    public void setNohp(String nohp){
        this.nohp = nohp;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public static int getStudentCount(){
        return studentCount;
    }
    
    public void print( String temp ){ 
    System.out.println("Nama:" + nama); 
    System.out.println("Alamat:" + alamat); 
    System.out.println("Nomor Telephone:" + nohp);
    System.out.println("Almat e-mail:" + email);
    } 
    
    
}
