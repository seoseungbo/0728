
public class SwitchDemo {
	public static void main(String[] args) {
		int su = 234;
		
		System.out.println( (su % 2 == 0)? "짝수" : "홀수");   // 1번 삼항연산자
		
		if(su % 2 == 0) {                                              // 2번
			System.out.println("짝수");
			}else {
				System.out.println("홀수");
			}
			
			
			
		switch (su % 2 ) {                                          //3번
			
		case 0:
			System.out.println("짝수");
			break;
		case 1:	
			System.out.println("홀수");
			break;

		
		}
	}
}
