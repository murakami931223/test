package test03;

import java.time.Instant;

public class cytech03 {	
	public static void main(String[] args) {
		
		if(Instant.now().getEpochSecond()%2 == 0) {
			System.out.println("偶数です");
		}else {
			System.out.println("奇数です");
		}

	}

}
