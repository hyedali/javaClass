package chapter11;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioButtonEx extends JFrame {
	private JPanel p = new JPanel();
	
	//이미지 라디오버튼을 만들기 위해 2개의 이미지 객체 생성
	ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg");
	ImageIcon selectedCherryIcon = new ImageIcon("images/selectedCherry.jpg");
	
	ButtonGroup g = new ButtonGroup(); //버튼 그룹 객체 생성
	
	//라디오 버튼 3개 생성
	JRadioButton apple = new JRadioButton("사과");
	JRadioButton pear = new JRadioButton("배");
	JRadioButton cherry = new JRadioButton("체리", cherryIcon);
	
	RadioButtonEx(){
		this.setTitle("RadioButton");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHendler();
		
		this.setSize(250, 150);
		this.setVisible(true);
	}
	
	public void formDesign() {
		cherry.setBorderPainted(true); //이미지 라디오버튼의 외각선 출력
		cherry.setSelectedIcon(selectedCherryIcon); //선택 상태 이미지 등록
		
		//버튼 그룹에 3개의 라디오버튼 삽입
		g.add(apple);
		g.add(pear);
		g.add(cherry);
		
		this.add(p); //패널 추가
		
		//3개의 라디오버튼 삽입
		p.add(apple);
		p.add(pear);
		p.add(cherry);
	}
	
	public void eventHendler() {}

	public static void main(String[] args) {
		new RadioButtonEx();
	}

}
