/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AndreFerdinan260523;

/**
 *
 * @author andreferdinan
 */
public class Contoh2 extends studentRecord{
    public static void main(String[] args) {
        // Membuat objek ComputerScienceStudent
       Contoh student = new Contoh("Andre Ferdinan", "Silantai", 19, "Java", "Pemula");

        // Mengatur nilai-nilai lainnya
        student.setMathGrade(85);
        student.setEnglishGrade(90);
        student.setScienceGrade(80);

        // Menampilkan informasi siswa
        student.print("Additional Information");

        // Menampilkan rata-rata nilai
        System.out.println("Average Grade: " + student.getAverage());

        // Menampilkan jumlah total siswa
        System.out.println("Student Count: " + studentRecord.getStudentCount());
    }
}
