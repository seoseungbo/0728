import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Year :");
		int year = sc.nextInt();
		
		System.out.println("Month :");
		int month = sc.nextInt();
		

		if(month == 2) {
			if(year % 400 == 0 || (year % 4 == 0 && year % 100 !=0)) { //윤년이라면
				System.out.print("마지막날은 29일 입니다");	
			
		}else if(month !=2) { //2월이 아니라면
			if(month == 1 ||month == 3 month == 5 || month == 7 || month == 8 || month == 10 || month == 12) 
			System.out.println("마지막날은 31입니다");
		}else {
			System.out.println("마지막날은 30일입니다");
		}
	}
	
	
}
}
