package chapter1801;

class Tester{
	static{
		System.out.println("Tester��ľ�̬��ʼ���飡");
	}
}
public class ClassLoaderTest {
	public static void main(String[] args) throws ClassNotFoundException {
		ClassLoader cl=ClassLoader.getSystemClassLoader();
		cl.loadClass("chapter1801.Tester");
		System.out.println("loading Tester class!");
		Class.forName("chapter1801.Tester");
	}
}
