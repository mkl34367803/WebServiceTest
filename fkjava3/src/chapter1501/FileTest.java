package chapter1501;

import java.io.File;

public class FileTest {
	public static void main(String[] args) {
		File file=new File("test.txt");
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.getAbsoluteFile());
		System.out.println(file.getAbsolutePath()); //��ȡ����·��
		System.out.println(file.getParent());
		System.out.println(file.getParentFile());
		//file.renameTo(new File("test1.txt"));
		System.out.println(file.getAbsolutePath()); //��ȡ����·��
	}
}
