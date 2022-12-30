package com.example.dummy;

import java.util.Scanner;

public class charpattern
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int i =1;

        while(i<=n)
        {
            int j=1;
            while(j<=i)
            {
                char a =(char)('A'+j-1) ;
                System.out.print(a);

                j++;

            }
            System.out.println();
            i++;
        }


    }

}
