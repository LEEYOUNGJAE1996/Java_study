package java0109;

import java.util.Scanner;

public class ex12_이중for문2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			for (int i = 1; i < 10; i++) {

				for (int j = 1; j < 10; j++) {
					System.out.print((j) + "*" + i + "=" + (j) * i + "\t");

				}

				System.out.print("\n");
			}
			
		
		sc.close();
	}
}
