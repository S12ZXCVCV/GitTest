
public class Ex35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.printf("1\t2\t3\t4\t5%n");
		System.out.printf("==================================%n");
		
		int cnt = 0;
		//7일마다 줄 바꿔주기 위해서 cnt 변수를 0으로 초기화해줌

		int start=3;				;
		int end=23;
		
		for(int l = 0; l <= start; l++) {
			if(start == 4)//startDay가 6이면 공백을 주지 않아도 되므로 break을 사용해서 for문을 빠져나온다.
				break;
			System.out.print("\t");
			cnt++;
		}
				for(int m = 1; m <= end; m++) {//1부터 endDay까지 숫자를 입력해줌
					System.out.printf("%2d", m);
					cnt++;
					if(cnt % 7== 0) {//cnt가 7번 입력됐을 때 줄을 바꿔줌
						System.out.println();
					}
					else {
						System.out.printf("\t");//cnt가 7번 입력되지않았을 때는 간격을 넣어줌
				}
		
		
		}}}
	


