package chapter140302;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AnnotationTest {
	private JFrame mainWin=new JFrame("ʹ��ע����¼�������");
	@ActionListenerFor(listener=OkListener.class)
	private JButton ok=new JButton("ȷ��");
	@ActionListenerFor(listener=CancelListener.class)
	private JButton cancel=new JButton("ȡ��");
	public void init(){
		JPanel jPanel=new JPanel();
		jPanel.add(ok);
		jPanel.add(cancel);
		mainWin.add(jPanel);
		ActionListenerInstaller.processAnnotations(this);
		mainWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWin.pack();
		mainWin.setVisible(true);
	}
	public static void main(String[] args) {
		new AnnotationTest().init();
	}
}
