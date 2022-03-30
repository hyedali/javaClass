package chapter11;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextfiedEx extends JFrame {
	private JPanel p = new JPanel();
	
	TextfiedEx(){
		this.setTitle("TextField");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHendler();
		
		this.setSize(280, 150);
		this.setVisible(true);
	}
	
	public void formDesign() {
		this.add(p); //�г��� �⺻ ��ġ�����ڰ� FlowLayout
		
		p.add(new JLabel("�̸�  "));
		p.add(new JTextField(20));
		p.add(new JLabel("�а�  "));
		p.add(new JTextField("��ǻ�Ͱ��а�",20));
		p.add(new JLabel("�ּ�  "));
		p.add(new JTextField("�����...",20));
	}
	
	public void eventHendler() {}

	public static void main(String[] args) {
		new TextfiedEx();
	}

}
