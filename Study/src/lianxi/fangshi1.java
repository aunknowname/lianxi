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
	String xie = "Java��ѧϰ����Ҫһ������";
	os .write(xie.getBytes());
	os.close();
	}
	
	
	public void read() throws IOException{
		File file = new File("F:/c.txt");
		InputStream is = new FileInputStream(file);
		byte[] buf = new byte[1024];
		//���ն����ƶ���������һ��������ȡ���ֽ���
		int len = 0;
		//�Ѷ�ȡ�����ݳ��ȴ���len��
		while((len=is.read(buf))!=-1){
			//����-1�ʹ���û�е��ļ�ĩβ��������ȡ
			System.out.write(buf,0,len);
		}
			is.close();
			
		}
	}
