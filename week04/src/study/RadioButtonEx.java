package study;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioButtonEx extends JFrame {
	private JPanel p = new JPanel();
	//��ư �׷� ��ü ����
	private ButtonGroup g = new ButtonGroup();
	
	//�̹��� ������ư�� ����� ���� 2���� �̹��� ��ü ����
	ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg");
	ImageIcon selectedCherryIcon = new ImageIcon("images/selectedCherry.jpg");
	
	private JRadioButton apple = new JRadioButton("���");
	private JRadioButton pear = new JRadioButton("��");
	private JRadioButton cherry = new JRadioButton("ü��",cherryIcon);
	
	
	RadioButtonEx(){
		this.setTitle("RadioButtonEx");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHandler();
		
		this.setSize(250,150);
		this.setVisible(true);
	}
	
	public void formDesign() {
		this.add(p);
		
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectedCherryIcon);
		
		//��ư �׷쿡 ������ư 3�� ����
		g.add(apple);
		g.add(pear);
		g.add(cherry);
		
		p.add(apple);
		p.add(pear);
		p.add(cherry);
	}
	
	public void eventHandler() {}

	public static void main(String[] args) {
		new RadioButtonEx();
	}

}
