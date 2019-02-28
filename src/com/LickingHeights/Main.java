package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//System.out.println("Hi");
	//System.out.println("hello");

        Scanner keyboard;
        int value;
        int testing;
        String question;
        keyboard= new Scanner(System.in);

        System.out.println("Pick a number 0 to 100 ");
        value = keyboard.nextInt();
        if(value<10){
            System.out.println("Of course!");
        }
        else if(value>=10&&value<20){
            System.out.println("Ask again");
        }
        else if(value>=20&&value<30){
            System.out.println("Defiantly");
        }







    }
}
