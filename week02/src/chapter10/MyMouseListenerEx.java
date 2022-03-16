package chapter10;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyMouseListenerEx extends JFrame {
	private JLabel la = new JLabel("Hello");
	private JPanel p = new JPanel();
	
	MyMouseListenerEx(){
		this.setTitle("MouseEvent");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHandler();
		
		this.setSize(250, 250);
		this.setVisible(true);
	}
	
	public void formDesign() {
		this.add(p);
		p.setLayout(null);
		la.setSize(50, 20);
		la.setLocation(30, 30);
		p.add(la);
	}
	public void eventHandler() {
		p.addMouseListener(new MyMouseEvent());
	}
	
	class MyMouseEvent implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			
			la.setLocation(x, y);
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}

	public static void main(String[] args) {
		new MyMouseListenerEx();
	}

}
