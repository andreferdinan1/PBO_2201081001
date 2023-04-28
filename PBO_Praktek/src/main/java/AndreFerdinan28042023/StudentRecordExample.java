/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AndreFerdinan28042023;

/**
 *
 * @author andreferdinan
 */
public class StudentRecordExample {
    public static void main(String[]args){
        studentRecord annaRecord = new studentRecord();
        annaRecord.setName("Anna");
        annaRecord.setAddress("Padang");
        annaRecord.setAge(19);
        annaRecord.setmathGrade(80);
        annaRecord.setEnglishGrade(70);
        annaRecord.setscienceGrade(80);
        
        //tampilkan
        System.out.println("Nama    :"+annaRecord.getName());
        System.out.println("Alamat    :"+annaRecord.getAddress());
        System.out.println("Umur    :"+annaRecord.getAge());
        System.out.println("Matematika    :"+annaRecord.getMathGrade());
        System.out.println("B.Inggris    :"+annaRecord.getEnglishGrade());
        System.out.println("Ilmu Pengetahuan    :"+annaRecord.getScienceGrade());
        System.out.println("Rata-rata Nilai    :"+annaRecord.getAverage());
        System.out.println("Grade Nilai    :"+annaRecord.getGrade());
        
        studentRecord aliRecord = new studentRecord();
        aliRecord.setName("Ali");
        aliRecord.setAddress("Sumpur Kudus");
        aliRecord.print("");
        aliRecord.print("80,70,80");
        
        studentRecord budiRecord = new studentRecord("Budi","Bukittinggi");
        budiRecord.print("");
        
        System.out.println("jumlah Siswa : "+
                studentRecord.getStudentCount());
    }
}
