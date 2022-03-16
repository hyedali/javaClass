package chapter10;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class InnerClassListener extends JFrame {
	private JButton btn = new JButton("Action");
	
	InnerClassListener() {
		this.setTitle("Action리스너 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.evnetHandler();
		
		this.setSize(350, 150);
		this.setVisible(true);
	}
	
	public void formDesign() {
		this.setLayout(new FlowLayout());
		this.add(btn);
	}
	
	public void evnetHandler() {
		btn.addActionListener(new MyActionListener());
	}
	
	class MyActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton) e.getSource();
			
			if(b.getText().equals("Action")) {
				b.setText("액션");
			}else {
				b.setText("Action");
			}
			
			InnerClassListener.this.setTitle(b.getText());
		}
		
	}

	public static void main(String[] args) {
		new InnerClassListener();
	}

}
