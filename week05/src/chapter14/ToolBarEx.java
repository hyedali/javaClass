package chapter14;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.ToolTipManager;

public class ToolBarEx extends JFrame {
	private JPanel p = new JPanel();
	
	ToolBarEx(){
		this.setTitle("ToolBar");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHandler();
		
		this.setSize(400,200);
		this.setVisible(true);
	}
	
	public void formDesign() {
		//���ٿ� �޴��� ����� ������Ʈ�� ����
		JToolBar tb = new JToolBar("ToolBar Menu");
		tb.setBackground(Color.LIGHT_GRAY);
		
		//ToolTipManager�� �����ð� ����
		ToolTipManager m = ToolTipManager.sharedInstance(); //��ü ����
		m.setInitialDelay(0); //�ʱ� ���� ��������ð��� 0�ʷ� ��
		m.setDismissDelay(3000); //���� ���ӽð� 3�ʷ� ����
		
		//tb.add(new JButton("New"));
		JButton btn = new JButton("New");
		btn.setToolTipText("���ο� ������ ���ϴ�.");
		tb.add(btn);
		
		tb.add(new JButton(new ImageIcon("images/open.jpg")));
		
		tb.add(new JButton(new ImageIcon("images/save.jpg")));
		
		tb.add(new JLabel("search"));
		
		JComboBox cb = new JComboBox();
		cb.addItem("Java");
		cb.addItem("C#");
		cb.addItem("C");
		cb.addItem("C++");
		
		tb.add(cb);
		
		this.add(p, BorderLayout.NORTH);
		p.add(tb);
	}
	
	public void eventHandler() {}
	

	public static void main(String[] args) {
		new ToolBarEx();
	}

}
