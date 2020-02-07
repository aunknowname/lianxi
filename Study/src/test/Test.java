package test;

import java.util.Arrays;

public class Test {
	
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		int[] arr = { 3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48 };
		// 统计比较次数
		// 第一轮比较
		for (int i = 0; i < arr.length - 1; i++) {
			// 第二轮比较
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					// 交换位置
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		long end = System.currentTimeMillis();
		System.out.println(Arrays.toString(arr));
		System.out.println("运行时间为:" +( end - start) );
	}
}

