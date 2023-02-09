package java0117;

//import java.util.Arrays;

public class ex06_배열값출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1차원 배열을 입력으로 받아
		//문자열로 변환해서 반환하는 메소드 toString을 만들어보자.
		// 출력 결과 ==> [ 1 2 3 4 5]
		int [] arr = {1,2,3,4,5};
		String str = toString(arr);
		str = toString(arr);
		System.out.println(str);
		
	
	}
//	private static String toString(int[] arr) {
//		String str="";
//		for(int i = 0 ; i < arr.length ; i++ ) {
//			str += arr[i]+" ";
//		}
////		str = Arrays.toString(arr);
//		return str;
//	}
//	private static void toString(int[] arr) {
//		System.out.print("[ ");
//		for(int i = 0 ; i < arr.length ; i++) {
//			System.out.print(arr[i] + " ");
//		}
//		System.out.print("]");
//	}
	private static String toString(int[] arr) {
		String str = "[ " ;
		for(int i = 0 ; i < arr.length ; i++) {
			str += arr[i];
			str += " ";
		}
		 str += "]" ;
		return str ;
	}
}
