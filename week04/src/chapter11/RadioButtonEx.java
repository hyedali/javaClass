package chapter11;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioButtonEx extends JFrame {
	private JPanel p = new JPanel();
	
	//�̹��� ������ư�� ����� ���� 2���� �̹��� ��ü ����
	ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg");
	ImageIcon selectedCherryIcon = new ImageIcon("images/selectedCherry.jpg");
	
	ButtonGroup g = new ButtonGroup(); //��ư �׷� ��ü ����
	
	//���� ��ư 3�� ����
	JRadioButton apple = new JRadioButton("���");
	JRadioButton pear = new JRadioButton("��");
	JRadioButton cherry = new JRadioButton("ü��", cherryIcon);
	
	RadioButtonEx(){
		this.setTitle("RadioButton");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHendler();
		
		this.setSize(250, 150);
		this.setVisible(true);
	}
	
	public void formDesign() {
		cherry.setBorderPainted(true); //�̹��� ������ư�� �ܰ��� ���
		cherry.setSelectedIcon(selectedCherryIcon); //���� ���� �̹��� ���
		
		//��ư �׷쿡 3���� ������ư ����
		g.add(apple);
		g.add(pear);
		g.add(cherry);
		
		this.add(p); //�г� �߰�
		
		//3���� ������ư ����
		p.add(apple);
		p.add(pear);
		p.add(cherry);
	}
	
	public void eventHendler() {}

	public static void main(String[] args) {
		new RadioButtonEx();
	}

}
