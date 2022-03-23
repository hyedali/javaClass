package study;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CheckBoxEx extends JFrame {
	private JPanel p = new JPanel();
	
	ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg");
	ImageIcon selectedCherryIcon = new ImageIcon("images/selectedCherryIcon.jpg");
	
	private JCheckBox apple = new JCheckBox("���");
	private JCheckBox pear = new JCheckBox("��");
	private JCheckBox cherry = new JCheckBox("ü��", cherryIcon);
	
	CheckBoxEx(){
		this.setTitle("CheckBox");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHendler();
		
		this.setSize(300, 200);
		this.setVisible(true);
	}
	
	public void formDesign() {
		this.add(p);
		
		p.add(apple);
		p.add(pear);
		p.add(cherry);
		
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectedCherryIcon);
	}
	
	public void eventHendler() {}

	public static void main(String[] args) {
		new CheckBoxEx();
	}

}
