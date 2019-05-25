package sound_effects_machine;

import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SoundBoard implements ActionListener {

	public static void main(String[] args) {}
	Dimension D = new Dimension(200, 200);
	JFrame frame = new JFrame("FrameDemo");
	JPanel panel=new JPanel();

	JButton[] button = new JButton[3];
	public void showButton() 
	{
		frame.setVisible(true);
		frame.add(panel);
		for (int i = 0; i < button.length; i++) 
		{
			String[] name;
			name=new String[3];
			name[0]="1000";
			name[1]="5000";
			name[2]="8000";
			button[i]=new JButton(name[i]);
		}
		
		for (int i = 0; i < button.length; i++) 
		{
			button[i].setPreferredSize(D);
		}
		
		for (int i = 0; i < button.length; i++) 
		{
			panel.add(button[i]);
		}
		for (int i = 0; i < button.length; i++) {
			button[i].addActionListener(this);
		}
		frame.pack();
		
		/*JButton button500 = new JButton();
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
	    button2000.addActionListener(this);*/
    }

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed.equals(button[0])) 
			System.out.println("1");
			playSound("1000.wav");
		if(buttonPressed.equals(button[1])) 
			System.out.println("2");
			playSound("5000.wav");
		if(buttonPressed.equals(button[2])) 
			System.out.println("3");
			playSound("8000.wav");
			
			
	}
	private void playSound(String fileName) {

	    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 

	    sound.play();
	}

}
