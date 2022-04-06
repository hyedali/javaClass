package chapter14;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

//������ ��ü�� ����
public class MenuEx extends JFrame implements ActionListener{
	private JMenuBar mb = new JMenuBar(); //�޴����� ���� ��
	private JMenu screen = new JMenu("Screen"); //�޴��پȿ� �� �޴�
	private JMenuItem[] menuItem = new JMenuItem[4];
	private String[] itemTitle = {"Load", "Hide", "ReShow", "Exit"};
	
	private JLabel imgLabel = new JLabel("aaa");
	
	
	MenuEx(){
		this.setTitle("Menu");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHandler();
		
		this.setSize(205,200);
		this.setVisible(true);
	}
	
	public void formDesign() {
		for(int i=0; i < menuItem.length; i++) {
			menuItem[i] = new JMenuItem(itemTitle[i]);
			screen.add(menuItem[i]);
		}
		
		this.setJMenuBar(mb);
		mb.add(screen);
		
		mb.add(new JMenu("Edit"));
		mb.add(new JMenu("Sourse"));
		mb.add(new JMenu("Project"));
		mb.add(new JMenu("Run"));
		
		this.add(imgLabel);
	}
	
	public void eventHandler() {
		//�̺�Ʈ �ҽ� -> �޴� ������
		for(int i=0; i<menuItem.length; i++) {
			menuItem[i].addActionListener(this);
		}
		
	}

	public static void main(String[] args) {
		new MenuEx();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "Load") {
			if(imgLabel.getIcon() != null) {
				return;
			}
			imgLabel.setIcon(new ImageIcon("images/img.jpg"));
		}else if(e.getActionCommand() == "Hide") {
			imgLabel.setVisible(false); //�Ⱥ��̵���
		}else if(e.getActionCommand() == "ReShow") {
			imgLabel.setVisible(true); //���̵���
		}else {
			System.exit(0);
		}
	}

}
