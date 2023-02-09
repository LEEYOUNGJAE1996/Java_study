package java0106;

import java.util.Scanner;

public class ex08_마트계산대프로그램 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("선물셋트 갯수 : ");
		Scanner sc = new Scanner(System.in);
		int gift_count = sc.nextInt();
		int price = 10000;
//		float disc_10 = 1f;
		float disc_1 = 1f;
		
		// 중복  
		/*---------------------------------------------------------
		
		if( gift_count >= 10 ) {
			disc = 0.95f;
			price = (int)((gift_count - gift_count % 10) *disc* price+ (gift_count%10) * price); 
		}	else {
			price = gift_count * price ;
		}
		
		if(gift_count >=25) {
			disc = 0.9f;
			price = (int)(price * disc) ;
		}
		-----------------------------------------------------------*/
		
		
		/* ----------------------------------------------------
		//10개 번들의 할인 
		if(gift_count >= 10 ) {
			disc_10  -= 0.05f ;		
		} 
		// 25개가 넘은 경우 10개 번들의 추가 할인과 낱개 제품들의 할인 개별 적용
		if(gift_count >=25) {
			disc_10 -= 0.1f;
			disc_1 -= 0.1f;
			
		}
		
		price = ((gift_count - gift_count%10)*(int)(disc_10*price)
				+(gift_count%10)*(int)(disc_1*price));
		*/
		//-----------------------------------------------------
		
		
		//할인율 일괄 적용! ---낱개 적용 x----------------------------
		if(gift_count % 10 == 0) {
			disc_1 -= 0.05f;
		}
		if(gift_count >=25 ) {
			disc_1 -= 0.1f;
		}
		price = gift_count *(int)(price *  disc_1);
		
		//----------------------------------------------------
		
		// 출력 -----------------------------------------------
		System.out.println("총 금액은 " + price + "원입니다.");
		//----------------------------------------------------
		
		sc.close();
	}

}
