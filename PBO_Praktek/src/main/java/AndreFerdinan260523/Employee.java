/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AndreFerdinan260523;

/**
 *
 * @author andreferdinan
 */
public class Employee extends Person {
    
    @Override
    public String getName(){
        System.out.println("Employee Name:"+ name);
        return name;
    }
}
