public class WhileLoops {
	public static void main(String[] args) {
		
		int value1 = 0;
				
		while(value1 < 9)
		{
			System.out.println("1st test loop " + value1);
			
			//value1 = value1 + 1;
			value1++;
		}
		
		System.out.println("1st test loop END");
		
		int value2 = 2;
		
		while(true) {
			System.out.println("2nd test loop " + value2);
			
			if(value2 == 9) {
				break;
			}
			
			value2++;
			System.out.println("next");
		}
		
		System.out.println("2nd test loop END");
			
	}

}