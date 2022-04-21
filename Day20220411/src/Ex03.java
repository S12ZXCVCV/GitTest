import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("임이의 정수를 입력 하세요.(예:0)");
		Scanner scanner = new Scanner(System.in);
		int sum =scanner.nextInt();
		
		System.out.println("사칙연산");
		System.out.println("sum("+sum+")총누적+2");
		
		sum = sum+2 ;
		System.out.println("sum("+sum+")*3");
		
		sum = sum*3;
		System.out.println("sum("+sum+")/2");
		
		sum = sum/2;
		System.out.println("sum("+sum+")-10");
		
		sum = sum-10;
		System.out.println("sum("+sum+")");
		
		System.out.printf("q--종료%n종합계산");
	   }

	}      