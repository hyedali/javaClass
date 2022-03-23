package week03;

import java.awt.Font;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ch10_Ex7 extends JFrame {
	private JPanel p = new JPanel();
	private JLabel la = new JLabel("Love Java");
	
	Ch10_Ex7(){
		this.setTitle("CH10_ex7");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHendler();
		
		this.setSize(300, 200);
		this.setVisible(true);
	}
	
	public void formDesign() {
		this.add(p);
		la.setFont(new Font("Arial", Font.PLAIN, 10));
		p.add(la);
	}
	
	public void eventHendler() {
		/*p.addMouseWheelListener(new MouseWheelListener() {

			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				Font f = la.getFont();
				int size = f.getSize();
				int n = e.getWheelRotation();
				
				if(n<0) {
					la.setFont(new Font("Arial", Font.PLAIN, size+5));
				}else {
					la.setFont(new Font("Arial", Font.PLAIN, size-5));
				}
			}
			
		});*/
		//label위에 마우스를 올렸을때 작동함
		la.addMouseWheelListener(new MouseWheelListener() {

			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				int n = e.getWheelRotation();
				
				if(n<0) {
					JLabel la = (JLabel) e.getSource();
					Font f = la.getFont();
					int size = f.getSize();
					if(size<5) {
						return; //5픽셀 이하로는 작아지지 않도록 하라
					}
					la.setFont(new Font("Arial", Font.PLAIN, size+5));
					
				}else {
					JLabel la = (JLabel) e.getSource();
					Font f = la.getFont();
					int size = f.getSize();
					la.setFont(new Font("Arial", Font.PLAIN, size-5));
				}
			}
			
		});
	}

	public static void main(String[] args) {
		new Ch10_Ex7();
	}

}
