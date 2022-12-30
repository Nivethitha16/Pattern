package com.example.dummy;


import java.util.Scanner;
import java.util.ServiceConfigurationError;

public class Diamonds {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int first= ((n+1)/2);
        int second=(n/2);

        int i=1;
        while(i<=n)
        {
            int spaces=1;
            while(spaces<=first-1)
            {
                System.out.println(' ');
                spaces++;
            }




        }


    }
}
