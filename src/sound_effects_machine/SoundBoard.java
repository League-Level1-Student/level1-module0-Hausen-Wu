package sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SoundBoard implements ActionListener {

	public static void main(String[] args) {}
	
	public void showButton() 
	{
		JFrame frame = new JFrame("FrameDemo");
		frame.setVisible(true);
	    JButton button500 = new JButton();
	    JButton button1000 = new JButton();
	    JButton button2000 = new JButton();
	    JPanel sb= new JPanel();
	    button500.setText("500");
	    button1000.setText("1000");
	    button2000.setText("2000");
	    sb.add(button500);
	    sb.add(button1000);
	    sb.add(button2000);
	    sb.setSize(600,600);
	    frame.add(sb);
	    frame.setSize(600,75);
	    button500.addActionListener(this);
	    button1000.addActionListener(this);
	    button2000.addActionListener(this);
    }

	@Override
	public void actionPerformed(ActionEvent e) 
	{

		System.out.println("a");
		
	}

}
