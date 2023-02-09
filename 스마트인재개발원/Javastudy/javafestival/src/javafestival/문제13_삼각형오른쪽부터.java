package javafestival;

public class 문제13_삼각형오른쪽부터 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//출력되는 순서 5 -> 4,5 -> ...-> 1,2,3,4,5 따라서 i를 5부터 시작하여 역으로 내려간다.
		for(int i = 5 ; i >0  ; i--) {
			//j는 0부터 차례대로 증가하여  i와 같거나 커지는 경우 *을 출력한다.
			for(int j =0 ; j < 6; j ++) {
				if(j >= i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
