package bullidUp;

public class Divide0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//컴파일 오류 : 문법오류
		//런타임 오류 : 문법적인 에러가 아닌 시랭 시에 나타나는 오류
		//try ~ catch 
		//예외상황 처리를 진행해주는 문법
		//실행 시 오류가 발생되면 catch문을 통해서 오류를 잡아 낼 수 다.
		try {
			System.out.println(100/0);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("0으로 나눔");
			//무슨 에러인지 표시
			e.printStackTrace();
		} // 무조건 실행
		finally {
			System.out.println("무조건 실행되어야 하는 코드");
			
		}
	}

}
