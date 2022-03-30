package study;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class RadioButtonItemEventEx extends JFrame implements ItemListener{
	private JPanel p = new JPanel();
	private JRadioButton[] radio = new JRadioButton[3];
	private String[] text = {"사과", "배", "체리"};
	private ImageIcon[] icon = {
		new ImageIcon("images/apple.jpg"),
		new ImageIcon("images/pear.jpg"),
		new ImageIcon("images/cherry.jpg")
	};
	private JLabel imageLabel = new JLabel();
	private ButtonGroup g = new ButtonGroup();
	
	RadioButtonItemEventEx(){
		this.setTitle("RadioButtonItemEventEx");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHandler();
		
		this.setSize(250,200);
		this.setVisible(true);
	}
	
	public void formDesign() {
		this.add(p, BorderLayout.NORTH);
		p.setBackground(Color.gray);
		
		for(int i=0; i<radio.length; i++) {
			radio[i] = new JRadioButton(text[i]);
			g.add(radio[i]);
			p.add(radio[i]);
		}
		
		this.add(imageLabel, BorderLayout.CENTER);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
	}
	
	public void eventHandler() {
		for(int i=0; i<radio.length; i++) {
			radio[i].addItemListener(this);
		}
	}

	public static void main(String[] args) {
		new RadioButtonItemEventEx();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.DESELECTED) {
			return; //해제된 경우 그냥 그턴
		}
		if(radio[0].isSelected()) {
			imageLabel.setIcon(icon[0]);
		}else if(radio[1].isSelected()) {
			imageLabel.setIcon(icon[1]);
		}else {
			imageLabel.setIcon(icon[2]);
		}
	}

}
