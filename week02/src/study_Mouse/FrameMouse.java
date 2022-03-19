package study_Mouse;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrameMouse extends JFrame implements MouseListener{
	private JPanel p = new JPanel();
	private JLabel la = new JLabel("JAVA");
	
	FrameMouse(){
		this.setTitle("프레임 자체로 구현");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHendler();
		
		this.setSize(300, 150);
		this.setVisible(true);
	}
	
	public void formDesign() {
		this.add(p);
		p.setLayout(null);
		la.setSize(50, 20);
		la.setLocation(30, 30);
		p.add(la);
	}
	
	public void eventHendler() {
		p.addMouseListener(this);
	}

	public static void main(String[] args) {
		new FrameMouse();
	}

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
