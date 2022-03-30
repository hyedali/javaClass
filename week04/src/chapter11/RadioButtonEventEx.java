package chapter11;

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

//프레임자체로 구현
public class RadioButtonEventEx extends JFrame implements ItemListener{
	private JPanel p;
	private ButtonGroup g;
	private JRadioButton[] radio = new JRadioButton[3];
	private String[] text = {"사과","배", "체리"};
	
	ImageIcon[] images = {
		new ImageIcon("images/apple.jpg"),
		new ImageIcon("images/pear.jpg"),
		new ImageIcon("images/cherry.jpg")
	};
	
	private JLabel imageLabel = new JLabel();
	
	RadioButtonEventEx(){
		this.setTitle("RadioButtonEvent");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHendler();
		
		this.setSize(250, 200);
		this.setVisible(true);
	}
	
	public void formDesign() {
		p = new JPanel();
		this.add(p, BorderLayout.NORTH);
		
		p.setBackground(Color.gray);
		
		g = new ButtonGroup();
		
		for(int i=0; i<radio.length; i++) {
			radio[i] = new JRadioButton(text[i]);
			g.add(radio[i]);
			p.add(radio[i]);
		}
		this.add(imageLabel, BorderLayout.CENTER);
		
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
	}
	
	public void eventHendler() {
		for(int i=0; i<radio.length; i++) {
			radio[i].addItemListener(this);
		}
	}

	public static void main(String[] args) {
		new RadioButtonEventEx();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.DESELECTED) {
			return;
		}
		if(radio[0].isSelected()) {
			imageLabel.setIcon(images[0]);
		}else if(radio[1].isSelected()) {
			imageLabel.setIcon(images[1]);
		}else {
			imageLabel.setIcon(images[2]);
		}
	}

}
