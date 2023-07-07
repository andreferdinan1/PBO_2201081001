/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andre.controller;
/**
 *
 * @author andreferdinan
 */
public class test {
    public static void main(String[] args){
        try{
        System.out.println(args[0]); 
        System.out.println(1/0);
    }catch (java.lang.Exception ex){
    System.out.println("Error :"+ ex.getMessage());
}
    }
}
