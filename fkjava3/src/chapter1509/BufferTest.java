package chapter1509;

import java.nio.CharBuffer;

public class BufferTest {
	public static void main(String[] args) {
		CharBuffer buff=CharBuffer.allocate(8);
		System.out.println("capacity: "+buff.capacity());
		System.out.println("limit: "+buff.limit());
		System.out.println("position: "+buff.position());
		//����Ԫ��
		buff.put('a');
		buff.put('b');
		buff.put('c');
		System.out.println("��������Ԫ��֮��position="+buff.position());
		System.out.println("��������Ԫ��֮��limit="+buff.limit());
		//����flip��������
		buff.flip();
		System.out.println("ִ��flip������limit="+buff.limit());
		System.out.println("ִ��flip������position="+buff.position());
		System.out.println("��һ��Ԫ�أ�position=0����"+buff.get());
		System.out.println("ȡ����һ��Ԫ�غ�position="+buff.position());
		System.out.println("�ڶ���Ԫ�أ�position=1����"+buff.get());
		System.out.println("ȡ���ڶ���Ԫ�غ�position="+buff.position());
		buff.clear();
		System.out.println("ִ��clear()֮��limit="+buff.limit());
		System.out.println("ִ��clear()֮��position="+buff.position());
		System.out.println("ִ��clear()�󣬻��������ݲ�û�б������"+"������Ԫ��Ϊ��"+buff.get(2));
		System.out.println("ִ�о��Զ�ȡ��position="+buff.position());
		
	}
}
