package 탐색;

public class ex02_BinarySearch {
	public static int sum(int a, int b) {
		
		return a+b;
	}
	
	public static void main(String[] args) {
		int[] arr = { 1, 3, 6, 9, 11, 20, 54, 78, 90, 110 };
		int findNum = 45;

		int lowIndex = 0; // 탐색의 범위 중 낮은 쪽
		int highIndex = (arr.length) - 1; // 탐색의 범위 중 높은 쪽
		int midIndex;
	
		while (true) {
			midIndex = (highIndex + lowIndex) / 2;
			
			if (arr[midIndex] == findNum) {
				System.out.println("78은 " + (midIndex + 1) + "번째에 있습니다.");
				break;
			} else if (arr[midIndex] < findNum) {
				lowIndex = midIndex + 1;
			} else {
				highIndex = midIndex -1;
			}
			if((highIndex + lowIndex) / 2 == midIndex) {
				System.out.println("없음");
				break;
			}
		}
	}
}
