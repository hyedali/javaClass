package chapter11;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextfiedEx extends JFrame {
	private JPanel p = new JPanel();
	
	TextfiedEx(){
		this.setTitle("TextField");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHendler();
		
		this.setSize(280, 150);
		this.setVisible(true);
	}
	
	public void formDesign() {
		this.add(p); //패널은 기본 배치관리자가 FlowLayout
		
		p.add(new JLabel("이름  "));
		p.add(new JTextField(20));
		p.add(new JLabel("학과  "));
		p.add(new JTextField("컴퓨터공학과",20));
		p.add(new JLabel("주소  "));
		p.add(new JTextField("서울시...",20));
	}
	
	public void eventHendler() {}

	public static void main(String[] args) {
		new TextfiedEx();
	}

}
