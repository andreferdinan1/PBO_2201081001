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
public class BubbleSort {
    public static void main(String[] args)
    {
        int[] data;
        int n,i,temp,j;
        Scanner in = new Scanner (System.in);
        Random rand = new Random();
        System.out.println("Banyak data = ");
        n=in.nextInt();//input ukuran array
        data= new int[n];
        //mengisi array
        System.out.println("===Isi array sebelum diurutkan");
        for (i=0; i<n;i++)
        {
            data[i]= rand.nextInt(100)+1;//0-100
            int enter = i%10;
            System.out.println(data[i]+"\t");
            if(i !=0 && enter==0)
            {
                System.out.println();
            }
        }
        //bubble
        for (i=0; i<n;i++)
        {
            for (j=n-1; j>i+1;j--)
            {
                if(data[j]<data[j-1])//tukar
                {
                    temp=data[j];
                    data[j]=data[j-1];
                    data[j-1]=temp;
                }
            }
        }
        System.out.println("===Isi array setelah diurutkan");
        for (i=1; i<n;i++)
        {
          
            System.out.println(data[i]+"\t");
        }
    }
}
