package test;

import java.util.Arrays;

public class Test3 {

	public static void main(String[] args) {

		int[] arr = { 3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48 };
		// ͳ�ƱȽϴ���
		int count = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = 1 + i; j < arr.length; j++) {
				if (arr[j] < arr[index]) {
					index = j;// ������СԪ�ص��±�
				}
				count++;
			}
			// ��ʱ�Ѿ��ҵ���СԪ�ص��±�
			// ����СԪ����ǰ���Ԫ�ؽ���
			int temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("һ���Ƚ���:" + count + "��");
	}
}



