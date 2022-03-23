package study;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class LabelEx extends JFrame {
	private JPanel p = new JPanel();
	
	private JLabel TextLabel = new JLabel("사랑합니다.");
	
	ImageIcon beauty = new ImageIcon("images/beauty.jpg");
	private JLabel beautyLabel = new JLabel(beauty);
	
	ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif");
	private JLabel normalIconLabel = new JLabel("보고싶은면 전화하세요", normalIcon, SwingConstants.CENTER);
	
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
		
		p.add(TextLabel);
		p.add(beautyLabel);
		p.add(normalIconLabel);
	}
	
	public void eventHendler() {}

	public static void main(String[] args) {
		new LabelEx();
	}

}
