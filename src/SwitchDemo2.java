import java.util.Scanner;

public class SwitchDemo2 {
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.out.print("당신은 어느 계절을 좋아하시나요(spring / summer / fall / winter) ? : ");
			String season = sc.nextLine();
			
			String flowers = (season.equals("spring")) ? "진달래, 개나리" : 
									(season.equals("summer")) ? "장미, 아카시아":
										(season.equals("fall")) ? "코스모스, 백합":
										  (season.equals("winter")) ? "동백, 매화" : "그런 계절은 없습니다";
			System.out.println(flowers);
			
			
			
			if(season.equals("spring")) {     //season 이 알고 있는 번지의 값이  spring과 일치합니까?                 // 번지(16진수 주소) 와 문자열은 일치하지 않음 
				System.out.println("진달래, 개나리");
			}else if(season.equals("summer")) { //seaason이 알고 있ㄴㄴ 번지의 값이 섬머와 일치합니까?ㅁ
				System.out.println("장미, 아카시아");
			}else if(season.equals("fall")) {
				System.out.println("코스모스, 백합");
			}else if(season.equals("winter")) {
				System.out.println("동백, 매화");
			}else {
				System.out.println("그런 계절은 없습니다");
			}
			
			switch(season) {                                         // if의 가독성과 속도를 보완, 단점. 변수의 타입이 정해져 있음
			case "spring":
				System.out.println("진달래, 개나리"); break;
			case "summer":
				System.out.println("장미, 아카시아"); break;
			case "fall":
				System.out.println("코스모스, 백합"); break;
			case "winter":
				System.out.println("동백, 매화"); break;
			default:
				System.out.println("그런 계절은 없습니다"); 
			}
		}
}
