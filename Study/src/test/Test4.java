package test;

import java.util.Arrays;

public class Test4 {

	public static void main(String[] args) {

		int[] arr = { 3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48 };
		int count = 0;
		for (int i = 1; i < arr.length; i++) {
			// ������������
			int insertValue = arr[i];
			// �ҵ�����������ǰһ�������±�
			int insertIndex = i - 1;
			while (insertIndex >= 0 && insertValue < arr[insertIndex]) {
				arr[insertIndex + 1] = arr[insertIndex];
				insertIndex--;
				count++;
			}
			arr[insertIndex + 1] = insertValue;
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("һ���Ƚ���:" + count + "��");
	}
}



