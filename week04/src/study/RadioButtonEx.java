package study;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioButtonEx extends JFrame {
	private JPanel p = new JPanel();
	//버튼 그룹 객체 생성
	private ButtonGroup g = new ButtonGroup();
	
	//이미지 라디오버튼을 만들기 위해 2개의 이미지 객체 생성
	ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg");
	ImageIcon selectedCherryIcon = new ImageIcon("images/selectedCherry.jpg");
	
	private JRadioButton apple = new JRadioButton("사과");
	private JRadioButton pear = new JRadioButton("배");
	private JRadioButton cherry = new JRadioButton("체리",cherryIcon);
	
	
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
		
		//버튼 그룹에 라디오버튼 3개 삽입
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
