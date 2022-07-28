import java.util.Scanner;
import java.util.GregorianCalendar;

public class OpDemo {
	public static void main(String[] args) {
		//나머지 연산자
		//System.out.println(5/2);
		//System.out.println(5%2);
		//Shift Operator
		//System.out.println(32767<<5);
		//System.out.println(-32767>>5);
		//System.out.println(-32767>>>5);
		//System.out.println(true & false);
//		int a = 5; int b =10; int x = 15;
//		if(a < x && ++b < x) {                      //&& 와 &의 차이 : 후자는 앞이 거짓이라도 오른 쪽 계산을 함
//			System.out.println("참");
//		}else {
//			System.out.println("거짓");
//		}
//		System.out.println("b =" + b);
//		if(4>5) {
//			System.out.println("참");
//		}else {
//			System.out.println("거짓");
//		}
//		
//		System.out.println((4>5)? "참" : "거짓");  // 위의 조건문보다 3항 연산자를 쓰는 것이 더 빠르게 연산함

//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수 한개를 입력하세요 :");
//		int su = sc.nextInt();
//		
//		if(su % 2 == 0) System.out.println("짝수이군요.");
//		else System.out.println("홀수이군요.");
//		System.out.println( (su % 2 == 0) ? "짝수이군요" : "홀수이군요.");
		
//		System.out.println("년도 입력 :");
//		int year = sc.nextInt();
//		
//		if((year % 400 == 0) || (year % 4 == 0 && year % 100 !=0)) {
//			System.out.println("당신이 입력하신" + year + "는 연년입니다");
//			}else {
//				System.out.println("당신이 입력하신" + year + "는 윤년이 아닙니다");
//			}
//		System.out.print("당신이 입력하신" + year + "년은");
//		System.out.println((year % 400 == 0) || (year % 4 == 0 && year % 100 !=0) ? "윤년입니다." : "윤년이 아닙니다");
//		
//		GregorianCalendar gc = new GregorianCalendar();
//		boolean flag = gc.isLeapYear(year);
//		System.out.println("당신이 입력하신" + year + "년도는" + ((flag) ? "윤년입니다." : "윤년이 아닙니다"));
		
		//할당 연산자
//		int age = 26;
//		age++;  //age = age + 1
//		age = age + 5;
//		//복합연산자
//		age += 5;
//		
//		//나열연산자(,)
//		int a = 5, b = 10, x = 15;
		
		double year = (true) ? 2022 : 3.14;
		
	} 
}
