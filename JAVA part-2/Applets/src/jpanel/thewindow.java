package jpanel;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class thewindow extends JFrame{

	
	private JSlider slider;
	private sliderandoval mypanel;
	public thewindow() {
		super("the title");
		mypanel= new sliderandoval();
		mypanel.setBackground(Color.ORANGE);
		
		slider=new JSlider(SwingConstants.HORIZONTAL, 0	, 200, 10);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				mypanel.SetD(slider.getValue());
			}
		});
		add(slider,BorderLayout.SOUTH);
		add(mypanel,BorderLayout.CENTER);
	}
}
