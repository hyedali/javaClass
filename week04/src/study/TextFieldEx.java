package study;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextFieldEx extends JFrame {
	private JPanel p = new JPanel();
	
	TextFieldEx(){
		this.setTitle("TextFieldEx");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHandler();
		
		this.setSize(280,150);
		this.setVisible(true);
	}
	
	public void formDesign() {
		this.add(p);
		
		p.add(new JLabel("이름 "));
		p.add(new JTextField(20)); //창의 열 개수 20개
		
		p.add(new JLabel("학과 "));
		p.add(new JTextField("컴퓨터공학과",20));
		
		p.add(new JLabel("주소"));
		p.add(new JTextField("서울시...",20));
	}
	
	public void eventHandler() {}

	public static void main(String[] args) {
		new TextFieldEx();
	}

}
