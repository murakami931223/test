package test09;

public class cytech09 {

	public static void main(String[] args) {
		//5人分の国語、算数、理科、社会の点数
		int[][] score = {{70,58,80,67},{90,82,50,82},{79,96,85,57},{100,45,89,62},{86,89,85,92}};
		
		String[] subjects = {"国語", "算数", "理科", "社会"};
		
		for(int i = 0; i < score.length; i++) {
			System.out.println("学生"+(i+1)+"の点数：");
			
			for(int j = 0; j < subjects.length; j++) {
				System.out.println(subjects[j] + "："+score[i][j]+"点");
			}
			System.out.println();
		}

	}

}
