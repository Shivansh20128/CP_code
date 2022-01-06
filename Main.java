package com.brickBracker;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
	// write your code here

        try {
            int num = scan.nextInt();
            if (num >= 3 && num <= 100 && num % 2 == 0) {
                System.out.println("YES");
            }else System.out.println("NO");
        }catch(InputMismatchException j){
            System.out.println("NO");
        }

    }
}
