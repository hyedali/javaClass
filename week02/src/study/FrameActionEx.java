package study;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameActionEx extends JFrame implements ActionListener{
	private JButton btn = new JButton("Action");
	
	FrameActionEx(){
		this.setTitle("프레임 자체 구현");
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
		btn.addActionListener(this);
	}

	public static void main(String[] args) {
		new FrameActionEx();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(btn.getText().equals("Action")) {
			btn.setText("액션");
		}else {
			btn.setText("Aciton");
		}
	}

}
