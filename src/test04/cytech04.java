package test04;

import java.time.Instant;

public class cytech04 {

	public static void main(String[] args) {
		
		long seconds = Instant.now().getEpochSecond();
		int time = (int) seconds;
		
		switch(time % 2) {
		case 0:
			System.out.println("偶数です");
			break;
			
		default:
			System.out.println("奇数です");
			break;			
		}


	}

}
