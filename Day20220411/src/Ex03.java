import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("������ ������ �Է� �ϼ���.(��:0)");
		Scanner scanner = new Scanner(System.in);
		int sum =scanner.nextInt();
		
		System.out.println("��Ģ����");
		System.out.println("sum("+sum+")�Ѵ���+2");
		
		sum = sum+2 ;
		System.out.println("sum("+sum+")*3");
		
		sum = sum*3;
		System.out.println("sum("+sum+")/2");
		
		sum = sum/2;
		System.out.println("sum("+sum+")-10");
		
		sum = sum-10;
		System.out.println("sum("+sum+")");
		
		System.out.printf("q--����%n���հ��");
	   }

	}      