package chapter11;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListEx extends JFrame {
	private JPanel p = new JPanel();
	private String[] fruits = {"apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry", "blackberry"};
	private ImageIcon[] images = {
			new ImageIcon("images/icon1.png"),
			new ImageIcon("images/icon2.png"),
			new ImageIcon("images/icon3.png"),
			new ImageIcon("images/icon4.png")
	};
	private JLabel la = new JLabel("AAA");
	JList<String> scrollList = new JList<String>(fruits); //���ڿ� ����Ʈ ����
	
	ListEx(){
		this.setTitle("List");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHandler();
		
		this.setSize(300, 300);
		this.setVisible(true);
	}
	
	public void formDesign() {
		this.add(p);
	
		JList<String> strList = new JList<String>(fruits); //���ڿ� ����Ʈ ����
		p.add(strList);
		
		JList<ImageIcon> imageList = new JList<ImageIcon>(); //�̹��� ����Ʈ ����
		imageList.setListData(images);
		p.add(imageList);
		
		//JList<String> scrollList = new JList<String>(fruits); //���ڿ� ����Ʈ ����
		p.add(new JScrollPane(scrollList)); //����Ʈ�� JScrollPane�� ����
		
		p.add(la);
	}
	
	public void eventHandler() {
		//scrollList�� �ִ� �������� �����ϸ� la�� ��Ÿ����
		//1) �̺�Ʈ �ҽ� : scrollList
		scrollList.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				String str = scrollList.getSelectedValue();
				la.setText(str);
			}
			
		});
	}

	public static void main(String[] args) {
		new ListEx();
	}

}
