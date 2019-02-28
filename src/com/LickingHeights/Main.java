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
        else if(value>=30&&value<40){
            System.out.println("Maybe");
        }
        else if(value>=40&&value<50){
            System.out.println("Bad question!");
        }
        else if(value>=50&&value<60){
            System.out.println("DIE!!!!!");
        }
        else if(value>=60&&value<70){
            System.out.println("Sure");
        }
        else if(value>=70&&value<80){
            System.out.println("My reply is no!");
        }
        else if(value>=80&&value<90){
            System.out.println("With time");
        }
        else if(value>=90&&value<=100){
            System.out.println("Don't count on it!");
        }
    }
}
