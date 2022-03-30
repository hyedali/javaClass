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
		
		p.add(new JLabel("�̸� �Է� �� <Enter>Ű"));
		p.add(tf);
		
		v.add("Ȳ����");
		v.add("���繮");
		nameList.setVisibleRowCount(5); //����Ʈ�� �����ִ� ���� ��
		nameList.setFixedCellWidth(100); //����Ʈ�� ��
		
		p.add(nameList);
	}
	
	public void eventHandler() {
		//JTextField�� ActionListener���, <Enter>Ű ó��
		tf.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				v.add(tf.getText()); //���� v�� �Էµ� �̸� �߰�
				tf.setText("");
				nameList.setListData(v); //���� v�� �Էµ� ��� �̸����� ����Ʈ ���� �����
			}
			
		});
	}

	public static void main(String[] args) {
		new ListChangeEx();
	}

}
