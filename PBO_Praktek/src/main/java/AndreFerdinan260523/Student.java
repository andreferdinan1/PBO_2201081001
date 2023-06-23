/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AndreFerdinan260523;

/**
 *
 * @author andreferdinan
 */
public class Student extends Person {
    public Student(){
    super.name="Andre";
    super.address="Padang";
    System.out.println("Inside Student:Constructor");
    
    }
    @Override
    public String getName() {
        System.out.println("Student: getName");
        return name;
    }
    
    public static void main(String[] args){
        Student anna = new Student();
        System.out.println("Nama    :"+anna.name);
        System.out.println("Alamat  :"+anna.address);
}
    }
