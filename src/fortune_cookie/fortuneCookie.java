package fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.*;

public class fortuneCookie implements ActionListener 
{
	
	
	public static void main(String[] args){}
	
	public void showButton() 
	{
		JFrame frame = new JFrame("FrameDemo");
		frame.setVisible(true);
	    JButton button = new JButton();
	    frame.add(button);
	    frame.pack();
	    button.addActionListener(this);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		 int rand = new Random().nextInt(5);
		JOptionPane.showMessageDialog(null, rand);
		
	}
}
