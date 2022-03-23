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
	private String[] names = {"���", "��", "ü��"};
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
		p.add(new JLabel("���� ��� 100��, �� 500��, ü�� 20000��"));
		for(int i=0; i<fruits.length; i++) {
			fruits[i] = new JCheckBox(names[i]);
			fruits[i].setBorderPainted(true);
			p.add(fruits[i]);
		}
		sumLabel = new JLabel("���� 0���Դϴ�.");
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
		sumLabel.setText("���� " + sum + "�� �Դϴ�.");
	}

}
