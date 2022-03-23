package chapter11;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CheckBoxEventEx extends JFrame implements ItemListener{
	private JPanel p = new JPanel();
	private JCheckBox[] fruits = new JCheckBox[3];
	private String[] names = {"사과", "배", "체리"};
	private JLabel sumLabel;
	
	private int sum = 0;
	
	CheckBoxEventEx(){
		this.setTitle("CheckBox ItemEvent");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHendler();
		
		this.setSize(250, 200);
		this.setVisible(true);
	}
	
	public void formDesign() {
		this.add(p);
		p.add(new JLabel("현재 사과 100원, 배 500원, 체리 20000원"));
		for(int i=0; i<fruits.length; i++) {
			fruits[i] = new JCheckBox(names[i]);
			fruits[i].setBorderPainted(true);
			p.add(fruits[i]);
		}
		sumLabel = new JLabel("현재 0원입니다.");
		p.add(sumLabel);
	}
	
	public void eventHendler() {
		for(int i=0; i<fruits.length; i++) {
			fruits[i].addItemListener(this);
		}
	}

	public static void main(String[] args) {
		new CheckBoxEventEx();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED) {
			if(e.getItem() == fruits[0]) {
				sum = sum + 100;
			}else if(e.getItem() == fruits[1]) {
				sum = sum + 500;
			}else {
				sum = sum + 20000;
			}
		}else {
			if(e.getItem() == fruits[0]) {
				sum = sum - 100;
			}else if(e.getItem() == fruits[1]) {
				sum = sum - 500;
			}else {
				sum = sum - 20000;
			}
		}
		sumLabel.setText("현재 " + sum + "원 입니다.");
	}

}
