
class Tv{
	
	// tv�� �Ӽ�(�������)
	String color;
	boolean power;
	int channel;
	
	//tv�� ���(�޼���)
	void power() { power = !power;}
	void channelUp() { ++channel;}
	void channelDown() { --channel;}
}

public class TvTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tv t1 = new Tv();
		
		for(int i=0; i<3 ; i++)		
		t1.channel=i+10;
		
		System.out.printf("tvArr[i],channel=d%",t1.channel);
		
		
		
		
	}

}
