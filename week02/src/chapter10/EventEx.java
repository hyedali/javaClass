package chapter10;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

//�̺�Ʈ �����ʸ� ������ ��ü���� ����
public class EventEx extends JFrame implements ActionListener{
	private JButton btn = new JButton("Action");
	
	EventEx(){
		this.setTitle("ActionEvent");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.evnetHandler();
		
		this.setSize(300, 150);
		this.setVisible(true); //1) Ȯ��
	}
	
	public void formDesign() {
		this.setLayout(new FlowLayout());
		this.add(btn); //2) Ȯ�� - ������ �Ϸ�
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
			btn.setText("�׼�");
		}else {
			btn.setText("Action");
		}
	}

}
