/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.array;

/**
 *
 * @author andreferdinan
 */
import java.util.Scanner;
import java.util.Random;
public class SequentialSearch {
    public static void main(String[] args)
    {
        int[] data;
        int n,i,x;
        Scanner in = new Scanner (System.in);
        Random rand = new Random();
        System.out.println("Banyak data = ");
        n=in.nextInt();//input ukuran array
        data= new int[n];
        //mengisi array
        for (i=0; i<n;i++)
        {
            //System.out.println("Nilai ke-"+(i+1)+" = ");
            data[i]= rand.nextInt(10);//0-10
        }
        System.out.println("Angka yang dicari = ");
        x=in.nextInt();
        //menampilkan isi array
        System.out.println("\n===DATA===");
        for (i=0; i<n;i++)
        {
            System.out.println((i+1)+" = "+data[i]);
        }
        //Sequential
        int banyak=0;
        for (i=0; i<n;i++)
        {
            if(data[i]==x)
            {
            System.out.println("Ada di data ke-"+(i+1));
            //break;
            banyak++;
            }
        }
        if(banyak>0)
            System.out.println("Angka "+x+" ada sebanyak "+banyak+" buah");
        else//banyak=0
            System.out.println("Angka "+x+" tidak ada ");
            
    }
}
