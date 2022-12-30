package com.example.dummy;


import java.util.Scanner;

public class Isosceles
{

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int i=1;
        while(i<=a)
        {
            int spaces=1;
            //int p=1;
            while(spaces <= a-i)
            {
                System.out.print(" ");
                spaces++;

            }
            int num=1;
            int p=i;
            while(num<=i)
            {
                System.out.print(p);
                num++;
                p++;

            }

            int dec=i-1;
            int q=i+(i-1)-1;
            while(dec>=1)
            {
                System.out.print(q);
                dec--;
                q--;
                //p++;
            }
            System.out.println();
            i++;
        }


    }

}
// triangle of numbers
