package java0113;


public class ex02_비만도계산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double weight = 60.5;
		double height =1.7;
		
		double BMI = 0.0 ;
		
		BMI = calBMI(weight, height);
		System.out.println("당신의 BMI 지수는 " + BMI+ "입니다.");
	}

	private static double calBMI(double weight, double height) {
		
	 
		return weight / Math.pow(height,2);
	}

}
