package javavolker.ralf;

import java.util.Scanner;

public class DritterEinstieg {

	public static void main(String[] args){
		Scanner scanner = new Scanner (System.in);
		System.out.println("Hey Ralf, gib' irgendwas ein und drücke ENTER!");
		
		String nextLine = scanner.nextLine();
		while (!nextLine.isEmpty()){
			System.out.println("Hey Ralf, gib' irgendwas ein und drücke ENTER!");
			nextLine = scanner.nextLine();
			System.out.println("Das hast du eingegeben: " + nextLine);
		}
		
	}
}
