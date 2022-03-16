package study;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
//익명중첩클래스
public class AnonymousActionEx extends JFrame {
	private JButton btn = new JButton("Action");
	
	AnonymousActionEx(){
		this.setTitle("First");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHandler();
		
		this.setSize(250, 100);
		this.setVisible(true);
	}
	
	public void formDesign() {
		this.setLayout(new FlowLayout());
		this.add(btn);
	}
	
	public void eventHandler() {
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(btn.getText().equals("Action")) {
					btn.setText("액션");
				}else {
					btn.setText("Action");
				}
			}
			
		});
	}

	public static void main(String[] args) {
		new AnonymousActionEx();
	}

}
