package lianxi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class fangshi1 {

	public void write() throws IOException{
	File file = new File("F:/c.TXT");
	OutputStream os = new FileOutputStream(file);
	String xie = "Java的学习，需要一点点积累";
	os .write(xie.getBytes());
	os.close();
	}
	
	
	public void read() throws IOException{
		File file = new File("F:/c.txt");
		InputStream is = new FileInputStream(file);
		byte[] buf = new byte[1024];
		//按照二进制读法，流，一次批量读取的字节数
		int len = 0;
		//把读取的内容长度存在len中
		while((len=is.read(buf))!=-1){
			//不是-1就代表还没有到文件末尾，继续读取
			System.out.write(buf,0,len);
		}
			is.close();
			
		}
	}
