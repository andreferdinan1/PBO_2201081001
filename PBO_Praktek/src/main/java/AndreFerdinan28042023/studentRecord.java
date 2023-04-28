/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AndreFerdinan28042023;

/**
 *
 * @author andreferdinan
 */
public class studentRecord {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private double grade;
    private static int studentCount;
    
    public studentRecord(){
        //area penulisan kode
        studentCount++;
    }
    
    public studentRecord(String temp){ 
    this.name = temp; 
    studentCount++;
    } 
    
    public studentRecord(String name, String address, int age){ 
    this.name = name; 
    this.address = address;
    this.age = age;
    studentCount++;
    } 
    
    public studentRecord(double mGrade, double eGrade, double sGrade){ 
    mathGrade = mGrade; 
    englishGrade = eGrade; 
    scienceGrade = sGrade;
    studentCount++;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public double getMathGrade(){
        return mathGrade;
    }
    
    public void setmathGrade(double mathGrade){
        this.mathGrade = mathGrade;
    }
    
    public double getEnglishGrade(){
        return englishGrade;
    }
    
     public void setEnglishGrade(double englishGrade){
        this.englishGrade = englishGrade;
    }
    
    public double getScienceGrade(){
        return scienceGrade;
    }
    
    public void setscienceGrade(double scienceGrade){
        this.scienceGrade = scienceGrade;
    }
    
    public double getAverage(){
        average = (mathGrade + englishGrade + scienceGrade) / 3;
        return average;
    }
    
    public String getGrade(){
    double average = getAverage();
    if(average >= 80){
        return "A";
    }else if(average >= 65){
        return "B";
    }else if(average >= 55){
        return "C";
    }else if(average >= 40){
        return "D";
    }else{
        return "E";
    }
}
    
    public static int getStudentCount(){
        return studentCount;
    }
    
    
    
    public void print( String temp ){ 
    System.out.println("Name:" + name); 
    System.out.println("Address:" + address); 
    System.out.println("Age:" + age); 
    } 
    
    public void print(double eGrade, double mGrade, double sGrade){ 
    System.out.println("Name:" + name); 
    System.out.println("Math Grade:" + mGrade); 
    System.out.println("English Grade:" + eGrade); 
    System.out.println("Science Grade:" + sGrade); 
    }
    
}       
