package study;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderChangeEx extends JFrame {
	private JPanel p = new JPanel();
	private JLabel colorLabel;
	private JSlider[] sl = new JSlider[3];
	
	SliderChangeEx(){
		this.setTitle("SliderChangeEx");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.formDesign();
		this.eventHandler();
		
		this.setSize(300,230);
		this.setVisible(true);
	}
	
	public void formDesign() {
		colorLabel = new JLabel("SLIDER EXAMPLE");
		
		this.add(p);
		
		for(int i=0; i<sl.length; i++) {
			sl[i] = new JSlider(JSlider.HORIZONTAL, 0, 255, 128);
			sl[i].setPaintLabels(true);
			sl[i].setPaintTicks(true);
			sl[i].setPaintTrack(true);
			sl[i].setMajorTickSpacing(50);
			sl[i].setMinorTickSpacing(10);
			
			p.add(sl[i]);
		}
		
		sl[0].setForeground(Color.RED);
		sl[1].setForeground(Color.GREEN);
		sl[2].setForeground(Color.BLUE);
		
		p.add(colorLabel);
		
		int r = sl[0].getValue();
		int g = sl[1].getValue();
		int b = sl[2].getValue();
		
		colorLabel.setOpaque(true);
		colorLabel.setBackground(new Color(r,g,b));
	}
	
	public void eventHandler() {
		for(int i=0; i<sl.length; i++) {
			sl[i].addChangeListener(new ChangeListener() {
				//슬라이더의 값이 변경할 때 호출

				@Override
				public void stateChanged(ChangeEvent e) {
					int r = sl[0].getValue();
					int g = sl[1].getValue();
					int b = sl[2].getValue();
					
					colorLabel.setBackground(new Color(r,g,b));
				}
				
			});
		}
	}

	public static void main(String[] args) {
		new SliderChangeEx();
	}

}
