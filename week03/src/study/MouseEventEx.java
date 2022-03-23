package study;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseEventEx extends JFrame implements MouseListener, MouseMotionListener{
	private JPanel p = new JPanel();
	private JLabel la = new JLabel("No Mouse Event");
	
	MouseEventEx(){
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
		//�Ѱ��� ������Ʈ�� �������� �̺�Ʈ�� �� �� ����
		p.addMouseListener(this);
		p.addMouseMotionListener(this);
	}

	public static void main(String[] args) {
		new MouseEventEx();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		la.setText("mouseDragged(" + e.getX() + ", " + e.getY() + ")");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		la.setText("mouseMoved(" + e.getX() + ", " + e.getY() + ")");
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		la.setText("mouseClicked(" + e.getX() + ", " + e.getY() + ")");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		la.setText("mousePressed(" + e.getX() + ", " + e.getY() + ")");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		la.setText("mouseReleased(" + e.getX() + ", " + e.getY() + ")");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		p.setBackground(Color.cyan);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		p.setBackground(Color.magenta);
	}

}

//Ŭ�� �� ���� ��ġ���� �� ��� : MousePressed -> MouseReleased -> MouseClicked
//Ŭ�� �� �ٸ� ��ġ���� �� ��� : MousePressed -> MouseDragged -> ... -> MouseDragged -> MouseReleased
