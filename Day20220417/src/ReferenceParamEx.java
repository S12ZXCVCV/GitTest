class Data {int x;}
class ReferenceParamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Date d = new Date();
     d.x =10 ;
     System.out.println("maim():x="+d.x);
     
     change(d);
     System.out.println("After change(d)");
     System.out.println("maim():x="+d.x);
     
	}
   static void change( Date d) {
	   d.x=1000;
	   System.out.println("change() : x ="+d.x);
   }
}
