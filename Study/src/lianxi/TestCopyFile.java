package lianxi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.omg.CORBA.PUBLIC_MEMBER;

public class TestCopyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//计算复制时间
		TestCopyFile file0 = new TestCopyFile() ;  //类函数里的取值
		File file1 = new File("F:/c.TXT") ;
		File file2 = new File("F:/cd.TXT") ;
		long start = System.currentTimeMillis();
		file0.copyFile(file1,file2);
		long end = System.currentTimeMillis();
		System.out.println("耗时："+(end-start)+"毫秒");
		
		
		
		//从一个文件中将文件复制到另一个文件中
		//操作步骤
		//1.源文件，亩的文件
		//2.从源文件中读取内容，文件输入流
		//3、边读边写，防止内容过大，内存不够
		//4、释放关闭资源

	}
		//文件作为方法参数,计算复制文件
		public void copyFile (File file1,File file2) throws IOException {
			InputStream is = new FileInputStream(file1);
			OutputStream os = new FileOutputStream(file2);
			byte[]buf = new byte[1024];
			int len = 0;
			while ((len=is.read(buf))!=-1){
				os.write(buf,0,len);
				
			};
			os.close();
			is.close();
		}
		

	}


