
public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int[][] score= {{100,100,100},
				        {20,20,20},
				        {30,30,30},
				        {40,40,40}};
		int sum=0;
		
		for(int i=0; i<4 ; i++) {
			for(int j=0; j<3 ; j++) {
			int	num =score[i][j];
		    
		
		System.out.printf("score[%d][%d]=%d%n",i,j,score[i][j]);
		}}
			
		for(int[] tmp : score) {
			for(int i : tmp) {
				sum += i;
				System.out.println(ArraytoString(score));
			}
		}
			
			
			
			
        System.out.println("합계는="+sum);
	}

	public static void main(String[] args) {
		ArraytoString
	}

}
