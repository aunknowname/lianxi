package lianxi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class xiewenjian {

	public static void main(String[] args) throws IOException {
		//д�ļ���Ҫ��������
		//�����ļ��������
		//д�ļ�����
		//�ͷ���Դ������GC�������������������û���ˣ������ջ��ͷſռ�
		File file = new File("f:/a.txt");
		OutputStream os = new FileOutputStream(file);
		String msg = "��ϰ�����\r\n�ҵ��ָ�";   // \r\n�ǻ��з���
		os.write(msg.getBytes());  //���������ֽ���ʽд���ļ���
		os.close();


	}
}
