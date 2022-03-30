package chapter11;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ComboBaxEx extends JFrame {
	private JPanel p = new JPanel();
	private String[] fruits = {"apple", "banana", "kiwi","mango","pear",
			"peach","berry", "strawberry", "blackberry"};
	private String[] names = {"kitae", "jaemoon", "hyosoo", "namyun"};
	
	ComboBaxEx(){
		this.setTitle("ComboBox");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHandler();
		
		this.setSize(300, 300);
		this.setVisible(true);
	}
	
	public void formDesign() {
		this.add(p);
		
		//문자열 콤보박스 생성
		JComboBox<String> strCombo = new JComboBox<String>(fruits);
		p.add(strCombo);
		
		//빈콤보박스 생성
		JComboBox<String> nameCombo = new JComboBox<String>();
		for(int i=0; i<names.length; i++) {
			nameCombo.addItem(names[i]); //콤보박스에 문자열 아이템 삽입
		}
		p.add(nameCombo);
	}
	
	public void eventHandler() {}

	public static void main(String[] args) {
		new ComboBaxEx();
	}

}
