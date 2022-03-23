package chapter11;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CheckBoxEx extends JFrame {
	private JPanel p = new JPanel();
	JCheckBox apple = new JCheckBox("사과");
	JCheckBox pear = new JCheckBox("배", true);
	ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg");
	ImageIcon selectedCherryIcon = new ImageIcon("image/selectedCherry.jpg");
	JCheckBox cherry = new JCheckBox("체리", cherryIcon);
	
	CheckBoxEx(){
		this.setTitle("CheckBox");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHendler();
		
		this.setSize(250, 150);
		this.setVisible(true);
	}
	
	public void formDesign() {
		this.add(p);
		p.add(apple);
		p.add(pear);
		p.add(cherry);
		//cherry.setSelectedIcon("selectedCherryIcon");
	}
	
	public void eventHendler() {}

	public static void main(String[] args) {
		new CheckBoxEx();
	}

}
