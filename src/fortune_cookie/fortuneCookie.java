package fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.*;

public class fortuneCookie implements ActionListener 
{
	
	int rand;
	String[] ab= new String[4];
	
	String messageHolder;
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
		 rand = new Random().nextInt(4);
			ab[1]="Stuff";
			ab[2]="More stuff";
			ab[3]="lorem ipsum";
			ab[0]="consectetur adipiscing elit";
		JOptionPane.showMessageDialog(null, ab[rand]);
		
	}
}
