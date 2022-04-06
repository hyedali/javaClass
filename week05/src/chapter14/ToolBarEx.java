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
		//툴바에 메뉴로 사용할 컴포넌트를 삽입
		JToolBar tb = new JToolBar("ToolBar Menu");
		tb.setBackground(Color.LIGHT_GRAY);
		
		//ToolTipManager와 툴팁시간 제어
		ToolTipManager m = ToolTipManager.sharedInstance(); //객체 생성
		m.setInitialDelay(0); //초기 툴팁 출력지연시간을 0초로 함
		m.setDismissDelay(3000); //툴팁 지속시간 3초로 설정
		
		//tb.add(new JButton("New"));
		JButton btn = new JButton("New");
		btn.setToolTipText("새로운 파일을 엽니다.");
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
