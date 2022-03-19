package study_Key;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AdaperKey extends JFrame {
	private JLabel[] la = new JLabel[3];
	private JPanel p = new JPanel();
	
	AdaperKey(){
		this.setTitle("어댑터로 구현");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHendler();
		
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
	
	public void eventHendler() {
		p.addKeyListener(new MyKeyEvent());
	}
	
	class MyKeyEvent extends KeyAdapter{
		public void KeyPressed(KeyEvent e){
			int keyCode = e.getKeyCode();
			char keyChar = e.getKeyChar();
			
			la[0].setText(Integer.toString(keyCode));
			la[1].setText(Character.toString(keyChar));
			la[2].setText(KeyEvent.getKeyText(keyCode));
		}
	}

	public static void main(String[] args) {
		new AdaperKey();
	}

}
