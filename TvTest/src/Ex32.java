import java.util.Arrays;

public class Ex32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		nt[] def= {200};
	      int[] abc= new int[5];      
	      int[] abc1= new  int[5];      
	      int min=100, min2=100, min3=100, min4=100, min5=100;
	      for(int i=0; i<abc.length; i++)
	         abc[i]=(int)(Math.random()*99)+1;
	      System.out.println(Arrays.toString(abc));      
	//111111111111111      
	      for(int i=0; i<abc.length; i++) {
	         if(min>abc[i])
	            min=abc[i];
	      }
	      int j=0;
	      for(; j<abc.length; j++)
	         if(abc[j]==min)
	            break; System.out.println(j);
	      System.arraycopy(abc, j, abc1, 0, 1);
	      System.out.println(Arrays.toString(abc1));
	      System.arraycopy(def, 0, abc, j, 1);   
	//22222222222222222
	      for(int i=0; i<abc.length; i++) {
	         if(min2>abc[i])
	            min2=abc[i];
	      }
	      int k=0;
	      for(; k<abc.length; k++)
	         if(abc[k]==min2)
	            break; System.out.println(k);
	      System.arraycopy(abc, k, abc1, 1, 1);
	      System.out.println(Arrays.toString(abc1));
	      System.arraycopy(def, 0, abc, k, 1);
	//333333333333333333
	      for(int i=0; i<abc.length; i++) {
	         if(min3>abc[i])
	            min3=abc[i];
	      }
	      int l=0;
	      for(; l<abc.length; l++)
	         if(abc[l]==min3)
	            break; System.out.println(l);
	      System.arraycopy(abc, l, abc1, 2, 1);
	      System.out.println(Arrays.toString(abc1));
	      System.arraycopy(def, 0, abc, l, 1);
	//4444444444444444444
	      for(int i=0; i<abc.length; i++) {
	         if(min4>abc[i])
	                  min4=abc[i];
	      }
	      int m=0;
	      for(; m<abc.length; m++)
	         if(abc[m]==min4)
	            break; System.out.println(m);
	      System.arraycopy(abc, m, abc1, 3, 1);
	      System.out.println(Arrays.toString(abc1));
	      System.arraycopy(def, 0, abc, m, 1);
	//5555555555555555555
	      for(int i=0; i<abc.length; i++) {
	         if(min5>abc[i])
	            min5=abc[i];
	      }
	      int n=0;
	      for(; n<abc.length; n++)
	         if(abc[n]==min5)
	            break; System.out.println(n);
	      System.arraycopy(abc, n, abc1, 4, 1);
	      System.out.println(Arrays.toString(abc1));
	      System.arraycopy(def, 0, abc, n, 1);
		}}
