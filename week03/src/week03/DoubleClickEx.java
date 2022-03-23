package week03;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DoubleClickEx extends JFrame {
	private JPanel p = new JPanel();
	
	DoubleClickEx(){
		this.setTitle("Double Click");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHendler();
		
		this.setSize(300, 200);
		this.setVisible(true);
	}
	
	public void formDesign() {
		this.add(p);
	}
	
	public void eventHendler() {
		p.addMouseListener(new MyMouseAdapter());
	}
	
	class MyMouseAdapter extends MouseAdapter{
		public void mouseClicked(MouseEvent e) {
			if(e.getClickCount() == 2) {
				int r = (int)(Math.random()*256);
				int g = (int)(Math.random()*256);
				int b = (int)(Math.random()*256);
				
				p.setBackground(new Color(r,g,b));
			}
		}
	}

	public static void main(String[] args) {
		new DoubleClickEx();
	}

}
