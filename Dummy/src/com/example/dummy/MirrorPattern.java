package com.example.dummy;


import java.util.Scanner;

public class MirrorPattern
{

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int i=1;
        while(i<=a)
        {
            int spaces=1;
            int p=1;
            while(spaces <= a-i)
            {
                System.out.print(' ');
                spaces++;

            }

            int stars=1;
            while(stars<=i)
            {
                System.out.print(p);
                stars++;
                p++;
            }
            System.out.println();
            i++;
        }


    }







}
