
public class array2 {

	public static void main(String[] args) {
		System.out.println("----------for�� �̿��� �迭 ����-----------");
		int[] oldIntArray = {1,2,3};
		int[] newIntArray = new int[5];
		
		for(int i =0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		for(int i =0; i<newIntArray.length; i++) {
			System.out.println(newIntArray[i]);
		}
		
		System.out.println("---------arraycopy�� �̿��� �迭 ����------------");
		String[] array = {"java","array","copy"};
		String[] array1 = new String[5];
		
		System.arraycopy(array, 0, array1, 0, array.length);
		
		for(int i = 0; i < array1.length; i++) {
			System.out.println(i);
		}
		
		System.out.println("-----------���� for��-----------");
		int[] scores = {80,82,85,90,95};
		int sum = 0;
		for(int score : scores) {
			sum = sum + score;
		}
		System.out.println(sum);
	}
}
