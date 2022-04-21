import java.util.Scanner;

class ReferenceReturnEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Data d = new Data();
     d.x=10;
     
     Data d2 =copy(d);
     System.out.println("d.x="+d.x);
     System.out.println("d2.x="+d2.x);
	}
   static Data copy( Data d) {
	   Data tmp =new Data();
	   tmp.x =d.x;
	   return tmp;
   }
}
Scanner sc =new Scanner(System.in);

System.out.println("몇년도 인가요?");
int year = sc.nextInt();

System.out.println("몇월 인가요?");
int month = sc.nextInt();

