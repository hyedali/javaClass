package study;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class LabelEx extends JFrame {
	private JPanel p = new JPanel();
	
	private JLabel TextLabel = new JLabel("����մϴ�.");
	
	ImageIcon beauty = new ImageIcon("images/beauty.jpg");
	private JLabel beautyLabel = new JLabel(beauty);
	
	ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif");
	private JLabel normalIconLabel = new JLabel("��������� ��ȭ�ϼ���", normalIcon, SwingConstants.CENTER);
	
	LabelEx(){
		this.setTitle("LabelȰ��");
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
