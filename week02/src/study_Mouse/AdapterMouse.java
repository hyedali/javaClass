package study_Mouse;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AdapterMouse extends JFrame {
	private JLabel la =  new JLabel("JAVA");
	private JPanel p = new JPanel();
	
	AdapterMouse(){
		this.setTitle("¾î´ðÅÍ ÀÌ¿ë");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHendler();
		
		this.setSize(300,200);
		this.setVisible(true);
	}
	
	public void formDesign() {
		this.add(p);
		p.setLayout(null);
		
		la.setSize(30,20);
		la.setLocation(30, 30);
		p.add(la);
	}
	
	public void eventHendler() {
		p.addMouseListener(new MyMouseEvent());
	}
	
	class MyMouseEvent extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			
			la.setLocation(x, y);
		}
	}

	public static void main(String[] args) {
		new AdapterMouse();
	}

}
