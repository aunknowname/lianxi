package test;

import java.util.Arrays;

//定义线程类Task继承Thread类	
public class Test5 extends Thread {	

	
// 子类中重写Thread类中的run方法	
public void run() {	
  for (int i = 1; i <= 5; i++) {	
    System.out.println("线程输出：" + i);	
  }	
}	
}	






