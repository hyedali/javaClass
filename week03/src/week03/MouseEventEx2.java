package week03;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//내부클래스
public class MouseEventEx2 extends JFrame {
	private JPanel p = new JPanel();
	private JLabel la = new JLabel("No Mouse Event");
	
	MouseEventEx2(){
		this.setTitle("MouseEvent");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHendler();
		
		this.setSize(300, 200);
		this.setVisible(true);
	}
	
	public void formDesign() {
		this.add(p);
		p.add(la);
	}
	
	public void eventHendler() {
		p.addMouseListener(new MyMouseListener());
		p.addMouseMotionListener(new MyMouseListener());
	}
	
	class MyMouseListener implements MouseListener, MouseMotionListener{

		@Override
		public void mouseDragged(MouseEvent e) {
			la.setText("MouseDragged(" + e.getX() + ", " + e.getY() + ")");
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			la.setText("MouseMoved(" + e.getX() + ", " + e.getY() + ")");
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			la.setText("MouseClicked(" + e.getX() + ", " + e.getY() + ")");
		}

		@Override
		public void mousePressed(MouseEvent e) {
			la.setText("MousePressed(" + e.getX() + ", " + e.getY() + ")");
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			la.setText("MouseReleased(" + e.getX() + ", " + e.getY() + ")");
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			p.setBackground(Color.cyan);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			p.setBackground(Color.yellow);
		}
		
	}

	public static void main(String[] args) {
		new MouseEventEx2();
	}

}
