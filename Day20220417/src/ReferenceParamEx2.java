
class ReferenceParamEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] x= {10};
     
     System.out.println("maim():x="+x[0]);
     
     change(x);
     System.out.println("After change(x)");
     System.out.println("maim():x="+x[0]);
     
	}
   static void change( int[] x) {
	   x[0]=1000;
	   System.out.println("change() : x ="+x[0]);
   }
}
