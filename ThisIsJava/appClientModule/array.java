
public class array {

	public static void main(String[] args) {
		int[][] mathScore = new int[2][3];
		mathScore[0][0] = 5;
		mathScore[0][1] = 6;
		mathScore[0][2] = 7;
		mathScore[1][0] = 8;
		mathScore[1][1] = 9;
		mathScore[1][2] = 10;
		for(int i=0; i<mathScore.length; i++) {
			for(int j =0; j<mathScore[i].length; j++) {
				System.out.println("mathScore["+i+"]["+j+"]= " + mathScore[i][j]);
			}
		}
		System.out.println("------------------------");
		int[][] englishScore = {{50,60}, {70,80,90}};
		for(int i =0; i<englishScore.length; i++ ) {
			for(int j =0; j<englishScore[i].length; j++) {
				System.out.println("englishScore["+i+"]["+j+"]= " +englishScore[i][j]);
			}
		}
		
	}

}
