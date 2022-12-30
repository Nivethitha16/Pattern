package com.example.dummy;

import java.util.Scanner;

public class InterPattern
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int i =1;
       // char c=(char)(('A'-1+n));
        while(i<=n)
        {
            char c=(char)(('A'-1+n));
            int j=1;
            //char p=(char)(c-i+1) ;
            while(j<=i)
            {
                char p=(char)(c-i+1) ;
                System.out.print(p);
                p=(char)(p+1);
                j++;

            }
            System.out.println();
            i++;
        }


    }

}
