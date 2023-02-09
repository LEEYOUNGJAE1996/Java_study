package javafestival;

public class 문제27_90도회전 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = new int[5][5];
		System.out.println("원본");
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ;j++) {
				arr[i][j] = i*5 + j+1;
				System.out.print(arr[i][j]+ "\t");
			}
			System.out.println();
		}
		System.out.println("90도 회전");
		for(int j = 4 ; j >=0 ; j--) {
			for(int i = 0 ; i < 5 ;i++) {
				System.out.print(arr[i][j]+ "\t");
			}
			System.out.println();
		}
		
	}

}
