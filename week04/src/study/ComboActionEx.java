package study;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ComboActionEx extends JFrame {
	private JPanel p = new JPanel();
	private String[] fruits = {"apple","banana","kiwi","mango"};
	private ImageIcon[] images = {
		new ImageIcon("images/apple.jpg"),
		new ImageIcon("images/banana.jpg"),
		new ImageIcon("images/kiwi.jpg"),
		new ImageIcon("images/mango.jpg")
	};
	private JLabel imgLabel = new JLabel(images[0]); //�̹��� ���̺� ������Ʈ
	private JComboBox<String> strCombo = new JComboBox<String>(fruits); //���ڿ� �޺��ڽ�
	private JLabel la = new JLabel("apple");
	
	ComboActionEx(){
		this.setTitle("ComboActionEx");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHandler();
		
		this.setSize(300,250);
		this.setVisible(true);
	}
	
	public void formDesign() {
		this.add(p);
		p.add(strCombo);
		p.add(imgLabel);
		p.add(la);
	}
	
	public void eventHandler() {
		strCombo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String str = (String) strCombo.getSelectedItem();
				//�޺��ڽ��� ���õ� �������� �ε��� ��ȣ �˾Ƴ���
				int idx = strCombo.getSelectedIndex();
				//�ε����� �̹����� �̹��� ���̺� ������Ʈ�� ���
				imgLabel.setIcon(images[idx]);
				la.setText(str);
			}
			
		});
	}

	public static void main(String[] args) {
		new ComboActionEx();
	}

}
