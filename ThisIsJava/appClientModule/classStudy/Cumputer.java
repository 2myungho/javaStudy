package classStudy;
//�Ű� ������ ���� �� ���
public class Cumputer {
	//�Ű������� �迭Ÿ������ ����
	int sum1(int[] values) {
		int sum = 0;
		for(int i = 0; i<values.length; i++) {
			sum+=values[i];
		}
		return sum;
	}
	//�迭�� �������� �ʰ� ����Ʈ�� �Ѱ��ִ� ���
	int sum2(int ... values) {
		int sum = 0;
		for(int i =0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
