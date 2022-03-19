package study_Mouse;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//���糪 2�г� �� �ڷ� �����Ͽ� �����ϱ�
public class IndepMouse extends JFrame {
	private JPanel p = new JPanel();
	private JLabel la = new JLabel("JAVA");
	
	IndepMouse(){
		this.setTitle("�ܺ�Ŭ������ ����");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHendler();
		
		this.setSize(300, 200);
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

	public static void main(String[] args) {
		new IndepMouse();
	}

}

class MyMouseEvent implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		JLabel la = (JLabel)e.getSource();
		
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
