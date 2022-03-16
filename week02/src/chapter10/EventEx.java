package chapter10;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

//이벤트 리스너를 프레임 자체에서 구현
public class EventEx extends JFrame implements ActionListener{
	private JButton btn = new JButton("Action");
	
	EventEx(){
		this.setTitle("ActionEvent");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.evnetHandler();
		
		this.setSize(300, 150);
		this.setVisible(true); //1) 확인
	}
	
	public void formDesign() {
		this.setLayout(new FlowLayout());
		this.add(btn); //2) 확인 - 디자인 완료
	}
	
	public void evnetHandler() {
		btn.addActionListener(this);
	}

	public static void main(String[] args) {
		new EventEx();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(btn.getText().equals("Action")) {
			btn.setText("액션");
		}else {
			btn.setText("Action");
		}
	}

}
