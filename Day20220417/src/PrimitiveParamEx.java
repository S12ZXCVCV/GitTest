class Date {int x;}
public class PrimitiveParamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Date d = new Date();
     d.x =10 ;
     System.out.println("maim():x="+d.x);
     
     change(d.x);
     System.out.println("After change(d.x)");
     System.out.println("maim():x="+d.x);
     
	}
   static void change(int x) {
	   x=1000;
	   System.out.println("change() : x ="+x);
   }
}
