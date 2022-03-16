package chapter10;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AnonymousClassListener extends JFrame {
	private JButton btn = new JButton("Action");
	
	AnonymousClassListener(){
		this.setTitle("Anonymous");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.evnetHandler();
		
		this.setSize(300, 150);
		this.setVisible(true);
	}
	
	public void formDesign() {
		this.setLayout(new FlowLayout());
		this.add(btn);
	}
	
	public void evnetHandler() {
		//익명중첩클래스로 이벤트 리스너 구현 : 리스너 구현과 생성을 한번에 수행
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(btn.getText().equals("Action")) {
					btn.setText("액션");
				}else {
					btn.setText("Action");
				}
				
//				JButton b = (JButton) e.getSource();
//				
//				if(b.getText().equals("Action")) {
//					b.setText("액션");
//				}else {
//					b.setText("Action");
//				}
				
				//AnonymousClassListener.this.setTitle(b.getText());
			}
			
		});
	}

	public static void main(String[] args) {
		new AnonymousClassListener();
	}

}
