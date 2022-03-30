package study;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ListChangeEx extends JFrame {
	private JPanel p = new JPanel();
	private JTextField tf = new JTextField(10);
	private Vector<String> v = new Vector<String>();
	private JList<String> nameList = new JList<String>(v);
	
	ListChangeEx(){
		this.setTitle("ListChangeEx");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHandler();
		
		this.setSize(300,300);
		this.setVisible(true);
	}
	
	public void formDesign() {
		this.add(p);
		
		p.add(new JLabel("이름 입력 후 <Enter>키"));
		p.add(tf);
		
		v.add("황기태");
		v.add("이재문");
		nameList.setVisibleRowCount(5); //리스트가 보여주는 행의 수
		nameList.setFixedCellWidth(100); //리스트의 폭
		
		p.add(nameList);
	}
	
	public void eventHandler() {
		//JTextField에 ActionListener등록, <Enter>키 처리
		tf.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				v.add(tf.getText()); //벡터 v에 입력된 이름 추가
				tf.setText("");
				nameList.setListData(v); //벡터 v에 입력된 모든 이름으로 리스트 새로 만들기
			}
			
		});
	}

	public static void main(String[] args) {
		new ListChangeEx();
	}

}
