package com.company;

import java.util.Scanner;

public class myClass {
    public void guessMyNumber(int n) {
        // TODO: your code here
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your number");
        int num = in.nextInt();
        int counter = 3;
        for (int x = 0; x < 4; x++) {
            if (n == (int) (Math.random() * 10)) {

                System.out.println("congratulations you won");
                break;
            } else if (counter != 0) {
                System.out.println("Enter your number again");

                int nn = in.nextInt();
                counter = counter - 1;
                if (n == (int) (Math.random() * 10)) {

                    System.out.println("congratulations you won");
                    break;
                }
            } else if(counter==0) {
                System.out.println("Game Over");
            }
        }


    }
}