package jack_in_the_box;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.*;

public class JackInTheBox implements ActionListener 
{
	public int a=0;
		public static void main(String[] args) {}
		
		public void showButton()
		{
			JFrame frame = new JFrame("Frame");
			frame.setVisible(true);
		    JButton button = new JButton();
		    frame.add(button);
		    frame.setSize(500, 300);
		
		    button.addActionListener(this);
		    
		}
		
		private void showPicture(String fileName) 
		{
		    try 
		    {
		        JLabel imageLabel = createLabelImage(fileName);
		        JFrame frame = new JFrame();
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.add(imageLabel);
		        frame.pack();
		        frame.setVisible(true);
		    } 
		    
		    catch (Exception e) 
		    {
		        e.printStackTrace();
		    }		    
		}
		private JLabel createLabelImage(String fileName) {
			try 
			{
		            URL imageURL = getClass().getResource(fileName);
		            
			            if (imageURL == null) 
			            {
				       System.err.println("Could not find image " + fileName);
				       return new JLabel();
			            } 
		            
			            else 
			            {
			                Icon icon = new ImageIcon(imageURL);
			                JLabel imageLabel = new JLabel(icon);
			                return imageLabel;
			            }
		            
		     } 
			catch (Exception e) 
				{
			        System.err.println("Could not find image " + fileName);
			        return new JLabel();
			    }
			
		}
		
		private void playSound(String soundFile) 
		{ 
			    try 
			    {
			        AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
			        sound.play();
			    } 
			    
			    catch (Exception e) 
			    {
			        e.printStackTrace();
			    }
		}
		
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			System.out.println("a");
			a++;
			if(a==5)
			{
				createLabelImage("jackInTheBox.png");
				showPicture("jackInTheBox.png");
				playSound("homer-woohoo.wav");
			}
	     }
}
