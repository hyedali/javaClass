package chapter10;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class IndepClassEx extends JFrame {
	private JButton btn = new JButton("Action");
	
	IndepClassEx() {
		this.setTitle("ActionEvent");
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
		//클릭시 ActionEvent가 발생함
		//1. 이벤트 소스 찾기
		//2. 이벤트를 들을 수 있도록 귀를 달아준다.
		//2-1. 이벤트 객체는 이벤트리스너를 구현해서 만들어준다.(외부클래스)
		//3. 이벤트 객체를 만들어 넣어준다.
	
		btn.addActionListener(new MyActionListener());
	}

	public static void main(String[] args) {
		new IndepClassEx();
	}

}

//외부클래스
//ActionListener : 자바에서 제공하는 api, 인터페이스이므로 추상 메서드를 가지고 있음
class MyActionListener implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		
		if(b.getText().equals("Action")) {
			b.setText("액션");
		}else {
			b.setText("Action");
		}
	}
	
}
