package chapter14;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

//내부클래스로 구현
public class MenuEx1 extends JFrame {
	private JMenuBar mb = new JMenuBar(); //메뉴바 생성
	private JMenu screen = new JMenu("Screen"); //메뉴 생성
	private JMenuItem[] menuItem = new JMenuItem[4];
	private String[] itemTitle = {"Load", "Hide", "ReShow", "Exit"};

	private JLabel imgLabel = new JLabel("AAA"); //AAA 문자열을 가진 레이블
	
	MenuEx1(){
		this.setTitle("Menu");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHandler();
		
		this.setSize(250,200);
		this.setVisible(true);
	}
	
	public void formDesign() {
		for(int i=0; i<menuItem.length; i++) {
			menuItem[i] = new JMenuItem(itemTitle[i]);
			screen.add(menuItem[i]);
		}
		this.setJMenuBar(mb);
		mb.add(screen);
		
		mb.add(new JMenuItem("Load"));
		mb.add(new JMenuItem("Source"));
		mb.add(new JMenuItem("Project"));
		mb.add(new JMenuItem("Run"));
		
		this.add(imgLabel);
	}
	
	public void eventHandler() {
		for(int i=0; i<menuItem.length; i++) {
			menuItem[i].addActionListener(new menuActionListener());
		}
	}
	
	class menuActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand(); //사용자가 선택한 메뉴아이템의 문자열 리턴
			
			switch(cmd) { //메뉴아이템의 종류 구분
			case "Load":
				if(imgLabel.getIcon() != null) {
					return; //이미 로딩되었으면 리턴
				}
				imgLabel.setIcon(new ImageIcon("images/img.jpg"));
				break;
			case "Hide":
				imgLabel.setVisible(false);
				break;
			case "ReShow":
				imgLabel.setVisible(true);
				break;
			case "Exit":
				System.exit(0);
				break;
			}
		}
		
	}

	public static void main(String[] args) {
		new MenuEx1();
	}

}
//메뉴 만드는 방법
//컴포넌트에 적용되는 이벤트 확인하기