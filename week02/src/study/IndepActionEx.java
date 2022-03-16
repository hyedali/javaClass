package study;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
//�ܺ� Ŭ������ ����
public class IndepActionEx extends JFrame {
	private JButton btn = new JButton("Action");
	
	IndepActionEx(){
		this.setTitle("�ܺ�Ŭ������ ����");
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

	public static void main(String[] args) {
		new IndepActionEx();
	}

}

class MyActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		
		if(b.getText().equals("Action")) {
			b.setText("�׼�");
		}else {
			b.setText("Action");
		}
	}
	
}
