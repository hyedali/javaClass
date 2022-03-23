package chapter11;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CheckBoxItemEventEx extends JFrame {
	private JCheckBox[] fruits = new JCheckBox[3];
	private JPanel p = new JPanel();
	private String[] names = {"���", "��", "ü��"};
	private JLabel sumLabel;
	private int sum = 0;
	
	CheckBoxItemEventEx(){
		this.setTitle("CheckBox Item Event");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHendler();
		
		this.setSize(250, 200);
		this.setVisible(true);
	}
	
	public void formDesign() {
		this.add(p);
		p.add(new JLabel("��� 100�� �� 500�� ü�� 20000��"));
		for(int i=0; i<fruits.length; i++) {
			fruits[i] = new JCheckBox(names[i]);
			fruits[i].setBorderPainted(true);
			p.add(fruits[i]);
		}
		sumLabel = new JLabel("���� 0�� �Դϴ�.");
		p.add(sumLabel);
	}
	
	public void eventHendler() {
		for(int i=0; i<fruits.length; i++) {
			fruits[i].addItemListener(new MyItemListener());
		}
	}
	
	class MyItemListener implements ItemListener{
	//	private int sum = 0;

		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED) {
				if(e.getItem() == fruits[0]) {
					sum += 100;
				}else if(e.getItem() == fruits[1]) {
					sum += 500;
				}else {
					sum += 20000;
				}
			}else {
				if(e.getItem() == fruits[0]) {
					sum -= 100;
				}else if(e.getItem() == fruits[1]) {
					sum -= 500;
				}else {
					sum -= 20000;
				}
			}
			sumLabel.setText("���� "+sum+"�� �Դϴ�.");
		}
		
	}

	public static void main(String[] args) {
		new CheckBoxItemEventEx();
	}

}
