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
		//���÷�ʽ���ж�д�ļ�(fnagshi1)
		fangshi1 w = new fangshi1();
		w.write();
		
		fangshi1 r = new fangshi1();
		r.read();
	}
//���÷������ж�д�ļ�
	public void write() throws IOException{
	File file = new File("d:/abc.txt");      //File����ǵü���"";
	OutputStream os = new FileOutputStream(file);
	String msg = "Ŭ��ѧϰjava���ú�ѧϰ";
		os.write(msg.getBytes());

		os.close();
	}
	private void read() throws IOException {
		File file = new File("d:/abc.txt");
		InputStream is = new FileInputStream(file);//ȷ��������
		byte[]buf = new byte[1024];  //��ʼ���������ն����ƽ��ж���
		int len = 0;//ȷ���������ݴ洢λ��
		while( (len=is.read(buf))!=-1) {  //Ҫ�洢�����ݣ�len)��������ݣ�is���Ļ��棨buf����С��0��
			System.out.write(buf,0,len);
			is.close();
			
		}
		


	}

	}




