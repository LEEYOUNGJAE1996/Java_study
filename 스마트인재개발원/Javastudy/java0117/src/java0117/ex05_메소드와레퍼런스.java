package java0117;

public class ex05_메소드와레퍼런스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//call by value
		//기본데이터 타입을 입력인자로 전달시 값의 복사가 일어나는 현상
		int num1 = 10;
		num1 = a(num1);
		System.out.println(num1);
		//call by reference??
		int [] array = new int[2];
		array[0] = 10;
		array[1] = 20;
		b(array);
		//void 지만 두배가 되어 그대로 출려? why??
		//because 메소드에 들어가는 것은 배열의 첫번째 배열의 주소가 입력  
		// 배열 생성 시 배열을 가르키는 주소는 어디에 저장된 값을 가리키는 걸까?
		//?? -heap 영역에 저장된 배열
		for(int i = 0 ; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	private static int a(int num1) {
		
		num1 = num1 * 2 ;
		return num1;
	}
	private static void b(int[] array) {
		for(int i = 0 ; i < array.length; i++) {
			array[i] *= 2;
		}
	}
}
