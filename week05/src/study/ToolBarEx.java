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
		ToolTipManager m = ToolTipManager.sharedInstance(); //ToolTipManager객체 리턴
		//m.setEnabled(false); //툴팁이 나타나지 않도록 설정
		m.setInitialDelay(0); //마우스가 올라온지 (1초 후)바로 툴팁이 출력되도록 설정
		m.setDismissDelay(3000); //툴팁이 출력되어 있는 지속시간을 3초로 설정
		
		this.add(p, BorderLayout.NORTH);
		
		JToolBar toolBar = new JToolBar("Kitea Menu");
		toolBar.setBackground(Color.LIGHT_GRAY);
		
		//toolBar.add(new JButton("New"));
		JButton New = new JButton("New");
		New.setToolTipText("파일을 생성합니다.");
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
