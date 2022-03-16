package chapter10;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseEventEx extends JFrame {
	private JLabel la = new JLabel("Java");
	private JPanel p = new JPanel();
	
	MouseEventEx(){
		this.setTitle("Mouse Adapter");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHandler();
		
		this.setSize(300, 300);
		this.setVisible(true);
		
		//���⼭ Ű ��Ŀ���� �־�� �Ѵ�.
		p.setFocusable(true);
		p.requestFocus(); //�̺�Ʈ�� �޴� �ҽ��� ���������� �������־�� ��.
	}
	
	public void formDesign() {
		this.add(p);
		p.setLayout(null);
		la.setSize(50, 30);
		la.setLocation(30, 30);
		p.add(la);
	}
	public void eventHandler() {
		p.addMouseListener(new MyMouseAdapter());
	}
	
	//����Ŭ������ �̺�Ʈ������ ����
	class MyMouseAdapter extends MouseAdapter{
		//mousePressed != mousepressed : �ڹٴ� ��ҹ��ڸ� ������
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			
			la.setLocation(x, y);
		}
	}

	public static void main(String[] args) {
		new MouseEventEx();
	}

}
