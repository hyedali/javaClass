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
		
		//여기서 키 포커스를 주어야 한다.
		p.setFocusable(true);
		p.requestFocus(); //이벤트를 받는 소스가 무엇인지를 지정해주어야 함.
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
	
	//내부클래스로 이벤트리스너 구현
	class MyMouseAdapter extends MouseAdapter{
		//mousePressed != mousepressed : 자바는 대소문자를 구분함
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
