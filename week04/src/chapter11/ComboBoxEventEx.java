package chapter11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ComboBoxEventEx extends JFrame {
	JPanel p = new JPanel();
	String[] fruits = {"apple", "banana", "kiwi", "mango"};
	ImageIcon[] images = {
		new ImageIcon("images/apple.jpg"),
		new ImageIcon("images/banana.jpg"),
		new ImageIcon("images/kiwi.jpg"),
		new ImageIcon("images/mango.jpg")
	};
	JLabel imgLabel = new JLabel(images[0]);
	JComboBox<String> strComboBox = new JComboBox<String>(fruits);
	
	ComboBoxEventEx(){
		this.setTitle("ComboBox Event");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHandler();
		
		this.setSize(300, 250);
		this.setVisible(true);
	}
	
	public void formDesign() {
		this.add(p);
		
		p.add(strComboBox);
		p.add(imgLabel);
	}
	
	public void eventHandler() {
		//ActionEvent
//		strComboBox.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				int index = strComboBox.getSelectedIndex();
//				imgLabel.setIcon(images[index]);
//			}
//			
//		});
		
		//ItemEvent
		strComboBox.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				int index = strComboBox.getSelectedIndex();
				String str = (String) strComboBox.getSelectedItem();
				imgLabel.setIcon(images[index]);
				imgLabel.setText(str);
			}
			
		});
	}

	public static void main(String[] args) {
		new ComboBoxEventEx();
	}

}
