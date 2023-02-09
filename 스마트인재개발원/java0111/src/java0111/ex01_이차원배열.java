package java0111;

public class ex01_이차원배열 {
	public static void main(String[] args) {
		int[][] arrint = new int[5][5];
		
		for(int i = 0 ; i < arrint.length ; i++ ) {
			for(int j = 0 ; j < arrint[0].length ; j++) {
				arrint[i][j] = (i+4) * 5 + j+1;
				System.out.print(arrint[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		for(int i = 0 ; i < arrint.length ; i++ ) {
			for(int j = 0 ; j < arrint[0].length ; j++) {
				arrint[i][j] = (j+4) * 5 + i+1;
				System.out.print(arrint[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
