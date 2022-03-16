package chapter10;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyMouseListener_Frame extends JFrame implements KeyListener{
	private JLabel[] la = new JLabel[3];
	private JPanel p = new JPanel();
	
	MyMouseListener_Frame(){
		this.setTitle("MouseEvent");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHandler();
		
		this.setSize(300,150);
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
		p.addKeyListener(this);
	}
	
	public static void main(String[] args) {
		new MyMouseListener_Frame();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("keyTyped...");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		char keyChar = e.getKeyChar();
		
		la[0].setText(Integer.toString(keyCode));
		la[1].setText(Character.toString(keyChar));
		la[2].setText(KeyEvent.getKeyText(keyCode));
		
		System.out.println("keyPressed...");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("keyReleased...");
	}

	

}
