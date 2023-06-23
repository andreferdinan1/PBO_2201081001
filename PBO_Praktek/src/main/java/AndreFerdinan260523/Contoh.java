/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AndreFerdinan260523;

/**
 *
 * @author andreferdinan
 */
public class Contoh extends studentRecord{
    private String BahasaPemrograman;
    private String PengalamanProgramer;

    public Contoh() {
        super();
    }

    public Contoh(String name, String address, int age, String programmingLanguage, String programmingExperience) {
        super(name, address, age);
        this.BahasaPemrograman = programmingLanguage;
        this.PengalamanProgramer = programmingExperience;
    }

    public String getProgrammingLanguage() {
        return BahasaPemrograman;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.BahasaPemrograman = programmingLanguage;
    }

    public String getProgrammingExperience() {
        return PengalamanProgramer;
    }

    public void setProgrammingExperience(String programmingExperience) {
        this.PengalamanProgramer = programmingExperience;
    }

    @Override
    public void print(String temp) {
        super.print(temp);
        System.out.println("Bahasa Pemrograman: " + BahasaPemrograman);
        System.out.println("Pengalaman Programer: " + PengalamanProgramer);
    }
}