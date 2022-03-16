package chapter10;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KeyListenerEx extends JFrame {
	private JLabel[] keyMessage = new JLabel[3];
	private JPanel p = new JPanel();
	
	KeyListenerEx(){
		this.setTitle("KeyListener");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHandler();
		
		this.setSize(300,150);
		this.setVisible(true);
		
		//키이벤트를 받기위해서는 이벤트 소스가 포커스를 가져야 한다.
		p.setFocusable(true);
		p.requestFocus();
	}
	
	public void formDesign() {
		this.add(p);
		p.setLayout(new FlowLayout());
		
		keyMessage[0] = new JLabel(" getkeyCode() ");
		keyMessage[1] = new JLabel(" getkeyChar() ");
		keyMessage[2] = new JLabel(" getkeyText() ");
		
		for(int i=0; i<keyMessage.length; i++) {
			p.add(keyMessage[i]);
			keyMessage[i].setOpaque(true);
			//컴포넌트의 바탕색이 보이도록 하기 위해서는 컴포넌트가 불투명하기 지정 될 필요 있음
			keyMessage[i].setBackground(Color.yellow);
		}
	}
	
	class MyKeyListener implements KeyListener{

		@Override
		public void keyTyped(KeyEvent e) {
			System.out.println("KeyTyped...");
		}

		@Override
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			char keyChar = e.getKeyChar();
			
			keyMessage[0].setText(Integer.toString(keyCode));
			keyMessage[1].setText(Character.toString(keyChar));
			keyMessage[2].setText(KeyEvent.getKeyText(keyCode));
			
			System.out.println("KeyPressed...");
		}

		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println("keyReleased...");
		}
		
	}
	
	public void eventHandler() {
		p.addKeyListener(new MyKeyListener());
	}

	public static void main(String[] args) {
		new KeyListenerEx();
	}

}
