package study;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.ToolTipManager;

public class ToolBarEx extends JFrame {
	private JPanel p =new JPanel();
	
	ToolBarEx(){
		this.setTitle("JToolBar");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHandler();
		
		this.setSize(400,200);
		this.setVisible(true);
	}
	
	public void formDesign() {
		ToolTipManager m = ToolTipManager.sharedInstance(); //ToolTipManager��ü ����
		//m.setEnabled(false); //������ ��Ÿ���� �ʵ��� ����
		m.setInitialDelay(0); //���콺�� �ö���� (1�� ��)�ٷ� ������ ��µǵ��� ����
		m.setDismissDelay(3000); //������ ��µǾ� �ִ� ���ӽð��� 3�ʷ� ����
		
		this.add(p, BorderLayout.NORTH);
		
		JToolBar toolBar = new JToolBar("Kitea Menu");
		toolBar.setBackground(Color.LIGHT_GRAY);
		
		//toolBar.add(new JButton("New"));
		JButton New = new JButton("New");
		New.setToolTipText("������ �����մϴ�.");
		toolBar.add(New);
		
		toolBar.add(new JButton(new ImageIcon("images/open.jpg")));
		toolBar.addSeparator();
		toolBar.add(new JButton(new ImageIcon("images/save.jpg")));
		toolBar.add(new JLabel("search"));
		toolBar.add(new JTextField("text field"));
		
		JComboBox<String> combo = new JComboBox<String>();
		combo.addItem("JAVA");
		combo.addItem("C#");
		combo.addItem("C");
		combo.addItem("C++");
		toolBar.add(combo);
		
		p.add(toolBar);
	}
	
	public void eventHandler() {}

	public static void main(String[] args) {
		new ToolBarEx();
	}

}
