package chapter140301;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class ProcessorTest {
	public static void process(String clazz) throws ClassNotFoundException{
		int passed=0;
		int failed=0;
		for(Method m:Class.forName(clazz).getMethods()){
			if(m.isAnnotationPresent(Testable.class)){
				try {
					m.invoke(null);
					passed++;
				}  catch (Exception e) {
					System.out.println("����"+m+"����ʧ�ܣ��쳣��"+e.getCause());
					failed++;
				}
			}
		}
		System.out.println("�������ˣ�"+(passed+failed)+"������������:\n�ɹ��ˣ�"+passed+"��\n"+"ʧ���ˣ�"+failed+"��");
	}
}
