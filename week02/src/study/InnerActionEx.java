package study;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class InnerActionEx extends JFrame {
	private JButton btn = new JButton("Action");
	
	InnerActionEx(){
		this.setTitle("내부 클래스로 구현");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHandler();
		
		this.setSize(300, 150);
		this.setVisible(true);
	}
	
	public void formDesign() {
		this.setLayout(new FlowLayout());
		this.add(btn);
	}
	
	public void eventHandler() {
		btn.addActionListener(new MyActionListener());
	}
	
	public class MyActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(btn.getText().equals("Action")) {
				btn.setText("액션");
			}else {
				btn.setText("Action");
			}
		}
		
	}

	public static void main(String[] args) {
		new InnerActionEx();
	}

}
