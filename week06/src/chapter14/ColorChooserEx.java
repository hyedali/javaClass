package chapter14;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

public class ColorChooserEx extends JFrame {
	private JLabel la = new JLabel("Hello");
	JMenuBar mb = new JMenuBar();
	JMenu fileMenu = new JMenu("Text");
	JMenuItem color = new JMenuItem("Color");
	
	ColorChooserEx(){
		this.setTitle("ColorChooser");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHandler();
		
		this.setSize(250,200);
		this.setVisible(true);
	}
	
	public void formDesign() {
		this.setJMenuBar(mb);
		mb.add(fileMenu);
		fileMenu.add(color);
		
		this.add(la);
		la.setHorizontalAlignment(SwingConstants.CENTER);
		la.setFont(new Font("Ravie", Font.ITALIC, 30));
	}
	
	public void eventHandler() {
		color.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				
				if(cmd.equals("Color")) {
					//컬러 다이얼로그를 출력하고 사용자가 선택한 색을 가져온다.
					Color selectColor = JColorChooser.showDialog(null, "Color", Color.yellow);
					//초기 색은 노랑색
					
					if(selectColor != null) {
						la.setForeground(selectColor);
					}
				}
			}
			
		});
	}

	public static void main(String[] args) {
		new ColorChooserEx();
	}

}
