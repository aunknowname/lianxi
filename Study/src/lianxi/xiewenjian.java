package lianxi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class xiewenjian {

	public static void main(String[] args) throws IOException {
		//写文件，要先输入流
		//创建文件的输出流
		//写文件内容
		//释放资源，告诉GC垃圾回收器，这个对象没用了，可以收回释放空间
		File file = new File("f:/a.txt");
		OutputStream os = new FileOutputStream(file);
		String msg = "练习输出，\r\n找到手感";   // \r\n是换行符号
		os.write(msg.getBytes());  //将文字用字节形式写到文件中
		os.close();


	}
}
