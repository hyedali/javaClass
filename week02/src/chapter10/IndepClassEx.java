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
		//Ŭ���� ActionEvent�� �߻���
		//1. �̺�Ʈ �ҽ� ã��
		//2. �̺�Ʈ�� ���� �� �ֵ��� �͸� �޾��ش�.
		//2-1. �̺�Ʈ ��ü�� �̺�Ʈ�����ʸ� �����ؼ� ������ش�.(�ܺ�Ŭ����)
		//3. �̺�Ʈ ��ü�� ����� �־��ش�.
	
		btn.addActionListener(new MyActionListener());
	}

	public static void main(String[] args) {
		new IndepClassEx();
	}

}

//�ܺ�Ŭ����
//ActionListener : �ڹٿ��� �����ϴ� api, �������̽��̹Ƿ� �߻� �޼��带 ������ ����
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
