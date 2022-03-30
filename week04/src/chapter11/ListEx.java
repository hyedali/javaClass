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
	JList<String> scrollList = new JList<String>(fruits); //문자열 리스트 생성
	
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
	
		JList<String> strList = new JList<String>(fruits); //문자열 리스트 생성
		p.add(strList);
		
		JList<ImageIcon> imageList = new JList<ImageIcon>(); //이미지 리스트 생성
		imageList.setListData(images);
		p.add(imageList);
		
		//JList<String> scrollList = new JList<String>(fruits); //문자열 리스트 생성
		p.add(new JScrollPane(scrollList)); //리스트를 JScrollPane에 부착
		
		p.add(la);
	}
	
	public void eventHandler() {
		//scrollList에 있는 아이템을 선택하면 la에 나타나게
		//1) 이벤트 소스 : scrollList
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
