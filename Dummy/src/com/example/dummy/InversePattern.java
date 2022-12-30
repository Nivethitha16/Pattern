package com.example.dummy;

import java.util.Scanner;

public class InversePattern
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int i =1;
        while(i<=n)
        {
            //int j=1;
            int aa=i;
            int j=n-i+1;
            while(aa<=n)
            {
                System.out.print(j);
                aa++;
            }
            System.out.println();
            i++;
        }


    }

}
