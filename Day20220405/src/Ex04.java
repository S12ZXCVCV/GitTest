import java.util.Scanner;

public class Ex04 {

	public static String main(String[] args) {
		// TODO Auto-generated method stub
	
//				  1bit  2    4   8
//				 byte<short<int<long
//			   boolen<char
//					      float<double
		  
		   int x =0xAB, y = 0XF;
		   
		   System.out.printf("x =%#x \t\t%s%n",x,toBinaryString(x));
		   System.out.printf("y =%#x \t\t%s%n",y,toBinaryString(y));
		   System.out.printf("%#x | %#x =%#x \t\t%s%n",x,y,x|y,toBinaryString(x|y));
		   System.out.printf("%#x & %#x =%#x \t\t%s%n",x,y,x&y,toBinaryString(x&y));
		   System.out.printf("%#x ^ %#x =%#x \t\t%s%n",x,y,x^y,toBinaryString(x^y));
		   System.out.printf("%#x ^ %#x ^%#x =%#x \t\t%s%n",x,y,y,x^y^y,toBinaryString(x^y^y));
	

		   
		
		
		  

	
	

	
	}

	private static Object toBinaryString(int x) {
		// TODO Auto-generated method stub
		return null;
	}}
		  
		  
		
    		
    		
		
		
	


