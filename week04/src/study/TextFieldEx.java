package study;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextFieldEx extends JFrame {
	private JPanel p = new JPanel();
	
	TextFieldEx(){
		this.setTitle("TextFieldEx");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHandler();
		
		this.setSize(280,150);
		this.setVisible(true);
	}
	
	public void formDesign() {
		this.add(p);
		
		p.add(new JLabel("�̸� "));
		p.add(new JTextField(20)); //â�� �� ���� 20��
		
		p.add(new JLabel("�а� "));
		p.add(new JTextField("��ǻ�Ͱ��а�",20));
		
		p.add(new JLabel("�ּ�"));
		p.add(new JTextField("�����...",20));
	}
	
	public void eventHandler() {}

	public static void main(String[] args) {
		new TextFieldEx();
	}

}
