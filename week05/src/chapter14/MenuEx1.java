package chapter14;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

//����Ŭ������ ����
public class MenuEx1 extends JFrame {
	private JMenuBar mb = new JMenuBar(); //�޴��� ����
	private JMenu screen = new JMenu("Screen"); //�޴� ����
	private JMenuItem[] menuItem = new JMenuItem[4];
	private String[] itemTitle = {"Load", "Hide", "ReShow", "Exit"};

	private JLabel imgLabel = new JLabel("AAA"); //AAA ���ڿ��� ���� ���̺�
	
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
			String cmd = e.getActionCommand(); //����ڰ� ������ �޴��������� ���ڿ� ����
			
			switch(cmd) { //�޴��������� ���� ����
			case "Load":
				if(imgLabel.getIcon() != null) {
					return; //�̹� �ε��Ǿ����� ����
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
//�޴� ����� ���
//������Ʈ�� ����Ǵ� �̺�Ʈ Ȯ���ϱ�