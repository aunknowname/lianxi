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
		//���㸴��ʱ��
		TestCopyFile file0 = new TestCopyFile() ;  //�ຯ�����ȡֵ
		File file1 = new File("F:/c.TXT") ;
		File file2 = new File("F:/cd.TXT") ;
		long start = System.currentTimeMillis();
		file0.copyFile(file1,file2);
		long end = System.currentTimeMillis();
		System.out.println("��ʱ��"+(end-start)+"����");
		
		
		
		//��һ���ļ��н��ļ����Ƶ���һ���ļ���
		//��������
		//1.Դ�ļ���Ķ���ļ�
		//2.��Դ�ļ��ж�ȡ���ݣ��ļ�������
		//3���߶���д����ֹ���ݹ����ڴ治��
		//4���ͷŹر���Դ

	}
		//�ļ���Ϊ��������,���㸴���ļ�
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


