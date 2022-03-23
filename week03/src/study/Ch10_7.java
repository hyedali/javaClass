package study;

import java.awt.Font;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ch10_7 extends JFrame {
	private JPanel p = new JPanel();
	private JLabel la = new JLabel("Love Java");
	
	Ch10_7(){
		this.setTitle("Ch10_7");
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
		la.addMouseWheelListener(new MyMouseWheelEvent());
	}
	
	class MyMouseWheelEvent implements MouseWheelListener{

		@Override
		public void mouseWheelMoved(MouseWheelEvent e) {
			int n = e.getWheelRotation();
			
			JLabel la = (JLabel) e.getSource();
			Font f = la.getFont();
			int size = f.getSize();
			
			if(n<0) {
				if(size<5) {
					return;
				}
				la.setFont(new Font("Arial", Font.PLAIN, size+5));
			}else {
				la.setFont(new Font("Arial", Font.PLAIN, size-5));
			}
		}
		
	}

	public static void main(String[] args) {
		new Ch10_7();
	}

}
