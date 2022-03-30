package study;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ComboBoxEx extends JFrame {
	private JPanel p = new JPanel();
	private String[] fruits = {"apple","banana","kiwi","mango","pear","peach","berry","strawberry","blackberry"};
	private String[] names = {"kitae","jaemoon","hyosoo","namyun"};
	
	ComboBoxEx(){
		this.setTitle("ComboBoxEx");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHandler();
		
		this.setSize(300,300);
		this.setVisible(true);
	}
	
	public void formDesign() {
		this.add(p);
		
		//���ڿ� �޺��ڽ� ����
		JComboBox<String> strCombo = new JComboBox<String>(fruits);
		p.add(strCombo);
		
		//�� �޺��ڽ� ����
		JComboBox<String> nameCombo = new JComboBox<String>();
		for(int i=0; i<names.length; i++) {
			nameCombo.addItem(names[i]); //�޺��ڽ��� ���ڿ� ������ ����
		}
		p.add(nameCombo);
	}
	
	public void eventHandler() {}

	public static void main(String[] args) {
		new ComboBoxEx();
	}

}
