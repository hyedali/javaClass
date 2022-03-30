package study;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ListEx extends JFrame {
	private JPanel p = new JPanel();
	private String[] fruits = {"apple","banana","kiwi","mango","pear","peach","berry","strawbarry","blackberry"};
	private ImageIcon[] images = {
		new ImageIcon("images/icon1.png"),
		new ImageIcon("images/icon2.png"),
		new ImageIcon("images/icon3.png"),
		new ImageIcon("images/icon4.png")
	};
	
	
	ListEx(){
		this.setTitle("ListEx");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHandler();
		
		this.setSize(300,300);
		this.setVisible(true);
	}
	
	public void formDesign() {
		this.add(p);
		
		//���ڿ� ����Ʈ ����
		JList<String> srtList = new JList<String>(fruits);
		p.add(srtList);
		
		//�̹��� ����Ʈ ����
		JList<ImageIcon> imageList = new JList<ImageIcon>();
		imageList.setListData(images);
		p.add(imageList);
		
		//���ڿ� ����Ʈ ����
		JList<String> scrollList = new JList<String>(fruits);
		p.add(new JScrollPane(scrollList));
	}
	
	public void eventHandler() {}

	public static void main(String[] args) {
		new ListEx();
	}

}
