package chapter11;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class LabelEx extends JFrame {
	private JPanel p = new JPanel();
	private JLabel textLabel = new JLabel("사랑합니다.");
	ImageIcon beauty = new ImageIcon("images/beauty.jpg");
	private JLabel imageLabel = new JLabel(beauty);
	ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif");
	private JLabel label = new JLabel("보고싶으면 전화하세요",normalIcon, SwingConstants.CENTER);
	
	LabelEx(){
		this.setTitle("Label활용");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHendler();
		
		this.setSize(400, 600);
		this.setVisible(true);
	}
	
	public void formDesign() {
		this.add(p);
		p.add(textLabel);
		p.add(imageLabel);
		p.add(label);
	}
	
	public void eventHendler() {}

	public static void main(String[] args) {
		new LabelEx();
	}

}
