package study_Key;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//2학년때 자료 찾아보기
public class IndepMouse extends JFrame {
	private JLabel[] la = new JLabel[3];
	private JPanel p = new JPanel();

	IndepMouse(){
		this.setTitle("외부클래스로 구현");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHandler();
		
		this.setSize(300, 150);
		this.setVisible(true);
		
		p.setFocusable(true);
		p.requestFocus();
	}
	
	public void formDesign() {
		this.add(p);
		p.setLayout(new FlowLayout());
		
		la[0] = new JLabel(" getKeyCode() ");
		la[1] = new JLabel(" getKeyChar() ");
		la[2] = new JLabel(" getKeyText() ");
		
		for(int i=0; i<la.length; i++) {
			p.add(la[i]);
			la[i].setOpaque(true);
			la[i].setBackground(Color.yellow);
		}
	}
	
	public void eventHandler() {
		p.addKeyListener(new MyKeyEvent());
	}

	public static void main(String[] args) {
		new IndepMouse();
	}

}

class MyKeyEvent implements KeyListener{

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("keyTyped...");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		Object la = (JLabel[])e.getSource();
		
		int keyCode = e.getKeyCode();
		char keyChar = e.getKeyChar();
		
		//la[0].setText(Integer.toString(keyCode));
		//la[1].setText(Character.toString(keyChar));
		//la[2].setText(KeyEvent.getKeyText(keyCode));
		
		System.out.println("keyPressed...");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("keyReleased...");
	}
	
}
