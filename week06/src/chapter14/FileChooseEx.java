package chapter14;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

//JMenuBar -> JMenu -> JMenuItem => ActionListener
//프레임 자체에서 구현
public class FileChooseEx extends JFrame implements ActionListener{
	private JMenuBar mb = new JMenuBar();
	private JMenu fileMenu = new JMenu("File");
	private JMenuItem openItem = new JMenuItem("Open");
	private JMenuItem saveItem = new JMenuItem("Save");
	
	private JLabel imgLabel = new JLabel("AAA");
	
	private JFileChooser fc = new JFileChooser();
	
	private JTextArea ta = new JTextArea();
	
	FileChooseEx(){
		this.setTitle("FileChooser");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHandler();
		
		this.setSize(350,200);
		this.setVisible(true);
	}
	
	public void formDesign() {
		//setJMenuBar = JMenuBar배치
		this.setJMenuBar(mb);
		mb.add(fileMenu);
		fileMenu.add(openItem);
		fileMenu.add(saveItem);
		
		this.add(ta);
	}
	
	public void eventHandler() {
		openItem.addActionListener(this);
		
		saveItem.addActionListener(this);
	}

	public static void main(String[] args) {
		new FileChooseEx();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//e.getSorce() == openItem
		if(e.getActionCommand() == "Open") {
			
			FileNameExtensionFilter filter = new FileNameExtensionFilter("TXT text", "txt");
			fc.setFileFilter(filter);
			
			int ret = fc.showOpenDialog(null); //파일 다이얼로그 출력 null -> 전체 화면을 기준으로 위치를 잡는다.
			
			//
			if(ret != JFileChooser.APPROVE_OPTION) {
				JOptionPane.showMessageDialog(null, "파일을 선택하지 않았습니다.", 
						"경고", JOptionPane.WARNING_MESSAGE); //파일을 선택하지 않으면 
				return;
			}
			
			//사용자가 파일을 선택하고 "열기" 버튼을 누른 경우
			String filePath = fc.getSelectedFile().getPath();
			//imgLabel.setIcon(new ImageIcon(filePath));
			
			try {
				BufferedReader rd = new BufferedReader(new FileReader(filePath));
				
				ta.setText("");
				String line;
				
				while((line = rd.readLine())!= null) {
					ta.append(line + "\n");
				}
				
				rd.close();
			}catch(Exception e1) {
				
			}
			
			
		}else if(e.getActionCommand() == "Save") {
			FileNameExtensionFilter filter = new FileNameExtensionFilter("TXT text", "txt");
			fc.setFileFilter(filter);
			fc.setCurrentDirectory(new File(".\\"));
			
			int ret = fc.showSaveDialog(null);
			
			if(ret != JFileChooser.APPROVE_OPTION) {
				JOptionPane.showMessageDialog(null, "파일을 선택하지 않았습니다.", "경고"
						,JOptionPane.WARNING_MESSAGE);
				return;
			}
			
			String filePath = fc.getSelectedFile().getPath();
			
			try {
				BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
				bw.write(ta.getText());
				bw.close();
			}catch(Exception e1) {
				//JOptionPane.showMessageDialog(this, "연결 실패");
			}
			
		}
	}

}
