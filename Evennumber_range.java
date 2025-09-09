package com.codegnan.loopingstatements;

import java.util.Scanner;

public class Evennumber_range {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=scanner.nextInt();
        int count=0;
        int i =1;
        do {
        	if(i%2==0) {
        		count++;
        	}
        	i++;
        }while(i<=num);
        System.out.println(count);
	}

}
