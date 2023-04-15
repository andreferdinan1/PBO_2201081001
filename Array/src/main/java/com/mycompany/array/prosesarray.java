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
import java.util.Random;// import random
public class prosesarray {
    public static void main(String[] args)
    {
        int[] Nilai;//deklarasi array
        int n,i,sum;
        double rata;
        int max, imax, min, imin;
        Random rand = new Random();//buat objek random
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan banyak data :");
        n=in.nextInt();//input ukuran array
        Nilai= new int[n];//membuat array ukuran n
        //mengisi array
        for (i=0; i<n;i++)
        {
            //System.out.println("Nilai ke-"+(i+1)+" = ");
            Nilai[i]= rand.nextInt(100);//0-99
        }
        //proses isi array
        sum = Nilai[0];
        max = Nilai[0]; imax=0;
        min = Nilai [0]; imin=0;
        for(i=1;i<n;i++)
        {
            sum = sum + Nilai[i];
            if(Nilai[i]>max)
            {
                max=Nilai[i];
                imax=i;
            }
            if(Nilai[i]<min)
            {
                min=Nilai[i];
                imin=i;
            }
            rata = (double)sum/n;
            //menampilkan isi array
            System.out.println("\n===Daftar Nilai===");
            for (i=0; i<n;i++)
        {
            System.out.println("Nilai ke-"+(i+1)+" = "+Nilai[i]);
        }
            System.out.print("\nJumlah Nilai = "+sum);
            System.out.print("\nRata-Rata Nilai = "+rata);
            System.out.print("\nNilai Terbesar = "+max);
            System.out.print("\nNilai terbesar adalah nilai ke-"+(imax+1));
            System.out.print("\nNilai Terkecil = "+min);
            System.out.print("\nNilai terkecil adalah nilai ke-"+(imin+1));
        }
    }
}
