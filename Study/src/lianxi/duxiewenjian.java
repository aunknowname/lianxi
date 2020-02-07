package lianxi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class duxiewenjian {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//利用方式进行读写文件(fnagshi1)
		fangshi1 w = new fangshi1();
		w.write();
		
		fangshi1 r = new fangshi1();
		r.read();
	}
//不用方法进行读写文件
	public void write() throws IOException{
	File file = new File("d:/abc.txt");      //File后面记得加上"";
	OutputStream os = new FileOutputStream(file);
	String msg = "努力学习java，好好学习";
		os.write(msg.getBytes());

		os.close();
	}
	private void read() throws IOException {
		File file = new File("d:/abc.txt");
		InputStream is = new FileInputStream(file);//确认输出语句
		byte[]buf = new byte[1024];  //开始读数，按照二进制进行读数
		int len = 0;//确定过程数据存储位置
		while( (len=is.read(buf))!=-1) {  //要存储的数据（len)在输出数据（is）的缓存（buf）中小于0，
			System.out.write(buf,0,len);
			is.close();
			
		}
		


	}

	}




