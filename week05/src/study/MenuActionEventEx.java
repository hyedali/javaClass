package study;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuActionEventEx extends JFrame implements ActionListener{
	private JLabel imgLabel = new JLabel();
	
	private JMenuBar mb = new JMenuBar();
	private JMenuItem[] menuItem = new JMenuItem[4];
	private String[] itemTitle = {"Load", "Hide", "ReShow", "Exit"};
	private JMenu screen = new JMenu("Screen");
	
	MenuActionEventEx(){
		this.setTitle("Menu�� Action������ ����� ����");
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
		
		mb.add(screen); //�޴��ٿ� Screen�޴� ����
		
		mb.add(new JMenu("Edit"));
		mb.add(new JMenu("Source"));
		mb.add(new JMenu("Project"));
		mb.add(new JMenu("Run"));
		
		this.setJMenuBar(mb); //�޴��ٸ� �����ӿ� ����
		
		this.add(imgLabel);
	}
	
	public void eventHandler() {
		for(int i=0; i<menuItem.length; i++) {
			menuItem[i].addActionListener(this);
		}
	}

	public static void main(String[] args) {
		new MenuActionEventEx();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand(); //����ڰ� ������ �޴��������� ���ڿ� ����
		
		switch(cmd) {
		case "Load":
			if(imgLabel.getIcon() != null) {
				return; //�̹� �ε��� �Ǿ����� ����
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
