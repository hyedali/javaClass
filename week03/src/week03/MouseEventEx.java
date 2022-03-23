package week03;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//프레임 자체로 구현
public class MouseEventEx extends JFrame implements MouseListener, MouseMotionListener{
	//필요한 컴포넌트들 선언
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
		this.add(p); //패널의 기본 관리자는 FlowLayout
		p.add(la);
	}
	
	public void eventHendler() {
		//하나의 컴포넌트에 이벤트를 여러개 달아줄 수 있음
		p.addMouseListener(this);
		p.addMouseMotionListener(this);
	}

	public static void main(String[] args) {
		new MouseEventEx();
	}
	
	
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
	//
	@Override
	public void mousePressed(MouseEvent e) {
		la.setText("MousePressed(" + e.getX() + ", " + e.getY() + ")");
	}
	//마우스를 땠을때
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
